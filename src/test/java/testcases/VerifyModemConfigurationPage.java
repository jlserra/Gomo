package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.BasePage;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyModemConfigurationPage extends BaseTestcase {

    @Test(testName = "VerifyUserAlreadyConnected", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will click the I'm already connected button")
    @Story("Story: User already connected")
    public void verifyUserAlreadyConnected() throws Exception {
        chooseModemPage.verifyChooseModemOne();
        modemConfigPage.verifyUserAlreadyConnected();
    }

}
