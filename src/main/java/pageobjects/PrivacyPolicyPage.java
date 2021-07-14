package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ConfigUtilities;

import java.util.Set;

public class PrivacyPolicyPage extends BasePage{
    MobileDriver driver;

    public PrivacyPolicyPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Click Privacy Policy link text")
    public void clickPrivacyPolicyBtn () throws Exception {
        log.info("Step: Click Privacy Policy link text");
        action.waitForElementToBeClickable("privacyPolicybtn", ConfigUtilities.Timers.slow);
        Set<String> contexts = driver.getContextHandles();
        for(String contextNames : contexts ){
            System.out.println(contextNames);
        }
        action.click("privacyPolicybtn");
        Thread.sleep(2000);
        action.takeSnapShot("User clicked the  Privacy Policy link text");
        driver.context("WEBVIEW_chrome");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(excel.getTestdata("text1"),driver.getCurrentUrl());
    }
}
