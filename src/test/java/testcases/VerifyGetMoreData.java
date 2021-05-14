package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyGetMoreData extends BaseTestcase {

    @Test(testName = "VerifyGetMoreDataPromosPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for the Get More Data  - Promos Page")
    @Story("Story: Get More Data")
    public void verifyGetMoreDataPromosPage() throws Exception {
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

        //Visit Get More Data Page from Homepage
        homePage.verifyClickGetMoreData();

        //Get More Data - Promos
        assertTrue(getMoreDataPage.VerifyIfGetMoreDataPage());
        getMoreDataPage.VerifyGetMoreDataPromosPage();
    }

    @Test(testName = "VerifyGetMoreDataAddOnsPage", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for the Get More Data  - Add Ons Page (No Active Subscriptions)")
    @Story("Story: Get More Data")
    public void verifyGetMoreDataAddOnsPage() throws Exception {
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

        //Visit Get More Data Page from Homepage
        homePage.verifyClickGetMoreData();

        //Get More Data - Add Ons Page (No Active Subscriptions)
        assertTrue(getMoreDataPage.VerifyIfGetMoreDataPage());
        getMoreDataPage.VerifyGetMoreDataAddOnsPageNoSubscription();
    }

    @Test(testName = "verifySMSVerificationPage", priority = 3)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for the SMS Verification Page")
    @Story("Story: Get More Data")
    public void verifySMSVerificationPage() throws Exception {
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

        //Visit Get More Data Page from Homepage
        homePage.verifyClickGetMoreData();

        //Get More Data - SMS Verification Page (Enter Valid OTP)
        assertTrue(getMoreDataPage.VerifyIfGetMoreDataPage());
        getMoreDataPage.VerifySMSVerificationPage();

        int count;
        int maxTries = 3;

        for (count = 0; count < maxTries; count++) {

            getMoreDataPage.enterOTP(excel.getTestdata("mobileNumber"));

            if(getMoreDataPage.VerifyIfExpiredOTPErrMsgIsDisplayed())
                getMoreDataPage.clickOK();
            else
                log.info("SMS Verification Page has accepted the entered OTP.");
                break;
        }

        if (count==maxTries)
            log.error("The maximum number of tries has been reached (3 tries) in requesting an OTP that hasn't expired yet.");

        }

    }

