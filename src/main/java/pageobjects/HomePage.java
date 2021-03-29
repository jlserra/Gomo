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

    @Step("Step: Verify Home Page Content")
    public void verifyHomePage() throws Exception {
        log.info("Step: Verify if user is in Home Page");
        Assert.assertTrue(action.waitForElementToBeVisible("", ConfigUtilities.Timers.slow));
        action.takeSnapShot("User is in Home Page");

    }
}
