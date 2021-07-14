package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;
import utilities.ConfigUtilities;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class HowToLoadPage extends BasePage{
    MobileDriver driver;

    public HowToLoadPage(MobileDriver driver) {
        this.driver = driver;
    }
    @Step("Step: Click Chat with us button")
    public void clickHowToLoadBtn () throws Exception {
        log.info("Step: Click How to Load Button");
        action.waitForElementToBeClickable("howToLoadbtn", ConfigUtilities.Timers.slow);
        action.click("howToLoadbtn");
        action.switchContextToWebView();
        action.takeSnapShot("User clicked the  How to Load button");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(excel.getTestdata("text1"),driver.getCurrentUrl());

    }
}
