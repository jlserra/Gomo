package pageobjects;


import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ConfigUtilities;
import java.io.IOException;
import static org.testng.AssertJUnit.assertTrue;


public class SecureAppPage extends BasePage {

    public SecureAppPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Verify if User is in Secure Application Page")
    public Boolean verifyIfSecurePage() throws Exception {
        log.info("Step: Verify if User is in Secure Application Page");
        action.implicitlyWait(ConfigUtilities.Timers.slow);
        assertTrue(action.waitForElementToBeVisible("txtSecureApp", ConfigUtilities.Timers.normal));
        action.takeSnapShot("User is in Secure App Page");
        return action.isDisplayed("txtSecureApp");
    }

    @Step("Step: Verify if User is in Secure Application Confirmation Page")
    public Boolean verifyIfSecurePageConfirmation() throws Exception {
        log.info("Step: Verify if User is in Secure Application Confirmation Page");
        new SecureAppPage(driver);
        action.implicitlyWait(ConfigUtilities.Timers.slow);
        assertTrue(action.waitForElementToBeVisible("txtSecureAppConfirm", ConfigUtilities.Timers.normal));
        action.takeSnapShot("User is in Secure App Confirmation Page");
        return action.isDisplayed("txtSecureAppConfirm");
    }

    @Step("Step: Verify error spiel for invalid number")
    public boolean verifyUnmatchedSecurePinErrorSpiel() throws Exception {
        log.info("Step: Verify if error spiel for invalid number is displayed");
        assertTrue(action.waitForElementToBeVisible("unmatchedSecurePin", ConfigUtilities.Timers.slow));
        action.takeSnapShot(excel.getTestdata("text1"));
        return excel.getTestdata("text1").equals(action.getText("unmatchedSecurePin"));
    }

    @Step("Step: Click Button Next")
    public void clickBtnNext() throws Exception {
        log.info("Step: Click Button Next");
        action.click("btnNextSecurePage");
        action.implicitlyWait(ConfigUtilities.Timers.quick);
    }

    @Step("Step: Verify if Button next is enabled")
    public void verifyIfBtnNextIsEnabled() throws Exception {
        log.info("Step: Verify if Button next is enabled");
        action.waitForElementToBeClickable("btnNextSecurePage", ConfigUtilities.Timers.appStandard);
    }

    @Step("Step: Delete Secure Pin")
    public void clickBtnDelete() throws Exception {
        log.info("Step: Delete Secure Pin");
        action.click("btnDelete");
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
    @Step("Step: Verify if user is in Customer Profile Page")
    public Boolean verifyIfCustomerProfilePage() throws Exception {
        log.info("Step: Verify if user is in Customer Profile Page");
        Assert.assertTrue(action.waitForElementToBeVisible("txtCustomerProfile", ConfigUtilities.Timers.slow));
        return action.isDisplayed("txtCustomerProfile");
    }
}