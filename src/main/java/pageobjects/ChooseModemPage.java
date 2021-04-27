package pageobjects;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ActionUtilities;
import utilities.ConfigUtilities;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEqualsDeep;
import static org.testng.AssertJUnit.assertTrue;

public class ChooseModemPage extends BasePage {

    MobileDriver driver;

    public ChooseModemPage(MobileDriver driver) {
        this.driver = driver;
    }

    //    ================ REFACTORED SECTION =====================

    @Step("Step: Verify if user is in Get Started Page")
    public boolean verifyIfUserPolicyPage() throws Exception {
        log.info("Step: Verify if user is in Policy Page");
        Assert.assertTrue(action.waitForElementToBeVisible("policyCheckbox", ConfigUtilities.Timers.slow));
        action.takeSnapShot("User is in User Policy Page");
        return action.isDisplayed("policyCheckbox");
    }

    @Step("Step: Policy Checkbox")
    public void clickCheckBox() throws Exception {
        log.info("Step: Click Policy Checkbox");
        action.takeSnapShot("User clicked the checkbox");
        action.waitForElementToBeClickable("policyCheckbox", ConfigUtilities.Timers.normal);
        action.click("policyCheckbox");
    }

    @Step("Step: Verify if Button Next is Enabled")
    public Boolean verifyIfBtnLetsGoEnabled() throws Exception {
        log.info("Step: Verify if Let's Go Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("letsGoButton", ConfigUtilities.Timers.verySlow));
        return action.isEnabled("letsGoButton");
    }

    @Step("Step: Let's Go Button")
    public void clickLetsGoBtn() throws Exception {
        log.info("Step: Click Policy Checkbox");
        action.takeSnapShot("User clicked the Let's Go Button");
        action.waitForElementToBeClickable("letsGoButton", ConfigUtilities.Timers.slow);
        action.click("letsGoButton");
    }

    @Step("Step: Skip Page")
    public void clickSkipBtn() throws Exception {
        log.info("Step: Click Policy Checkbox");
        action.takeSnapShot("User skip the page");
        action.waitForElementToBeClickable("skipBtn", ConfigUtilities.Timers.normal);
        action.click("skipBtn");
    }


    @Step("Step: Verify if Button Next is Enabled")
    public Boolean verifyIfModalPopOutEnabled() throws Exception {
        log.info("Step: Verify if Let's Go Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("modalPopOut", ConfigUtilities.Timers.verySlow));
        return action.isEnabled("modalPopOut");
    }

    @Step("Step: Close Button")
    public void clickCloseBtn() throws Exception {
        log.info("Step: Click Close Button");
        action.takeSnapShot("User clicked the Close Button");
        action.waitForElementToBeClickable("closeModalBtn", ConfigUtilities.Timers.normal);
        action.click("closeModalBtn");
    }

    @Step("Step: Modem 1 Button")
    public void clickModemOneBtn() throws Exception {
        log.info("Step: Click First Modem Button");
        action.takeSnapShot("User clicked the First Modem");
        action.waitForElementToBeClickable("modemOneBtn", ConfigUtilities.Timers.normal);
        action.click("modemOneBtn");
    }

    @Step("Step: Modem 2 Button")
    public void clickModemTwoBtn() throws Exception {
        log.info("Step: Click Second Modem Button");
        action.takeSnapShot("User clicked the Second Modem");
        action.waitForElementToBeClickable("modemTwoBtn", ConfigUtilities.Timers.normal);
        action.click("modemTwoBtn");
    }

    @Step("Step: Modem 3 Button")
    public void clickModemThreeBtn() throws Exception {
        log.info("Step: Click Second Third Button");
        action.takeSnapShot("User clicked the Third Modem");
        action.waitForElementToBeClickable("modemThreeBtn", ConfigUtilities.Timers.normal);
        action.click("modemThreeBtn");
    }

    @Step("Step: Modem 4 Button")
    public void clickModemFourBtn() throws Exception {
        log.info("Step: Click Fourth Modem Button");
        action.takeSnapShot("User clicked the Fourth Modem");
        action.waitForElementToBeClickable("modemFourBtn", ConfigUtilities.Timers.normal);
        action.click("modemFourBtn");
    }

    // ****************** STEPS ****************************** //

    @Step("Step: Verify choosing the first modem")
    public void verifyChooseModemOne() throws Exception {
        verifyIfUserPolicyPage();
        clickCheckBox();
        verifyIfBtnLetsGoEnabled();
        clickLetsGoBtn();
        clickSkipBtn();
        verifyIfModalPopOutEnabled();
        clickCloseBtn();
        clickModemOneBtn();
    }

    @Step("Step: Verify choosing the second modem")
    public void verifyChooseModemTwo() throws Exception {
        verifyIfUserPolicyPage();
        clickCheckBox();
        verifyIfBtnLetsGoEnabled();
        clickLetsGoBtn();
        clickSkipBtn();
        verifyIfModalPopOutEnabled();
        clickCloseBtn();
        clickModemTwoBtn();
    }

    @Step("Step: Verify choosing the third modem")
    public void verifyChooseModemThree() throws Exception {
        verifyIfUserPolicyPage();
        clickCheckBox();
        verifyIfBtnLetsGoEnabled();
        clickLetsGoBtn();
        clickSkipBtn();
        verifyIfModalPopOutEnabled();
        clickCloseBtn();
        clickModemThreeBtn();
    }

    @Step("Step: Verify choosing the fourth modem")
    public void verifyChooseModemFour() throws Exception {
        verifyIfUserPolicyPage();
        clickCheckBox();
        verifyIfBtnLetsGoEnabled();
        clickLetsGoBtn();
        clickSkipBtn();
        verifyIfModalPopOutEnabled();
        clickCloseBtn();
        clickModemFourBtn();
    }
}