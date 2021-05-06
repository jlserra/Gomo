package utilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class OtpUtilities {

    LoggerUtilities log;

    public OtpUtilities(LoggerUtilities log) {
        this.log = log;
    }

    public String getOtp(String mobileNo) {
        // REGISTER SEND OTP
        String API_ENDPOINT = "https://mybusinessappdev.globe.com.ph/staging";

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");

        JSONObject json = new JSONObject();
        json.put("customer_identifier", mobileNo);
        json.put("device_id", "0158EB6A-8BC0-4FDF-B264-3A9A42C46486");
        json.put("sms", true);
        json.put("email", "");
        json.put("silent", false);

        request.body(json.toString());

        Response response = request.post(API_ENDPOINT + "/v2/register/send-otp");
//        System.out.println(response.asString());
        String token = response.getBody().jsonPath().get("results.token");

//        System.out.println("token: " + token);

        // LOGIN V3

        request = RestAssured.given();
        request.header("Content-Type", "application/json");

        JSONObject loginJson = new JSONObject();
        loginJson.put("token", token);
        loginJson.put("code", "");
        loginJson.put("type", "MOBILE_NUMBER");

        request.body(loginJson.toString());

        response = request.post(API_ENDPOINT + "/v3/login/" + mobileNo);
//        System.out.println(response.asString());

        String client_id = response.getBody().jsonPath().get("results.client_id");
        String developer_id = response.getBody().jsonPath().get("results.developer_id");

//        System.out.println("client_id: " + client_id);
//        System.out.println("developer_id: " + developer_id);

        // ACCESS TOKEN V2

        request = RestAssured.given();

        request.param("client_id", client_id);
        request.param("developer_id", developer_id);

        response = request.get(API_ENDPOINT + "/v2/accesstoken");

//        System.out.println(response.asString());

        String access_token = response.getBody().jsonPath().get("results.access_token");

//        System.out.println(access_token);

        // GET OTP

        request = RestAssured.given();

        request.param("msisdn", mobileNo);

        request.header("Authorization", access_token);

        response = request.get(API_ENDPOINT + "/v2/kyc/otp");

//        System.out.println(response.asString());

        String code = response.getBody().jsonPath().get("results.code");

//        System.out.println(code);

        log.info("OTP Code Generated: " + code);

        return code;
    }

}
