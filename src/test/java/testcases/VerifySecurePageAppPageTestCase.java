package testcases;


import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

@Listeners(testcases.ListenerTestcase.class)
public class VerifySecurePageAppPageTestCase extends BaseTestcase {

    @Test(testName = "verifySecureAppMatchingPin", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will enter matching PIN in Secure App page")
    @Story("Story: Secure App")
    public void verifySecureAppMatchingPin() throws Exception {

        //Get Started
        assertTrue(getStartedPage.verifyIfGetStartedPage());
        getStartedPage.clickBtnGetStarted();

        //Welcome Page
        assertTrue(welcomePage.verifyIfLoginPage());
        welcomePage.enterPrepaidNumber(excel.getTestdata("mobileNumber"));
        assertTrue(welcomePage.verifyIfMobileNumberIsEntered(excel.getTestdata("mobileNumber")));
        assertTrue(welcomePage.verifyIfBtnNextIsEnabled());
        welcomePage.clickBtnNext();

        //Secure App Page
        assertTrue(secureAppPage.verifyIfSecurePage());
        secureAppPage.enterPin(excel.getTestdata("pin"));
        secureAppPage.verifyIfBtnNextIsEnabled();
        secureAppPage.clickBtnNext();

        assertTrue(secureAppPage.verifyIfSecurePageConfirmation());
        secureAppPage.enterPin(excel.getTestdata("pin"));
        secureAppPage.verifyIfBtnNextIsEnabled();
        secureAppPage.clickBtnNext();
    }

    @Test(testName = "verifySecureAppMismatchPin", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will enter mismatching PIN in Secure App page")
    @Story("Story: Secure App")
    public void verifySecureAppMismatchPin() throws Exception {

        //Get Started
        assertTrue(getStartedPage.verifyIfGetStartedPage());
        getStartedPage.clickBtnGetStarted();

        //Welcome Page
        assertTrue(welcomePage.verifyIfLoginPage());
        welcomePage.enterPrepaidNumber(excel.getTestdata("mobileNumber"));
        assertTrue(welcomePage.verifyIfMobileNumberIsEntered(excel.getTestdata("mobileNumber")));
        assertTrue(welcomePage.verifyIfBtnNextIsEnabled());
        welcomePage.clickBtnNext();

        //Secure App Page
        assertTrue(secureAppPage.verifyIfSecurePage());
        secureAppPage.enterPin(excel.getTestdata("pin"));
        secureAppPage.verifyIfBtnNextIsEnabled();
        secureAppPage.clickBtnNext();

        assertTrue(secureAppPage.verifyIfSecurePageConfirmation());
        secureAppPage.enterPin(excel.getTestdata("pin2"));
        secureAppPage.verifyIfBtnNextIsEnabled();
        secureAppPage.clickBtnNext();
        assertTrue(secureAppPage.verifyUnmatchedSecurePinErrorSpiel());

        //Secure App Confirmation Page - Re-enter PIN
        int secureAppPin;
        int length = excel.getTestdata("pin2").length();
        for(secureAppPin=0;secureAppPin<length;) {
            secureAppPage.clickBtnDelete();
            secureAppPin++;
        }
        secureAppPage.enterPin(excel.getTestdata("pin"));
        secureAppPage.verifyIfBtnNextIsEnabled();
        secureAppPage.clickBtnNext();
        assertTrue(secureAppPage.verifyIfCustomerProfilePage());
    }

}