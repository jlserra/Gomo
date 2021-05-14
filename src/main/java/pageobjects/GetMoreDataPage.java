package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ActionUtilities;
import utilities.ConfigUtilities;
import utilities.OtpUtilities;

import javax.validation.constraints.AssertTrue;
import java.io.IOException;

public class GetMoreDataPage extends BasePage {

    MobileDriver driver;

    public GetMoreDataPage(MobileDriver driver) {
        this.driver = driver;
    }

// PROMOS TAB
    @Step("Step: Verify if user is in Get More Data Page")
    public Boolean VerifyIfGetMoreDataPage() throws Exception {
        log.info("Step: Verify if user is in Get More Data Page");
        Assert.assertTrue(action.waitForElementToBeVisible("hdrGetMoreData", ConfigUtilities.Timers.normal));
        action.takeSnapShot("User is in Get More Data Page");
        return action.isDisplayed("hdrGetMoreData");

    }

    public void VerifyGetMoreDataSpiel() throws Exception {
        log.info("Step: Verify Get More Data Page Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("spielGetMoreData", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("spiel"), action.getText("spielGetMoreData"));
        action.takeSnapShot("Get More Data Page Spiel");
    }

    public Boolean VerifyIfSubscribeBtnIsEnabled() throws Exception {
        log.info("Step: Verify if Subscribe Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnSubscribe", ConfigUtilities.Timers.slow));
        action.takeSnapShot("Subscribe Button");
        return action.isEnabled("btnSubscribe");
    }

    public void clickSubscribeBtn() throws Exception {
        log.info("Step: Click Subscribe Button");
        Assert.assertTrue(VerifyIfSubscribeBtnIsEnabled());
        action.click("btnSubscribe");
        action.takeSnapShot("Click Subscribe Button");
    }

    public void VerifyDataPromo199() throws Exception {
        log.info("Step: Verify Prepaid Data Promo myBizSurf 199");

        //Data Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataDesc1", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc1"), action.getText("lblPromoDataDesc1"));

        //Data Size
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataSize1", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataSize1"), action.getText("lblPromoDataSize1"));

        //Data Price
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataPrice1", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataPrice1"), action.getText("lblPromoDataPrice1"));

        //Data Validity
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataValidity1", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataValidity1"), action.getText("lblPromoDataValidity1"));

        //Data Add On Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDesc", ConfigUtilities.Timers.normal));
        Assert.assertTrue(action.getText("lblAddOnDesc").contains(excel.getTestdata("addOnDesc")));

        action.takeSnapShot("Get More Data - Promo myBizSurf 199");
    }

    public void VerifyDataPromo599() throws Exception {
        log.info("Step: Verify Prepaid Data Promo myBizSurf 599");

        //Data Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataDesc2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc2"), action.getText("lblPromoDataDesc2"));

        //Data Size
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataSize2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataSize2"), action.getText("lblPromoDataSize2"));

        //Data Price
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataPrice2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataPrice2"), action.getText("lblPromoDataPrice2"));

        //Data Validity
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataValidity2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataValidity2"), action.getText("lblPromoDataValidity2"));

        //Data Add On Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDesc", ConfigUtilities.Timers.normal));
        Assert.assertTrue(action.getText("lblAddOnDesc").contains(excel.getTestdata("addOnDesc")));

        action.takeSnapShot("Get More Data - Promo myBizSurf 599");
    }

    public void VerifyDataPromo799() throws Exception {
        log.info("Step: Verify Prepaid Data Promo myBizSurf 799");

        //Data Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataDesc3", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc3"), action.getText("lblPromoDataDesc3"));

        //Data Size
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataSize3", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataSize3"), action.getText("lblPromoDataSize3"));

        //Data Price
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataPrice3", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataPrice3"), action.getText("lblPromoDataPrice3"));

        //Data Validity
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataValidity3", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataValidity3"), action.getText("lblPromoDataValidity3"));

        //Data Add On Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDesc", ConfigUtilities.Timers.normal));
        Assert.assertTrue(action.getText("lblAddOnDesc").contains(excel.getTestdata("addOnDesc")));

        action.takeSnapShot("Get More Data - Promo myBizSurf 799");
    }

    public void VerifyDataPromo999() throws Exception {
        log.info("Step: Verify Prepaid Data Promo myBizSurf 999");

        //Data Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataDesc4", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc4"), action.getText("lblPromoDataDesc4"));

        //Data Size
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataSize4", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("dataSize4"), action.getText("lblPromoDataSize4"));

        //Data Price
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataPrice4", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataPrice4"), action.getText("lblPromoDataPrice4"));

        //Data Validity
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataValidity4", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataValidity4"), action.getText("lblPromoDataValidity4"));

        //Data Add On Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDesc", ConfigUtilities.Timers.normal));
        Assert.assertTrue(action.getText("lblAddOnDesc").contains(excel.getTestdata("addOnDesc")));

        action.takeSnapShot("Get More Data - Promo myBizSurf 999");
    }

    public void VerifyDataPromo1499() throws Exception {
        log.info("Step: Verify Prepaid Data Promo myBizSurf 1499");

        //Data Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataDesc5", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc5"), action.getText("lblPromoDataDesc5"));

        //Data Size
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataSize5", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataSize5"), action.getText("lblPromoDataSize5"));

        //Data Price
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataPrice5", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataPrice5"), action.getText("lblPromoDataPrice5"));

        //Data Validity
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataValidity5", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataValidity5"), action.getText("lblPromoDataValidity5"));

        //Data Add On Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDesc", ConfigUtilities.Timers.normal));
        Assert.assertTrue(action.getText("lblAddOnDesc").contains(excel.getTestdata("addOnDesc")));

        action.takeSnapShot("Get More Data - Promo myBizSurf 1499");
    }

