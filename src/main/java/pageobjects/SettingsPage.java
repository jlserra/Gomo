package pageobjects;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ConfigUtilities;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class SettingsPage extends BasePage{
    MobileDriver driver;

    public SettingsPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Click Settings link text")
    public void clickSettingsBtn () throws Exception {
        log.info("Step: Click Settings link text");
        action.waitForElementToBeClickable("settingsbtn", ConfigUtilities.Timers.slow);
        action.click("settingsbtn");
        action.takeSnapShot("User clicked the Settings link text");

    }

    @Step("Step: Enter Pin")
    public void enterPin(String text) throws Exception {
        for (char c : text.toCharArray()) {
            log.info("Step: Enter Pin" + c);
            switch (c) {
                case '1':
                    action.click("btn1");
                    break;
                case '2':
                    action.click("btn2");
                    break;
                case '3':
                    action.click("btn3");
                    break;
                case '4':
                    action.click("btn4");
                    break;
            }
            action.implicitlyWait(ConfigUtilities.Timers.fast);
        }
    }
    @Step("Step: Click Change App PIN")
    public void changeAppPIN () throws Exception {
        log.info("Step: Click Change App PIN");
        action.click("changeAppPIN");
        action.takeSnapShot("User clicked the Click Change App PIN");
        enterPin(excel.getTestdata("pin"));
        Assert.assertTrue(action.waitForElementToBeClickable("nextbtn2", ConfigUtilities.Timers.slow));
        action.click("nextbtn2");
        enterPin(excel.getTestdata("changepin"));
        Assert.assertTrue(action.waitForElementToBeClickable("nextbtn2", ConfigUtilities.Timers.slow));
        action.click("nextbtn2");
        Assert.assertTrue(action.waitForElementToBeClickable("okbtn", ConfigUtilities.Timers.slow));
        action.click("okbtn");

    }
    @Step("Step: Click CCustom Alert Settings")
    public void customAlertSettings () throws Exception {
        log.info("Step: Click Custom Alert Settings");
        action.click("customAlertbtn");
        action.click("alertSwitchbtn");
        action.takeSnapShot("User clicked the Alert switch");

        action.isDisplayed("textfld1");
        action.clearTextField(action.getElements("textfld1"));
        action.sendKeys("textfld1", excel.getTestdata("text1"));
        assertEquals(excel.getTestdata("text1"), action.getText("textfld1"));
        action.takeSnapShot("User entered Alert");

        action.isDisplayed("textfld2");
        action.clearTextField(action.getElements("textfld2"));
        action.sendKeys("textfld2", excel.getTestdata("text2"));
        assertEquals(excel.getTestdata("text2"), action.getText("textfld2"));
        action.takeSnapShot("User entered Alert");

        action.isDisplayed("textfld3");
        action.clearTextField(action.getElements("textfld3"));
        action.sendKeys("textfld3", excel.getTestdata("text3"));
        assertEquals(excel.getTestdata("text3"), action.getText("textfld3"));
        action.takeSnapShot("User entered Alert");

        Assert.assertTrue(action.waitForElementToBeClickable("toggleMB1", ConfigUtilities.Timers.slow));
        action.click("toggleMB1");
        Assert.assertTrue(action.waitForElementToBeClickable("toggleMB2", ConfigUtilities.Timers.slow));
        action.click("toggleMB2");
        Assert.assertTrue(action.waitForElementToBeClickable("toggleMB3", ConfigUtilities.Timers.slow));
        action.click("toggleMB3");
        Assert.assertTrue(action.waitForElementToBeClickable("toggleGB1", ConfigUtilities.Timers.slow));
        action.click("toggleGB1");
        Assert.assertTrue(action.waitForElementToBeClickable("toggleGB2", ConfigUtilities.Timers.slow));
        action.click("toggleGB2");
        Assert.assertTrue(action.waitForElementToBeClickable("toggleGB3", ConfigUtilities.Timers.slow));
        action.click("toggleGB3");

        Assert.assertTrue(action.isDisplayed("resetLinktxt"));
        action.click("resetLinktxt");
        action.takeSnapShot("User clicked the Reset to Default value link text");
    }
}
