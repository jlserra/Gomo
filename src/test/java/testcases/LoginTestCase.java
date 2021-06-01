package testcases;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Listeners(testcases.ListenerTestcase.class)
public class LoginTestCase extends BaseTestcase {

    @Test(testName = "loginUser")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be logged in to the system")
    @Story("Story: Login")
    public void loginUser() throws Exception {

//        String mobileNumber = "09271080510";
//        String pin = "1111";
//        String nickname = "test nickname";


//        Get Started Page
//        assertTrue(getStartedPage.verifyIfGetStartedPage());
//        getStartedPage.clickBtnGetStarted();

//        Login Page
//        assertTrue(welcomePage.verifyIfLoginPage());
//        welcomePage.enterPrepaidNumber(mobileNumber);
//        assertTrue(welcomePage.verifyIfMobileNumberIsEntered(mobileNumber));
//        assertTrue(welcomePage.verifyIfBtnNextIsEnabled());
//        welcomePage.clickBtnNext();

//        Secure Application Page
//        assertTrue(secureAppPage.verifyIfSecurePage());
//        secureAppPage.enterPin(pin);
//        secureAppPage.verifyIfBtnNextIsEnabled();
//        secureAppPage.clickBtnNext();
//
//        assertTrue(secureAppPage.verifyIfSecurePageConfirmation());
//        secureAppPage.enterPin(pin);
//        secureAppPage.verifyIfBtnNextIsEnabled();
//        secureAppPage.clickBtnNext();

//        Customer Profile
//        assertTrue(customerProfilePage.verifyIfCustomerProfilePage());
//        customerProfilePage.enterNickname(nickname);
//        assertTrue(customerProfilePage.verifyIfBtnNextIsEnabled());
//        customerProfilePage.clickBtnNext();

//        assertTrue(customerProfilePage.verifyIfChooseModemPage());
//        customerProfilePage.clickModem1();
//
//        assertTrue(customerProfilePage.verifyIfConnectPhonetoMyBusinessPage());
//        customerProfilePage.clickBtnImAlreadyConnected();
//
//        assertTrue(customerProfilePage.verifyIfNotConnectedPage());
//        customerProfilePage.clickBtnManualVerifyAccount();
//
//        customerProfilePage.clickBtnSkip();
//        customerProfilePage.clickBtnProceed();

//        action.implicitlyWait();
//        action.takeSnapShot("Dashboard Screen");

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

    }

    @Test(testName = "loginUser1")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be logged in to the system")
    @Story("Story: Login")
    public void loginUser1() throws Exception {
        getStartedPage.clickBtnGetStarted();
    }

}