//ADD ONS TAB
    public Boolean VerifyIfAddonsTabIsEnabled() throws Exception {
        log.info("Step: Verify if Add Ons tab is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnAddOns", ConfigUtilities.Timers.slow));
        action.takeSnapShot("Add Ons tab");
        return action.isEnabled("btnAddOns");
    }

    public void clickAddOns() throws Exception {
        log.info("Step: Click Subscribe Button");
        Assert.assertTrue(VerifyIfAddonsTabIsEnabled());
        action.click("btnAddOns");
        action.takeSnapShot("Click Add Ons tab");
    }

    public void VerifyGetMoreDataAddOnsSpielNoSubscription() throws Exception {
        log.info("Step: Verify Get More Data Add Ons Page Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("spielGetMoreDataAddOns", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("spielNoSubs"), action.getText("spielGetMoreDataAddOns"));
        action.takeSnapShot("Get More Data Add Ons Page Spiel - No Active Subscriptions");
    }

    public void VerifyDataAddOnMyBizEarn() throws Exception {
        log.info("Step: Verify Prepaid Data Add On myBizEarn");

        //Data Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataDesc1", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc1"), action.getText("lblAddOnDataDesc1"));

        //Data Size
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataSize1", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataSize1"), action.getText("lblAddOnDataSize1"));

        //Data Price
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataPrice1", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataPrice1"), action.getText("lblAddOnDataPrice1"));

        //Data Validity
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataValidity1", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataValidity1"), action.getText("lblAddOnDataValidity1"));

        //Data Add On Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDesc1", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("addOnDesc1"), action.getText("lblAddOnDesc1"));

        action.takeSnapShot("Get More Data - Add On myBizEarn");
    }

    public void VerifyDataAddOnMyBizEnjoy() throws Exception {
        log.info("Step: Verify Prepaid Data Add On myBizEnjoy");

        //Data Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataDesc2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc2"), action.getText("lblAddOnDataDesc2"));

        //Data Size
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataSize2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataSize2"), action.getText("lblAddOnDataSize2"));

        //Data Price
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataPrice2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataPrice2"), action.getText("lblAddOnDataPrice2"));

        //Data Validity
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataValidity2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataValidity2"), action.getText("lblAddOnDataValidity2"));

        //Data Add On Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDesc2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("addOnDesc2"), action.getText("lblAddOnDesc2"));

        action.takeSnapShot("Get More Data - Add On myBizEnjoy");
    }

    public void VerifyDataAddOnMyBizProductivity() throws Exception {
        log.info("Step: Verify Prepaid Data Add On myBizProductivity");

        //Data Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataDesc3", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc3"), action.getText("lblAddOnDataDesc3"));

        //Data Size
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataSize3", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataSize3"), action.getText("lblAddOnDataSize3"));

        //Data Price
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataPrice3", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataPrice3"), action.getText("lblAddOnDataPrice3"));

        //Data Validity
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataValidity3", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataValidity3"), action.getText("lblAddOnDataValidity3"));

        //Data Add On Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDesc3", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("addOnDesc3"), action.getText("lblAddOnDesc3"));

        action.takeSnapShot("Get More Data - Add On myBizProductivity");
    }

    public void VerifyDataAddOnMyBizUnwind() throws Exception {
        log.info("Step: Verify Prepaid Data Add On myBizUnwind");

        //Data Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataDesc4", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc4"), action.getText("lblAddOnDataDesc4"));

        //Data Size
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataSize4", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataSize4"), action.getText("lblAddOnDataSize4"));

        //Data Price
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataPrice4", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataPrice4"), action.getText("lblAddOnDataPrice4"));

        //Data Validity
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataValidity4", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataValidity4"), action.getText("lblAddOnDataValidity4"));

        //Data Add On Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDesc4", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("addOnDesc4"), action.getText("lblAddOnDesc4"));

        action.takeSnapShot("Get More Data - Add On myBizUnwind");
    }

    public void VerifyDataAddOnMyBizSurf15() throws Exception {
        log.info("Step: Verify Prepaid Data Add On myBizSurf15");

        //Data Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataDesc5", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc5"), action.getText("lblAddOnDataDesc5"));

        //Data Size
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataSize5", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataSize5"), action.getText("lblAddOnDataSize5"));

        //Data Price
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataPrice5", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataPrice5"), action.getText("lblAddOnDataPrice5"));

        //Data Validity
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDataValidity5", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataValidity5"), action.getText("lblAddOnDataValidity5"));

        //Data Add On Description
        Assert.assertTrue(action.waitForElementToBeVisible("lblAddOnDesc5", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("addOnDesc5"), action.getText("lblAddOnDesc5"));


        action.takeSnapShot("Get More Data - Add On myBizSurf15");
    }

