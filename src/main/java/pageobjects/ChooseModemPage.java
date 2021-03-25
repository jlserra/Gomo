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
    public void clickCheckBox() throws IOException {
        log.info("Step: Click Policy Checkbox");
        action.takeSnapShot("User clicked the checkbox");
        action.click("policyCheckbox");
    }

    @Step("Step: Verify if Button Next is Enabled")
    public Boolean verifyIfBtnLetsGoEnabled() {
        log.info("Step: Verify if Let's Go Button is Enabled");
        return action.isEnabled("letsGoButton");
    }

    @Step("Step: Let's Go Button")
    public void clickLetsGoBtn() throws IOException {
        log.info("Step: Click Policy Checkbox");
        action.takeSnapShot("User clicked the Let's Go Button");
        action.click("letsGoButton");
    }

    @Step("Step: Skip Page")
    public void clickSkipBtn() throws IOException {
        log.info("Step: Click Policy Checkbox");
        action.takeSnapShot("User skip the page");
        action.click("skipBtn");
    }


    @Step("Step: Verify if Button Next is Enabled")
    public Boolean verifyIfModalPopOutEnabled() {
        log.info("Step: Verify if Let's Go Button is Enabled");
        return action.isEnabled("modalPopOut");
    }

    @Step("Step: Close Button")
    public void clickCloseBtn() throws IOException {
        log.info("Step: Click Close Button");
        action.takeSnapShot("User clicked the Close Button");
        action.waitForElementToBeClickable("closeModalBtn", ConfigUtilities.Timers.normal);
        action.click("closeModalBtn");
    }

    @Step("Step: Modem 1 Button")
    public void clickModemOneBtn() throws IOException {
        log.info("Step: Click First Modem Button");
        action.takeSnapShot("User clicked the First Modem");
        action.waitForElementToBeClickable("modemOneBtn", ConfigUtilities.Timers.normal);
        action.click("modemOneBtn");
    }

    @Step("Step: Modem 2 Button")
    public void clickModemTwoBtn() throws IOException {
        log.info("Step: Click Second Modem Button");
        action.takeSnapShot("User clicked the Second Modem");
        action.waitForElementToBeClickable("modemTwoBtn", ConfigUtilities.Timers.normal);
        action.click("modemTwoBtn");
    }

    @Step("Step: Modem 3 Button")
    public void clickModemThreeBtn() throws IOException {
        log.info("Step: Click Second Third Button");
        action.takeSnapShot("User clicked the Third Modem");
        action.waitForElementToBeClickable("modemThreeBtn", ConfigUtilities.Timers.normal);
        action.click("modemThreeBtn");
    }

    @Step("Step: Modem 4 Button")
    public void clickModemFourBtn() throws IOException {
        log.info("Step: Click Fourth Modem Button");
        action.takeSnapShot("User clicked the Fourth Modem");
        action.waitForElementToBeClickable("modemFourBtn", ConfigUtilities.Timers.normal);
        action.click("modemFourBtn");
    }

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


    //   ================= END OF REFACTORED SECTION =============

    // This object is displayed after entering your nickname

    /*
      TERMS AND AGREEMENT CHECKBOX SECTION
     */
//    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='ph.com.globe.mybusiness:id/cb_kyc_consent_promo_updates']")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement policyCheckbox;
//
//    @Step("Step: Policy Checkbox")
//    public void clickCheckBox() {
//        log.info("Step: Click Policy Checkbox");
//        action.click(policyCheckbox);
//    }

    /*
    This is for Let's Go button in Term Agreement
     */

//    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='ph.com.globe.mybusiness:id/btn_next']")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement letsGoBtn;
//
//    @Step("Step: Policy Let's Go Button")
//    public void clickLetsGoBtn() {
//        log.info("Step: Step: Click Policy Let's Go Button");
//        action.click(letsGoBtn);
//    }

    /*
    This is for Skip link button
     */

//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='ph.com.globe.mybusiness:id/tv_skip']")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement skipBtn;
//
//    @Step("Step: Skip Button in Profile Details")
//    public void clickSkipBtn() {
//        log.info("Step: Click Skip Button in Profile Details");
//        action.click(skipBtn);
//    }

    /*
    This is for Modal Close Button
     */

//    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='ph.com.globe.mybusiness:id/rl_dialog_button_container']")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement closeModalBtn;
//
//    @Step("Step: Close Modal Button")
//    public void clickCloseModalBtn() {
//        log.info("Step: Click Close Modal Button");
//        action.click(closeModalBtn);
//    }

    /*
    This is for the First Modem Selection
     */

//    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement modemOneBtn;
//
//    @Step("Step: Modem1 ")
//    public void clickModemOneBtn() {
//        log.info("Step: Click Modem 1");
//        action.click(modemOneBtn);
//    }

    /*
    This is for the Second Modem Selection
     */

//    @AndroidFindBy(xpath = "//android.widget.ImageView)[2]")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement modemTwoBtn;
//
//    @Step("Step: Modem2 ")
//    public void clickModemTwoBtn() {
//        log.info("Step: Click Modem 2");
//        action.click(modemTwoBtn);
//    }

    /*
    This is for the Third Modem Selection
     */

//    @AndroidFindBy(xpath = "//android.widget.ImageView)[3]")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement modemThreeBtn;
//
//    @Step("Step: Modem 3 ")
//    public void clickModemThreeBtn() {
//        log.info("Step: Click Modem 3");
//        action.click(modemThreeBtn);
//    }

    /*
    This is for the Third Modem Selection
     */

//    @AndroidFindBy(xpath = "//android.widget.ImageView)[4]")
//    @iOSXCUITFindBy(id = "a")
//    private MobileElement modemFourBtn;
//
//    @Step("Step: Modem 4 ")
//    public void clickModemFourBtn() {
//        log.info("Step: Click Modem 4");
//        action.click(modemFourBtn);
//    }


}