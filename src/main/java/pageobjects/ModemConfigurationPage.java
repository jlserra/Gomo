package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ConfigUtilities;

import java.io.IOException;

public class ModemConfigurationPage extends BasePage{

    MobileDriver driver;

    public ModemConfigurationPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Verify if Button I'm Already Connected is Enabled")
    public Boolean verifyUserAlreadyConnectedBtnIsEnabled() {
        log.info("Step: Verify I'm Already Connected Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("imAlreadyConnBtn", ConfigUtilities.Timers.slow));
        return action.isEnabled("imAlreadyConnBtn");
    }

    @Step("Step: I'm Already Connected Button")
    public void clickUserAlreadyConnectedBtn() throws IOException {
        log.info("Step: Click the I'm Already Connected Button");
        action.takeSnapShot("User clicked the I'm already Connected button");
        action.waitForElementToBeClickable("imAlreadyConnBtn",ConfigUtilities.Timers.slow);
        action.click("imAlreadyConnBtn");
    }

    @Step("Step: Verify if Button Show Me How To Connect is Enabled")
    public Boolean verifyShowMeHowToConnectBtnIsEnabled() {
        log.info("Step: Verify Show Me How To Connect is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("showMeHowToConnBtn", ConfigUtilities.Timers.slow));
        return action.isEnabled("showMeHowToConnBtn");
    }

    @Step("Step: Show Me How To Connect Button")
    public void clickShowMeHowToConnectBtn() throws IOException {
        log.info("Step: Click the Show Me How To Connect Button");
        action.takeSnapShot("User clicked the Show Me How To Connect button");
        action.waitForElementToBeClickable("showMeHowToConnBtn",ConfigUtilities.Timers.slow);
        action.click("showMeHowToConnBtn");
    }

    @Step("Step: Verify if Button Next Step is Enabled")
    public Boolean verifyBtnNext1IsEnabled() {
        log.info("Step: Verify if Button Next Step is Enabled");
        action.implicitlyWait();
        Assert.assertTrue(action.waitForElementToBeVisible("btnNextStep1", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnNextStep1");
    }

    @Step("Step: Next Step Button")
    public void clickNxtStpBtn() throws IOException {
        log.info("Step: Click the Next Step Button");
        action.takeSnapShot("User clicked Next Step button");
        action.waitForElementToBeClickable("btnNextStep1",ConfigUtilities.Timers.slow);
        action.click("btnNextStep1");
    }

    @Step("Step: Verify if Button Next Step is Enabled")
    public Boolean verifyBtnNext2() {
        log.info("Step: Verify if Button Next Step is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnNextStep2", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnNextStep2");
    }

    @Step("Step: Verify if Button Connect Now is Enabled")
    public Boolean verifyBtnConnectNow() {
        log.info("Step: Verify if Button Connect Now is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnConnectNow", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnConnectNow");
    }

    @Step("Step: Verify User Already Connected button")
    public void verifyUserAlreadyConnected() throws Exception {
        verifyUserAlreadyConnectedBtnIsEnabled();
        clickUserAlreadyConnectedBtn();
    }

    @Step("Step: Verify Show Me How to Connect button")
    public void verifyShowMeHowToConnect() throws Exception {
        verifyShowMeHowToConnectBtnIsEnabled();
        clickShowMeHowToConnectBtn();
        verifyBtnNext1IsEnabled();
        clickNxtStpBtn();
    }
}
