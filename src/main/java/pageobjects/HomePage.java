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

    // For Nickname verification
    @Step("Step: Verify if Nickname is Enabled")
    public Boolean verifyNicknameIsDisplayed() throws Exception {
        log.info("Step: Verify if Nickname field is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("txtNickname", ConfigUtilities.Timers.verySlow));
        return action.isDisplayed("txtNickname");
    }

    // For Notification Bell verification
    @Step("Step: Verify if Notification Bell Button is Enabled")
    public Boolean verifyNotificationBellIsEnabled() throws Exception {
        log.info("Step: Verify if Notification Bell Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnNotificationBell", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnNotificationBell");
    }

    // For Notification Bell verification
    @Step("Step: Notification Bell Button")
    public void clickNotificationBell() throws Exception {
        log.info("Step: Click the Notification Bell");
        action.takeSnapShot("User clicked the Notification Bell");
        action.waitForElementToBeClickable("btnNotificationBell",ConfigUtilities.Timers.slow);
        action.click("btnNotificationBell");
    }

    // For Get More Data verification
    @Step("Step: Verify if Get More Data Button is Enabled")
    public Boolean verifyGetMoreDataIsEnabled() throws Exception {
        log.info("Step: Verify if Get More Data Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnGetMoreData", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnGetMoreData");
    }

    // For How To Load verification
    @Step("Step: Verify if How to Load Button is Enabled")
    public Boolean verifyHowToLoadIsEnabled() throws Exception {
        log.info("Step: Verify if How to Load Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnHowToLoad", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnHowToLoad");
    }


    // For Dashboard Balance || Load Wallet verification
    @Step("Step: Verify if Dashboard Balance is Displayed")
    public Boolean verifyDashBoardBalanceIsDisplayed() throws Exception {
        log.info("Step: Verify if Dashboard Balance is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblDashBoardBalance", ConfigUtilities.Timers.slow));
        return action.isDisplayed("lblDashBoardBalance");
    }

    // For Refresh verification
    @Step("Step: Verify if Refresh Button is Enabled")
    public Boolean verifyRefreshIsEnabled() throws Exception {
        log.info("Step: Verify if Refresh Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnRefresh", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnRefresh");
    }

    // For Refresh verification
    @Step("Step: Click Refresh Button")
    public void clickRefreshBtn() throws Exception {
        log.info("Step: Click the Refresh Button");
        action.takeSnapShot("User clicked the Refresh Button");
        action.waitForElementToBeClickable("btnRefresh",ConfigUtilities.Timers.slow);
        action.click("btnRefresh");
    }

    // For Announcement Expand Button verification
    @Step("Step: Verify if Expand Announcement Button is Enabled")
    public Boolean verifyExpandAnnouncementIsEnabled() throws Exception {
        log.info("Step: Verify if Expand Announcement Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnXpandAnnouncement", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnXpandAnnouncement");
    }

    // For Name Label verification
    @Step("Step: Verify if Label Name is Displayed")
    public Boolean verifyLblNameHomePageIsDisplayed() throws Exception {
        log.info("Step: Verify if Label Name is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblNameHomePage", ConfigUtilities.Timers.slow));
        return action.isDisplayed("lblNameHomePage");
    }

    // For Add Modem Button verification
    @Step("Step: Verify if Add Modem button is Enabled")
    public Boolean verifyBtnAddModemIsEnabled() throws Exception {
        log.info("Step: Verify if Add Modem button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnAddModem", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnAddModem");
    }

    // For Add Modem Button verification
    @Step("Step: Notification Bell Button")
    public void clickAddModemBtn() throws Exception {
        log.info("Step: Click the Add Modem Button");
        action.takeSnapShot("User clicked the Notification Bell");
        action.waitForElementToBeClickable("btnAddModem",ConfigUtilities.Timers.slow);
        action.click("btnAddModem");
    }

    @Step("Step: Verify if Prepaid Internet Modems Section is Displayed")
    public Boolean verifyPrpdIntrntModemIsDisPlayed() throws Exception {
        log.info("Step: Verify if Prepaid Internet Modems Section is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPrpdIntrntModem", ConfigUtilities.Timers.verySlow));
        return action.isEnabled("lblPrpdIntrntModem");
    }


    // ****************** STEPS ****************************** //

    @Step("Step: Navigate to Home Page")
    public void navigateToHomePage() throws Exception {
        verifyBtnProceed();
        clickBtnProceed();
        verifyNicknameIsDisplayed();
        verifyNotificationBellIsEnabled();
        verifyGetMoreDataIsEnabled();
        verifyHowToLoadIsEnabled();
        verifyDashBoardBalanceIsDisplayed();
        verifyRefreshIsEnabled();
        verifyExpandAnnouncementIsEnabled();
        verifyLblNameHomePageIsDisplayed();
        action.swipe(ActionUtilities.Direction.UP);
        verifyBtnAddModemIsEnabled();
        verifyPrpdIntrntModemIsDisPlayed();
    }

    @Step("Step: Verify Notification")
    public void verifyNotificationBell() throws Exception {
        verifyNotificationBellIsEnabled();
        clickNotificationBell();
    }

    @Step("Step: Verify Click Add Modem")
    public void verifyClickAddModem() throws Exception {
        verifyBtnAddModemIsEnabled();
        clickAddModemBtn();
    }

    @Step("Step: Verify Click Refresh")
    public void verifyClickRefreshButton() throws Exception {
        verifyRefreshIsEnabled();
        clickRefreshBtn();
    }

}
