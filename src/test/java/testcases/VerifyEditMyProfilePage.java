package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
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

        navigateToMyProfile();
        editMyProfilePage.clickEditMyProfileBtn();
        editMyProfilePage.verifyEditMyProfilePersonalInfo();

    }

    @Test(testName = "verifyEditMyProfileBusinessInfoFirstPage", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for the Edit My Profile Business Information First Page")
    @Story("Story: Edit My Profile")
    public void verifyEditMyProfileBusinessInfoFirstPage() throws Exception {

        verifyEditMyProfilePersonalInfoPage();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.clickBackBtn();
        editMyProfilePage.verifyIfEditMyProfilePage();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.verifyEditMyProfileBusinessInfoFirstPage();
    }

    @Test(testName = "verifyEditMyProfileBusinessInfoSecPage", priority = 3)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for the Edit My Profile Business Information Second Page")
    @Story("Story: Edit My Profile")
    public void verifyEditMyProfileBusinessInfoSecPage() throws Exception {

        verifyEditMyProfilePersonalInfoPage();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.verifyEditMyProfileBusinessInfoFirstPage();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.verifyEditMyProfileBusinessInfoSecPage();
    }

    @Test(testName = "verifyEnterValidValuesInEditMyProfilePage", priority = 4)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will enter valid values in Edit My Profile Pages")
    @Story("Story: Edit My Profile")
    public void verifyEnterValidValuesInEditMyProfilePage() throws Exception {

        navigateToMyProfile();
        editMyProfilePage.clickEditMyProfileBtn();
        editMyProfilePage.enterValidValuesInPersonalInfo();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.enterValidValuesInBusinessInfoFirstPage();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.enterValidValuesInBusinessInfoSecPage();
        Assert.assertTrue(editMyProfilePage.verifyIfSaveBtnIsEnabled());
    }

    @Test(testName = "verifyEnterInvalidValuesInEditMyProfilePage", priority = 5)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will enter invalid values in Edit My Profile Pages")
    @Story("Story: Edit My Profile")
    public void verifyEnterInvalidValuesInEditMyProfilePage() throws Exception {

        navigateToMyProfile();
        editMyProfilePage.clickEditMyProfileBtn();
        editMyProfilePage.enterInvalidValuesInPersonalInfo();
        Assert.assertFalse(editMyProfilePage.VerifyIfNextBtnIsEnabled());
        action.scrollIntoElement("txtfieldFirstName");
        editMyProfilePage.enterValidValuesInPersonalInfo();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.enterValidValuesInBusinessInfoFirstPage();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.enterInvalidValuesInBusinessInfoSecPage();
        Assert.assertFalse(editMyProfilePage.verifyIfSaveBtnIsEnabled());
        action.scrollIntoElement("lblLandlineNo");
        editMyProfilePage.enterValidValuesInBusinessInfoSecPage();
        Assert.assertTrue(editMyProfilePage.verifyIfSaveBtnIsEnabled());
    }

    @Test(testName = "verifySaveChangesInEditMyProfilePage", priority = 6)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will save changes in Edit My Profile Pages")
    @Story("Story: Edit My Profile")
    public void verifySaveChangesInEditMyProfilePage() throws Exception {

        navigateToMyProfile();
        editMyProfilePage.clickEditMyProfileBtn();
        editMyProfilePage.enterValidValuesInPersonalInfo();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.enterValidValuesInBusinessInfoFirstPage();
        editMyProfilePage.clickNextBtn();
        editMyProfilePage.enterValidValuesInBusinessInfoSecPage();
        editMyProfilePage.clickSaveBtn();
        editMyProfilePage.verifyThankYouMsgUponSave();
        editMyProfilePage.clickThankYouPageNextBtn();
        assertTrue(homePage.verifyNicknameIsDisplayed());
    }


    //Navigate to My Profile Page
    public void navigateToMyProfile() throws Exception {
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
        homePage.clickHamburgerBtn();

        //Visit My Profile Page from Account Details Page
        accountDetailsPage.accountDetailsPage();
        accountDetailsPage.clickPrivacyPolicyCheckbox();
        accountDetailsPage.clickGoToMyProfile();
    }
}
