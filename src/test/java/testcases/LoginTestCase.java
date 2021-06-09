package testcases;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.GetStartedPage;

import static org.testng.Assert.assertTrue;

@Listeners(testcases.ListenerTestcase.class)
public class LoginTestCase extends BaseTestcase {

    @Test(testName = "loginUser")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be logged in to the system")
    @Story("Story: Login")
    public static void loginUser() throws Exception {

        //Get Started
        assertTrue(getStartedPage.verifyIfGetStartedPage());
        getStartedPage.clickBtnGetStarted();

        //Welcome Page
        assertTrue(welcomePage.verifyIfLoginPage());
        welcomePage.enterPrepaidNumber(excel.getTestdata("mobileNumber"));
        assertTrue(welcomePage.verifyIfBtnNextIsEnabled());
        welcomePage.clickBtnNext();

        //Secure Page
        assertTrue(secureAppPage.verifyIfSecurePage());
        secureAppPage.enterPin(excel.getTestdata("pin"));
        secureAppPage.clickBtnNext();
        assertTrue(secureAppPage.verifyIfSecurePageConfirmation());
        secureAppPage.enterPin(excel.getTestdata("pin"));
        secureAppPage.clickBtnNext();

        //Customer Profile
        assertTrue(customerProfilePage.verifyIfCustomerProfilePage());
        customerProfilePage.enterNickname(excel.getTestdata("nickname"));
        assertTrue(customerProfilePage.verifyIfBtnNextIsEnabled());
        customerProfilePage.clickBtnNext();

        //Choose Modem
        chooseModemPage.verifyChooseModemFour();
        modemConfigPage.verifyUserAlreadyConnected();

        //Home Page
        homePage.clickBtnProceed();
        Thread.sleep(10000);

    }

}