//SMS CODE VERIFICATION
    public Boolean VerifyIfSMSVerificationPage() throws Exception {
        log.info("Step: Verify if SMS Verification Page");
        Assert.assertTrue(action.waitForElementToBeVisible("lblOTPHeader", ConfigUtilities.Timers.normal));
        action.takeSnapShot("User is in SMS Verification Page");
        return action.isDisplayed("lblOTPHeader");
    }

    @Step("Step: Enter OTP")
    public void enterOTP(String mobileNumber) throws Exception {

        //get OTP
        String generatedOTP = otp.getOtp(mobileNumber);

        for (char c : generatedOTP.toCharArray()) {
            log.info("Step: Enter OTP " + c);
            switch (c) {
                case '1':
                    action.click("btnOTP1");
                    break;
                case '2':
                    action.click("btnOTP2");
                    break;
                case '3':
                    action.click("btnOTP3");
                    break;
                case '4':
                    action.click("btnOTP4");
                    break;
                case '5':
                    action.click("btnOTP5");
                    break;
                case '6':
                    action.click("btnOTP6");
                    break;
                case '7':
                    action.click("btnOTP7");
                    break;
                case '8':
                    action.click("btnOTP8");
                    break;
                case '9':
                    action.click("btnOTP9");
                    break;
                case '0':
                    action.click("btnOTP0");
                    break;
            }
            action.implicitlyWait(ConfigUtilities.Timers.fast);
        }
    }

    @Step("Step: Verify if Expired OTP Error Message is Displayed")
    public Boolean VerifyIfExpiredOTPErrMsgIsDisplayed() throws Exception {
        log.info("Step: Verify if Expired OTP Error Message is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("errMsgExpiredOTP", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Expired OTP Error Message is Displayed");
        return action.isDisplayed("errMsgExpiredOTP");
    }

    @Step("Step: Click OK Button")
    public void clickOK() throws Exception {
        log.info("Step: Click OK Button");
        Assert.assertTrue(VerifyIfExpiredOTPErrMsgIsDisplayed());
        action.click("btnOK");
        action.takeSnapShot("Click OK Button");
    }

//TEST STEPS
    public void VerifyGetMoreDataPromosPage() throws Exception {
        log.info("Step: Verify Get More Data - Promos Page");
        VerifyGetMoreDataSpiel();
        Assert.assertTrue(VerifyIfSubscribeBtnIsEnabled());
        VerifyDataPromo199();
        VerifyDataPromo599();
        VerifyDataPromo799();
        action.swipe(ActionUtilities.Direction.UP);
        VerifyDataPromo999();
        VerifyDataPromo1499();
    }

    public void VerifyGetMoreDataAddOnsPageNoSubscription() throws Exception {
        log.info("Step: Verify Get More Data - Add Ons Page");
        clickAddOns();
        VerifyGetMoreDataAddOnsSpielNoSubscription();
        Assert.assertFalse(VerifyIfSubscribeBtnIsEnabled());
        VerifyDataAddOnMyBizEarn();
        VerifyDataAddOnMyBizEnjoy();
        VerifyDataAddOnMyBizProductivity();
        action.swipe(ActionUtilities.Direction.UP);
        VerifyDataAddOnMyBizUnwind();
        VerifyDataAddOnMyBizSurf15();
    }

    public void VerifySMSVerificationPage() throws Exception {
        log.info("Step: Verify Get More Data - SMS Verification Page");
        clickSubscribeBtn(); //first subscribe btn
        VerifyIfSMSVerificationPage();
    }

}
