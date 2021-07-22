package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyMyProfilePage extends BaseTestcase{

    @Test(testName = "View Profile Page", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for My Profile Page")
    @Story("Story: My Profile Page")
    public void viewMyProfilePage() throws Exception {
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
        accountDetailsPage.clickGoToMyProfile();
        myProfilePage.myProfilePageView();
    }

    @Test(testName = "Verify Personal Information Section", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will verify the content of the Personal Information Section")
    @Story("Story: My Profile Page")
    public void verifyPersonalInformation() throws Exception {
        viewMyProfilePage();
        myProfilePage.verifyPersonalInfo();
    }

    @Test(testName = "Verify Business Information Section", priority = 3)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will verify the content of the Business Information Section")
    @Story("Story: My Profile Page")
    public void verifyBusinessInformation() throws Exception {
        viewMyProfilePage();
        myProfilePage.verifyBusinessInfo();
    }

}
