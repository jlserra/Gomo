package testcases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Listeners(ListenerTestcase.class)
public class GomoTestCase extends BaseTestcase {

    @Test(testName = "VerifyCardPaymentChannel01")
    public static void verifyCardPaymentChannelTest01() throws Exception {
        Assert.assertTrue(verifyCardPaymentChannel(), "Payment method not visible");
    }
//    @Test(testName = "VerifyCardPaymentChannel02")
//    public static void verifyCardPaymentChannelTest02() throws Exception {
//        Assert.assertTrue(verifyCardPaymentChannel(), "Payment method not visible");
//    }
//    @Test(testName = "VerifyCardPaymentChannel03")
//    public static void verifyCardPaymentChannelTest03() throws Exception {
//        Assert.assertTrue(verifyCardPaymentChannel(), "Payment method not visible");
//    }
//    @Test(testName = "VerifyCardPaymentChannel04")
//    public static void verifyCardPaymentChannelTest04() throws Exception {
//        Assert.assertTrue(verifyCardPaymentChannel(), "Payment method not visible");
//    }
//    @Test(testName = "VerifyCardPaymentChannel05")
//    public static void verifyCardPaymentChannelTest05() throws Exception {
//        Assert.assertTrue(verifyCardPaymentChannel(), "Payment method not visible");
//    }
//    @Test(testName = "VerifyCardPaymentChannel06")
//    public static void verifyCardPaymentChannelTest06() throws Exception {
//        Assert.assertTrue(verifyCardPaymentChannel(), "Payment method not visible");
//    }
//    @Test(testName = "VerifyCardPaymentChannel07")
//    public static void verifyCardPaymentChannelTest07() throws Exception {
//        Assert.assertTrue(verifyCardPaymentChannel(), "Payment method not visible");
//    }
//    @Test(testName = "VerifyCardPaymentChannel08")
//    public static void verifyCardPaymentChannelTest08() throws Exception {
//        Assert.assertTrue(verifyCardPaymentChannel(), "Payment method not visible");
//    }
//    @Test(testName = "VerifyCardPaymentChannel09")
//    public static void verifyCardPaymentChannelTest09() throws Exception {
//        Assert.assertTrue(verifyCardPaymentChannel(), "Payment method not visible");
//    }
//    @Test(testName = "VerifyCardPaymentChannel10")
//    public static void verifyCardPaymentChannelTest10() throws Exception {
//        Assert.assertTrue(verifyCardPaymentChannel(), "Payment method not visible");
//    }

