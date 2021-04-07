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

    @Step("Step: Verify Home Page")
    public void verifyHomePage() throws Exception {
        verifyBtnProceed();
        clickBtnProceed();
    }


}
