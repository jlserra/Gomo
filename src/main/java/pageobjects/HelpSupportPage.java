package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ConfigUtilities;

import java.util.Set;

public class HelpSupportPage extends BasePage{
    MobileDriver driver;

    public HelpSupportPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Click Help & Support link text")
    public void clickHelpSupportBtn () throws Exception {
        log.info("Step: Click Help & Support link text");
        action.waitForElementToBeClickable("helpSupportbtn", ConfigUtilities.Timers.slow);
        action.click("helpSupportbtn");
        action.switchContextToWebView();
        action.takeSnapShot("User clicked the  Help & Support link text");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(excel.getTestdata("text1"),driver.getCurrentUrl());
    }
}
