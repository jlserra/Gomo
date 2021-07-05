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

    @Step("Step: Click Help & Support button")
    public void clickHelpSupportBtn () throws Exception {
        log.info("Step: Click Help & Support Button");
        action.waitForElementToBeClickable("helpSupportbtn", ConfigUtilities.Timers.slow);
        Set<String> contexts = driver.getContextHandles();
        for(String contextNames : contexts ){
            System.out.println(contextNames);
        }
        action.click("helpSupportbtn");
        action.takeSnapShot("User clicked the  Help & Support button");
        driver.context("WEBVIEW_chrome");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(excel.getTestdata("text1"),driver.getCurrentUrl());
    }
}
