package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utilities.ConfigUtilities;

import static org.testng.Assert.assertEquals;

public class AddNewModemPage extends BasePage{
    MobileDriver driver;

    public AddNewModemPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Click Add a New Modem Button")
    public void clickAddANewModemBtn () throws Exception {
        log.info("Step: Click Add a New Modem Button");
        action.waitForElementToBeClickable("addNewModembtn", ConfigUtilities.Timers.slow);
        action.click("addNewModembtn");
        Thread.sleep(2000);
        Assert.assertTrue(action.waitForElementToBeVisible("txtaddNewModem", ConfigUtilities.Timers.verySlow));
        assertEquals(excel.getTestdata("text1"), action.getText("txtaddNewModem"));
        action.takeSnapShot("User is in Add a New Modem Page");
    }
}
