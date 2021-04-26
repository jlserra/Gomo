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

public class HomePage extends BasePage{

    MobileDriver driver;

    public HomePage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Verify if Button Proceed is Enabled")
    public Boolean verifyBtnProceed() throws Exception {
        log.info("Step: Verify if Proceed button Now is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnProceed", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnProceed");
    }

    @Step("Step: Proceed Button")
    public void clickBtnProceed() throws Exception {
        log.info("Step: Click the Proceed Button");
        action.takeSnapShot("User clicked Proceed button");
        action.waitForElementToBeClickable("btnProceed",ConfigUtilities.Timers.slow);
        action.click("btnProceed");
    }

    @Step("Step: Verify if Nickname is Enabled")
    public Boolean verifyNicknameIsDisplayed() throws Exception {
        log.info("Step: Verify if Nickname field is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("txtNickname", ConfigUtilities.Timers.verySlow));
        return action.isDisplayed("txtNickname");
    }


    @Step("Step: Verify if Notification Bell Button is Enabled")
    public Boolean verifyNotificationBellIsEnabled() throws Exception {
        log.info("Step: Verify if Notification Bell Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnNotificationBell", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnNotificationBell");
    }

    @Step("Step: Notification Bell Button")
    public void clickNotificationBell() throws Exception {
        log.info("Step: Click the Notification Bell");
        action.takeSnapShot("User clicked the Notification Bell");
        action.waitForElementToBeClickable("btnNotificationBell",ConfigUtilities.Timers.slow);
        action.click("btnNotificationBell");
    }

    // ****************** STEPS ****************************** //

    @Step("Step: Navigate to Home Page")
    public void navigateToHomePage() throws Exception {
        verifyBtnProceed();
        clickBtnProceed();
    }

    @Step("Step: Verify Nickname")
    public void verifyNickname() throws Exception {
        verifyNicknameIsDisplayed();
    }

    @Step("Step: Verify Notification")
    public void verifyNotificationBell() throws Exception {
        verifyNotificationBellIsEnabled();
        clickNotificationBell();
    }


}
