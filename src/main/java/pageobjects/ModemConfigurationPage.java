package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ConfigUtilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ModemConfigurationPage extends BasePage{

    MobileDriver driver;

    public ModemConfigurationPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Verify if Button I'm Already Connected is Enabled")
    public Boolean verifyUserAlreadyConnectedBtnIsEnabled() throws Exception {
        log.info("Step: Verify I'm Already Connected Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("imAlreadyConnBtn", ConfigUtilities.Timers.slow));
        return action.isEnabled("imAlreadyConnBtn");
    }

    @Step("Step: I'm Already Connected Button")
    public void clickUserAlreadyConnectedBtn() throws Exception {
        log.info("Step: Click the I'm Already Connected Button");
        action.takeSnapShot("User clicked the I'm already Connected button");
        action.waitForElementToBeClickable("imAlreadyConnBtn",ConfigUtilities.Timers.slow);
        action.click("imAlreadyConnBtn");
    }

    @Step("Step: Verify if Button Show Me How To Connect is Enabled")
    public Boolean verifyShowMeHowToConnectBtnIsEnabled() throws Exception {
        log.info("Step: Verify Show Me How To Connect is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("showMeHowToConnBtn", ConfigUtilities.Timers.slow));
        return action.isEnabled("showMeHowToConnBtn");
    }

    @Step("Step: Show Me How To Connect Button")
    public void clickShowMeHowToConnectBtn() throws Exception {
        log.info("Step: Click the Show Me How To Connect Button");
        action.takeSnapShot("User clicked the Show Me How To Connect button");
        action.waitForElementToBeClickable("showMeHowToConnBtn",ConfigUtilities.Timers.slow);
        action.click("showMeHowToConnBtn");
    }

    @Step("Step: Verify if Button Next Step is Enabled")
    public Boolean verifyBtnNext1IsEnabled() throws Exception {
        log.info("Step: Verify if Button Next Step is Enabled");
        action.implicitlyWait();
        Assert.assertTrue(action.waitForElementToBeVisible("btnNextStep1", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnNextStep1");
    }

    @Step("Step: Next Step Button")
    public void clickNxtStpBtn() throws Exception {
        log.info("Step: Click the Next Step Button");
        action.takeSnapShot("User clicked Next Step button");
        action.waitForElementToBeClickable("btnNextStep1",ConfigUtilities.Timers.slow);
        action.click("btnNextStep1");
    }

    @Step("Step: Verify if Button Next Step is Enabled")
    public Boolean verifyBtnNext2IsEnabled() throws Exception {
        log.info("Step: Verify if Button Next Step is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnNextStep2", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnNextStep2");
    }

    @Step("Step: Next Step Button")
    public void clickNxtStp2Btn() throws Exception {
        log.info("Step: Click the Next Step Button");
        action.takeSnapShot("User clicked Next Step button");
        action.waitForElementToBeClickable("btnNextStep2",ConfigUtilities.Timers.slow);
        action.click("btnNextStep2");
    }

    @Step("Step: Verify if Button Connect Now is Enabled")
    public Boolean verifyBtnConnectNow() throws Exception {
        log.info("Step: Verify if Button Connect Now is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnConnectNow", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnConnectNow");
    }

    @Step("Step: Connect Now Button")
    public void clickConnectNowBtn() throws Exception {
        log.info("Step: Click the Connect Now Button");
        action.takeSnapShot("User clicked Connect Now button");
        action.waitForElementToBeClickable("btnConnectNow",ConfigUtilities.Timers.slow);
        action.click("btnConnectNow");
    }

    @Step("Step: Verify if Button Manually Verify Account is Enabled")
    public Boolean verifyBtnManuallyVerifyAccnt() throws Exception {
        log.info("Step: Verify if Manually Verify Account button Now is Enabled");
        action.implicitlyWait(ConfigUtilities.Timers.superslow);
        Assert.assertTrue(action.waitForElementToBeVisible("btnManuallyVerifyAccnt", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnManuallyVerifyAccnt");
    }

    @Step("Step: Manually Verify Account Button")
    public void clickBtnManuallyVerifyAccnt() throws Exception {
        log.info("Step: Click the Manually Verify Account Button");
        action.takeSnapShot("User clicked Manually Verify Account button");
        action.waitForElementToBeClickable("btnManuallyVerifyAccnt",ConfigUtilities.Timers.slow);
        action.click("btnManuallyVerifyAccnt");
    }

    @Step("Step: Verify if Button Skip For Now is Enabled")
    public Boolean verifyBtnSkipForNow() throws Exception {
        log.info("Step: Verify if Skip For Now button Now is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnSkipForNow", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnSkipForNow");
    }

    @Step("Step: Skip For Now Button")
    public void clickBtnSkipForNow() throws Exception {
        log.info("Step: Click the Skip For Now Button");
        action.takeSnapShot("User clicked Skip For Now button");
        action.waitForElementToBeClickable("btnSkipForNow",ConfigUtilities.Timers.slow);
        action.click("btnSkipForNow");
    }

    // **************** TEST STEPS **************

    @Step("Step: Verify User Already Connected button")
    public void verifyUserAlreadyConnected() throws Exception {
        verifyUserAlreadyConnectedBtnIsEnabled();
        clickUserAlreadyConnectedBtn();
        verifyBtnManuallyVerifyAccnt();
        clickBtnManuallyVerifyAccnt();
        verifyBtnSkipForNow();
        clickBtnSkipForNow();
    }

    @Step("Step: Verify Show Me How to Connect button")
    public void verifyShowMeHowToConnect() throws Exception {
        verifyShowMeHowToConnectBtnIsEnabled();
        clickShowMeHowToConnectBtn();
        verifyBtnNext1IsEnabled();
        clickNxtStpBtn();
        verifyBtnNext2IsEnabled();
        clickNxtStp2Btn();
        verifyBtnConnectNow();
        clickConnectNowBtn();
    }
}
