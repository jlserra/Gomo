package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import utilities.ConfigUtilities;

import static org.testng.Assert.assertEquals;

public class ChatWithUsPage extends BasePage{
    MobileDriver driver;

    public ChatWithUsPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Click Chat with us button")
    public void clickChatWithUsBtn () throws Exception {
        log.info("Step: Click Chat with us Button");
        action.takeSnapShot("User clicked the  Chat with us button");
        action.waitForElementToBeClickable("chatWithUsbtn", ConfigUtilities.Timers.slow);
        action.click("chatWithUsbtn");
    }

    @Step("Step: Verify if user is in Chat with us modal")
    public void verifyChatWithUsModal() throws Exception {

        log.info("Step: Verify Chat With Us modal");
        action.waitForElementToBeClickable("chatOnMessengerbtn", ConfigUtilities.Timers.slow);
        assertEquals(excel.getTestdata("text1"), action.getText("txtchatWithUsModal"));
        action.takeSnapShot("User is in MChat with us modal");
    }
}
