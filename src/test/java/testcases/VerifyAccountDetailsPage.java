package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyAccountDetailsPage extends BaseTestcase{

    @Test(testName = "VerifyAccountDetailsPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for the Account Details Page")
    @Story("Story: Account Details Page")
    public void verifyAccountDetailsPage() throws Exception {
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
        homePage.clickHamburgerBtn();
        accountDetailsPage.accountDetailsPage();
        accountDetailsPage.accountDetailsPageContent();
    }


    @Test(testName = "Verify Go to My Profile page", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will click and go to My Profile Page")
    @Story("Story: Go to My Profile")
    public void verifyGotoMyProfilePage() throws Exception {
        verifyAccountDetailsPage();
        accountDetailsPage.clickGoToMyProfile();
    }

    @Test(testName = "Verify Edit Nickname", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will edit nickname")
    @Story("Story: Edit Nickname")
    public void verifyEditNickname() throws Exception {
        verifyAccountDetailsPage();
        accountDetailsPage.editNickNameField();
    }

    @Test(testName = "Verify Mobile Number and Status", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: Verify Mobile Number and Status")
    @Story("Story: Mobile Number and Status")
    public void verifyNumberAndStatus() throws Exception {
        verifyAccountDetailsPage();
        accountDetailsPage.verifyNumberAndStatus();
    }

    @Test(testName = "Verify Profile Status", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: Verify Profile Status")
    @Story("Story: Profile Status")
    public void verifyProfileStatus() throws Exception {
        verifyAccountDetailsPage();
        accountDetailsPage.verifyProfileStatus();
    }



}