    public static boolean verifyCardPaymentChannel() throws Exception{

        boolean visible = false;

        try {

            if (isElementVisible("//android.widget.Button[@content-desc=\"Let's Go!, Let`s Go Label\"]")) {
                log.info("Logging in");
                TouchAction touchAction = new TouchAction(driver);
                touchAction.press(PointOption.point(190, 630)).release().perform();

                log.info("Entering mobile number");
                ((AppiumDriver) driver).getKeyboard().sendKeys("9761247153");
                ((AppiumDriver) driver).getKeyboard().pressKey("\n");

                clickElement("//android.widget.Button[@content-desc=\"Let's Go!, Let`s Go Label\"]");
                isElementVisible("//android.view.View[@content-desc=\"Forgot Pin Button\"]");

                log.info("Entering pin");
                touchAction.press(PointOption.point(190, 750)).release().perform();
                ((AppiumDriver) driver).getKeyboard().sendKeys("111111");

                if (isElementVisible("//android.view.View[@content-desc=\"Skip\"]")) {
                    log.info("Skipping tutorials");
                    clickElement("//android.view.View[@content-desc=\"Skip\"]");
                    clickElement("//android.view.View[@content-desc=\"Done\"]");
                }

            }

            if (isElementVisible("(//android.widget.ImageView)[9]")) {
                clickElement("(//android.widget.ImageView)[9]");
                clickElement("//android.view.View[@content-desc=\"Data Offers, Product Details Button\"]");
                clickElement("//android.widget.Button[@content-desc=\"Shop Now, Shop Item Button\"]");
            }

            clickElement("//android.view.View[@content-desc=\"Buy for P299, Buy Promo Button\"]");
            clickElement("//android.view.View[@content-desc=\"Credit or Debit Card, Credit Card/Debit Card Payment Option Button\"]");
            clickElement("//android.widget.Button[@content-desc=\"Pay P299, Proceed To Payment Details Button\"]");

            DateFormat df = new SimpleDateFormat("MM-dd-yyyy:HH:mm:ss");
            long start = System.currentTimeMillis();
            visible = isElementVisible(60, "//android.widget.FrameLayout[@resource-id=\"ph.gomo.gomoph:id/design_bottom_sheet\"]");
            long finish = System.currentTimeMillis();
            long totalTime = (finish - start) / 1000;

            if (visible) {
                log.info("Total seconds before card payment method is displayed : " + totalTime);
                log.info("Pay via Card visible: " + true);
                log.info("Timestamp: " + df.format(new Date(finish)));
                action.takeSnapShot(finish + " Pay via Card visible: " + true);
            }
            if (!visible && isElementVisible("//android.widget.Button[@content-desc=\"Got it\"]")) {
                log.info("Unable to load card payment method: Unavailable modal is displayed");
                log.info("Pay via Card visible: " + false);
                log.info("Timestamp: " + df.format(new Date(System.currentTimeMillis())));
                action.takeSnapShot(System.currentTimeMillis() + " Pay via Card visible: " + false);
            }
            if (!visible && !isElementVisible("//android.widget.Button[@content-desc=\"Got it\"]")){
                log.info("Timeout Exception : Unable to load card payment method for 60 secs");
                log.info("Timestamp: " + df.format(new Date(finish)));
            }

        } catch (Exception e) {
            action.takeSnapShot( "Error: " + System.currentTimeMillis() + ": " +  e);
        }
        return visible;
    }

    public static void clickElement(String locator) {
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(locator))).click();

    }

    public static boolean isElementVisible(String locator) {
        try {
            return new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(locator))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isElementVisible(int timeout, String locator) {
        try {
            return new WebDriverWait(driver, timeout)
                    .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(locator))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}


//for (int i = 1; i <= 1; i++) {
//
//        if (visible) {
//
//        clickElement("//android.view.View[@content-desc=\"Buy for P299, Buy Promo Button\"]");
//        }
//
//
//        clickElement("//android.view.View[@content-desc=\"Credit or Debit Card, Credit Card/Debit Card Payment Option Button\"]");
//
//        clickElement("//android.widget.Button[@content-desc=\"Pay P299, Proceed To Payment Details Button\"]");
//
//        long start = System.currentTimeMillis();
//        visible = isElementVisible("//android.widget.Button[@content-desc=\"Got it\"]");
//        long finish = System.currentTimeMillis();
//        long totalTime = (finish - start) / 1000;
//
//        if (visible){
//        log.info("Total seconds before unavailable modal is displayed : " + totalTime);
//        action.takeSnapShot("Try no: " + i + ", Pay via Card visible: " + false);
//        log.info("Try no: " + i + ", Pay via Card visible: "  + false);
//        clickElement("//android.widget.Button[@content-desc=\"Got it\"]");
//        } else {
//        if(isElementVisible(20, "//ph.gomo.gomoph:id/recyclerView_paymentMethods")) {
//        long finishCC = System.currentTimeMillis();
//        long totalTimeCC = (finishCC - start) / 1000;
//        log.info("Total seconds before credit card payment is displayed : " + totalTimeCC);
//        action.takeSnapShot("Try no: " + i + ", Pay via Card visible: " + true);
//        log.info("Try no: " + i + ", Pay via Card visible: " + true);
//        } else {
//        log.info("Try no: " + i + ", 20 Second Timeout Reached");
//        log.info("Try no: " + i + ", Pay via Card visible: "  + false);
//        }
//        }
//        }
