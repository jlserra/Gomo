package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utilities.ConfigUtilities;

import javax.xml.soap.Text;

import static org.testng.Assert.assertEquals;

public class AddNewModemPage extends BasePage{
    MobileDriver driver;

    public AddNewModemPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Click Add a New Modem Button")
    public void clickAddANewModemBtn () throws Exception {

        log.info("Step: Click Add a New Modem Button");
        action.waitForElementToBeClickable("addNewModembtn", ConfigUtilities.Timers.slow);
        action.click("addNewModembtn");
        Assert.assertTrue(action.waitForElementToBeVisible("txtaddNewModem", ConfigUtilities.Timers.verySlow));
        assertEquals(excel.getTestdata("text1"), action.getText("txtaddNewModem"));
        assertEquals(excel.getTestdata("text2"), action.getText("instructiontxt"));
        action.takeSnapShot("User is in Add a New Modem Page");
    }
    @Step("Step: Click Where Can I Find These Modal? link")
    public void verifyWhereCanIFindTheseModal () throws Exception {

        log.info("Step: Click Where Can I Find These Modal? link");
        action.waitForElementToBeClickable("whereCanIFindModallnk", ConfigUtilities.Timers.slow);
        action.click("whereCanIFindModallnk");
        clickMobileNumber();
        clickPrepaidInternetNumber();
        clickOkayGotItBtn();
    }

    @Step("Step: Click Mobile Number")
    public void clickMobileNumber () throws Exception {

        log.info("Step: Click Click Mobile Number");
        action.click("mobileNumberbtn");
        Assert.assertTrue(action.waitForElementToBeVisible("txtdialogMessage", ConfigUtilities.Timers.slow));
        assertEquals(excel.getTestdata("text3"), action.getText("txtdialogMessage"));
        action.takeSnapShot("User is in Mobile Number Page");
    }

    @Step("Step: Click Prepaid Internet Number")
    public void clickPrepaidInternetNumber () throws Exception {

        log.info("Step: Prepaid Internet Number");
        action.click("prepaidInternetbtn");
        Assert.assertTrue(action.waitForElementToBeVisible("txtdialogMessage", ConfigUtilities.Timers.slow));
        assertEquals(excel.getTestdata("text4"), action.getText("txtdialogMessage"));
        action.takeSnapShot("User is in Prepaid Internet Number Page");
    }
    @Step("Step: Click Okay Got It button")
    public void clickOkayGotItBtn () throws Exception {

        log.info("Step: Click Okay Got It button");
        Assert.assertTrue(action.waitForElementToBeClickable("okayGotItbtn", ConfigUtilities.Timers.slow));
        action.click("okayGotItbtn");

    }

    @Step("Step: Enter Mobile Number")
    public void mobileNumberTextField(String text) throws Exception {

        log.info("Step: Enter Mobile Number");
        action.isDisplayed("mobileNumbertxtfld");
        assertEquals(excel.getTestdata("text5"), action.getText("mobileNumbertxtfld"));
        action.click("mobileNumbertxtfld");
        action.sendKeys("mobileNumbertxtfld", text);
        action.takeSnapShot("User entered Mobile Number");
        Assert.assertTrue(action.isEnabled("nextbtn"));
        action.click("nextbtn");


    }

        @Step("Step: Click Promo Subscription toggle")
        public void promoSubscriptiontoggle () throws Exception {

            log.info("Step: Click Promo Subscription toggle");
            assertEquals(excel.getTestdata("text6"), action.getText("promoSubscriptiontxt"));
            assertEquals(excel.getTestdata("text7"), action.getText("promoSubscriptiontxt2"));
            assertEquals(excel.getTestdata("text8"), action.getText("promoSubscriptiontxt3"));
            action.click("promoSubscriptionbtn");
            action.takeSnapShot("User clicked Promo Subscription toggle");
            action.click("addModembtn");


        }

    @Step("Step: Enter Modem NickName")
    public void enterModemNickname (String text) throws Exception {

        log.info("Step: Enter Modem NickName");
        assertEquals(excel.getTestdata("text9"), action.getText("nickNametxt"));
        assertEquals(excel.getTestdata("text10"), action.getText("nickNametxtfld"));
        action.click("nickNametxtfld");
        action.sendKeys("nickNametxtfld", text);
        action.takeSnapShot("User entered a Nickname");
        action.click("nextbtn1");


    }





}
