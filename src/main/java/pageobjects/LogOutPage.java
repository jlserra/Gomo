package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.junit.Assert;
import utilities.ConfigUtilities;

public class LogOutPage extends BasePage{
    MobileDriver driver;

    public LogOutPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Click LOGOUT link text")
    public void clickLOGOUTLinktxt () throws Exception {
        log.info("Step: Click LOGOUT link text");
        action.waitForElementToBeClickable("logoutLinktxt", ConfigUtilities.Timers.slow);
        action.click("logoutLinktxt");
        action.takeSnapShot("User clicked the LOGOUT text");

    }

    @Step("Step: Click LOGOUT button")
    public void clickLOGOUTBtn () throws Exception {
        log.info("Step: Click LOGOUT button");
        Assert.assertTrue(action.waitForElementToBeClickable("logoutbtn", ConfigUtilities.Timers.slow));
        action.click("logoutbtn");
        action.takeSnapShot("User clicked the LOGOUT button");

    }

    @Step("Step: Click CANCEL button")
    public void clickCANCELBtn () throws Exception {
        log.info("Step: Click CANCEL button");
        Assert.assertTrue(action.waitForElementToBeClickable("cancelbtn", ConfigUtilities.Timers.slow));
        action.click("cancelbtn");
        action.takeSnapShot("User clicked the CANCEL button");

    }
}
