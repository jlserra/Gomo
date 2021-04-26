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
    public Boolean verifyBtnProceed() {
        log.info("Step: Verify if Proceed button Now is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnProceed", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnProceed");
    }

    @Step("Step: Proceed Button")
    public void clickBtnProceed() throws IOException {
        log.info("Step: Click the Proceed Button");
        action.takeSnapShot("User clicked Proceed button");
        action.waitForElementToBeClickable("btnProceed",ConfigUtilities.Timers.slow);
        action.click("btnProceed");
    }

    @Step("Step: Verify if Nickname is Enabled")
    public Boolean verifyNicknameIsDisplayed() {
        log.info("Step: Verify if Nickname field is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("txtNickname", ConfigUtilities.Timers.verySlow));
        return action.isDisplayed("txtNickname");
    }


    @Step("Step: Verify if Notification Bell Button is Enabled")
    public Boolean verifyNotificationBellIsEnabled() {
        log.info("Step: Verify if Notification Bell Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnNotificationBell", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnNotificationBell");
    }

    @Step("Step: Notification Bell Button")
    public void clickNotificationBell() throws IOException {
        log.info("Step: Click the Notification Bell");
        action.takeSnapShot("User clicked the Notification Bell");
        action.waitForElementToBeClickable("btnNotificationBell",ConfigUtilities.Timers.slow);
        action.click("btnNotificationBell");
    }

    @Step("Step: Verify if Get More Data Button is Enabled")
    public Boolean verifyGetMoreDataIsEnabled() {
        log.info("Step: Verify if Get More Data Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnGetMoreData", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnGetMoreData");
    }

    @Step("Step: Verify if How to Load Button is Enabled")
    public Boolean verifyHowToLoadIsEnabled() {
        log.info("Step: Verify if How to Load Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnHowToLoad", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnHowToLoad");
    }


    @Step("Step: Verify if Dashboard Balance is Displayed")
    public Boolean verifyDashBoardBalanceIsDisplayed() {
        log.info("Step: Verify if Dashboard Balance is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblDashBoardBalance", ConfigUtilities.Timers.slow));
        return action.isDisplayed("lblDashBoardBalance");
    }

    @Step("Step: Verify if Refresh Button is Enabled")
    public Boolean verifyRefreshIsEnabled() {
        log.info("Step: Verify if Refresh Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnRefresh", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnRefresh");
    }


    @Step("Step: Verify if Expand Announcement Button is Enabled")
    public Boolean verifyExpandAnnouncementIsEnabled() {
        log.info("Step: Verify if Expand Announcement Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnXpandAnnouncement", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnXpandAnnouncement");
    }

    @Step("Step: Verify if Label Name is Displayed")
    public Boolean verifyLblNameHomePageIsDisplayed() {
        log.info("Step: Verify if Label Name is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblNameHomePage", ConfigUtilities.Timers.slow));
        return action.isDisplayed("lblNameHomePage");
    }

    @Step("Step: Verify if Add Modem button is Enabled")
    public Boolean verifyBtnAddModemIsEnabled() {
        log.info("Step: Verify if Add Modem button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnAddModem", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnAddModem");
    }

//    @Step("Step: Verify if Prepaid Internet Modems Section is Displayed")
//    public Boolean verifyPrpdIntrntModemIsDisPlayed() {
//        log.info("Step: Verify if Prepaid Internet Modems Section is Displayed");
//
//        Assert.assertTrue(action.waitForElementToBeVisible("lblPrpdIntrntModem", ConfigUtilities.Timers.verySlow));
//        return action.isEnabled("lblPrpdIntrntModem");
//    }


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
    }

    @Step("Step: Verify Notification")
    public void verifyNotificationBell() throws Exception {
        verifyNotificationBellIsEnabled();
        clickNotificationBell();
    }

}
