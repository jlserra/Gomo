package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import utilities.ConfigUtilities;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NotificationPage extends BasePage {

    MobileDriver driver;

    public NotificationPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Verify if user is in Notification Page")
    public Boolean verifyIfNotificationPage() throws IOException {
        log.info("Step: Verify if user is in Notification Page");
        assertTrue(action.waitForElementToBeVisible("txtfieldSearch", ConfigUtilities.Timers.slow));
        action.takeSnapShot("User is in Notification Page");
        return action.isDisplayed("txtfieldSearch");
    }

    @Step("Step: Verify Nickname")
    public void verifyNickname() throws Exception {
        log.info("Step: Verify Nickname");
        assertEquals(excel.getTestdata("nickname"), action.getText("txtNotifNickname"));
        action.takeSnapShot(excel.getTestdata("nickname"));
    }

    @Step("Step: Verify Mobile Number")
    public void verifyMobileNumber() throws Exception {
        log.info("Step: Verify Mobile Number");
        assertEquals(excel.getTestdata("mobileNumber"), action.getText("txtNotifMobileNumber"));
        action.takeSnapShot(excel.getTestdata("mobileNumber"));
    }

    @Step("Step: Click first notification")
    public void clickFirstNotif() throws InterruptedException {
        log.info("Step: Click the first notification");
        action.click("btnNotification");
    }

    @Step("Step: Verify if user is in Notification Content Page")
    public Boolean verifyIfNotifContentPage() throws IOException {
        log.info("Step: Verify if user is in Notification Content Page");
        assertTrue(action.waitForElementToBeVisible("txtNotifContent", ConfigUtilities.Timers.slow));
        action.takeSnapShot("User is in Notification Content Page");
        return action.isDisplayed("txtNotifContent");
    }

    @Step("Step: Enter value in the Searchbox")
    public void enterValueInSearchBox(String text) throws IOException, InterruptedException {
        log.info("Step: Enter value in the Searchbox");
        action.sendKeys("txtfieldSearch", text);
        action.takeSnapShot("Enter value in Searchbox");
    }

    @Step("Step: Verify Notification Page")
    public void verifyNotificationPage() throws Exception {
        log.info("Step: Verify Notification Page");
        verifyIfNotificationPage();
        verifyNickname();
        verifyMobileNumber();

    }

    @Step("Step: Verify Notification Content Page")
    public void verifyViewNotifContentPage() throws Exception {
        log.info("Step: Verify Notification Content Page");
        clickFirstNotif();
        verifyIfNotifContentPage();
        verifyNickname();
        verifyMobileNumber();
    }
}
