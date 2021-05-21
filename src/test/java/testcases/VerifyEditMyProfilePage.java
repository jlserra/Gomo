package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyEditMyProfilePage extends BaseTestcase {

    @Test(testName = "verifyEditMyProfilePersonalInfoPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for the Edit My Profile Personal Information Page")
    @Story("Story: Edit My Profile")
    public void verifyEditMyProfilePersonalInfoPage() throws Exception {
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
        homePage.clickHamburgerBtn();

        //Visit My Profile Page from Account Details Page
        accountDetailsPage.accountDetailsPage();
        accountDetailsPage.clickGoToMyProfile();

        //Edit My Profile Page
        editMyProfilePage.verifyEditMyProfilePersonalInfo();

    }

    @Test(testName = "verifyEditMyProfileBusinessInfoPage", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for the Edit My Profile Business Information Page")
    @Story("Story: Edit My Profile")
    public void verifyEditMyProfileBusinessInfoPage() throws Exception {

        verifyEditMyProfilePersonalInfoPage();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.clickBackBtn();
        editMyProfilePage.verifyIfEditMyProfilePage();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.verifyEditMyProfileBusinessInfo();


    }
}
