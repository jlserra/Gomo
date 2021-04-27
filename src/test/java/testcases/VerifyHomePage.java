package testcases;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyHomePage extends BaseTestcase{

    @Test(testName = "VerifyHomePage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for the Home Page")
    @Story("Story: Home Page")
    public void verifyHomePage() throws Exception {
        getStartedPage.verifyIfGetStartedPage();
        getStartedPage.clickBtnGetStarted();
        welcomePage.verifyIfLoginPage();
        welcomePage.enterPrepaidNumber(excel.getTestdata("mobileNumber"));
        welcomePage.verifyIfBtnNextIsEnabled();
        welcomePage.clickBtnNext();
        secureAppPage.verifyIfSecurePage();
        secureAppPage.enterPin(excel.getTestdata("pin"));
        secureAppPage.clickBtnNext();
        secureAppPage.verifyIfSecurePageConfirmation();
        secureAppPage.enterPin(excel.getTestdata("pin"));
        secureAppPage.clickBtnNext();
        customerProfilePage.verifyIfCustomerProfilePage();
        customerProfilePage.enterNickname(excel.getTestdata("nickname"));
        customerProfilePage.verifyIfBtnNextIsEnabled();
        customerProfilePage.clickBtnNext();
        chooseModemPage.verifyChooseModemFour();
        modemConfigPage.verifyUserAlreadyConnected();
        homePage.navigateToHomePage();
    }


    @Test(testName = "VerifyClickNotificationBell", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will click for the Notification Bell")
    @Story("Story: Verify Click Notification")
    public void verifyNotificationBell() throws Exception {
        verifyHomePage();
        homePage.clickNotificationBell();
    }

    @Test(testName = "VerifyClickAddModemBtn", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will click for the Add Modem Button")
    @Story("Story: Verify Click Add Modem")
    public void verifyClickAddModem() throws Exception {
        verifyHomePage();
        homePage.verifyClickAddModem();
    }

}
