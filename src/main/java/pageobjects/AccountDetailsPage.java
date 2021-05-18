package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ActionUtilities;
import utilities.ConfigUtilities;

public class AccountDetailsPage extends BasePage{

//*********  Scenarios  **************//
    //    Verify Account Details Page
    //    Edit Nickname
    //    Verify Phone number and status
    //    Verify Profile status
    //    Go to my profile
    //    Upload photo

    MobileDriver driver;

    public AccountDetailsPage(MobileDriver driver) {
        this.driver = driver;
    }


    //*********  PageObject  **************//


    // For Account Details verification
    @Step("Step: Verify if Account Details Link is Enabled")
    public Boolean verifyLinkAccountDetailsIsEnabled() throws Exception {
        log.info("Step: Verify if Account Details Link is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("lnkAccountDetails", ConfigUtilities.Timers.slow));
        return action.isEnabled("lnkAccountDetails");
    }

    @Step("Step: Account Details Link")
    public void clickLinkAccountDetails() throws Exception {
        log.info("Step: Click the Account Details Link");
        action.takeSnapShot("User clicked the Account Details Link");
        action.waitForElementToBeClickable("lnkAccountDetails",ConfigUtilities.Timers.slow);
        action.click("lnkAccountDetails");
    }

    // For Nickname verification
    @Step("Step: Verify if Nickname in Account Details section Displayed")
    public Boolean verifyNicknameAccountDetailsIsDisplayed() throws Exception {
        log.info("Step: Verify if Nickname in Account Details section is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblNickname", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("nickname"),action.getText("lblNickname"));
        return action.isDisplayed("lblNickname");
    }

    // Account Details text
    @Step("Step: Verify if Nickname in Account Details section Displayed")
    public Boolean verifyAccountDetailsTxtIsDisplayed() throws Exception {
        log.info("Step: Verify if Account Details text is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("txtTitle", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("text1"),action.getText("txtTitle"));
        return action.isDisplayed("txtTitle");
    }

    // For Camera Icon verification
    @Step("Step: Verify if Camera Icon is Enabled")
    public Boolean verifyCameraIconIsEnable() throws Exception {
        log.info("Step: Verify if Camera Icon is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("iconCamera", ConfigUtilities.Timers.slow));
        return action.isEnabled("iconCamera");
    }

    // For Image verification
    @Step("Step: Verify if Image Icon is Displayed")
    public Boolean verifyAccountImageIsDisplayed() throws Exception {
        log.info("Step: Verify if Image Icon is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("accntImg", ConfigUtilities.Timers.slow));
        return action.isDisplayed("accntImg");
    }

    // For Hamburger Button verification
    @Step("Step: Verify if Hamburger Button is Enabled")
    public Boolean verifyHamburgerBtnIsEnabled() throws Exception {
        log.info("Step: Verify if Hamburger Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnHamburgerAP", ConfigUtilities.Timers.slow));
        return action.isEnabled("btnHamburgerAP");
    }

    // For Edit Nickname Link verification
    @Step("Step: Verify if Edit Nickname Link is Enabled")
    public Boolean verifyEditNicknameLinkIsEnabled() throws Exception {
        log.info("Step: Verify if Edit Nickname Link is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("editNicknameLink", ConfigUtilities.Timers.slow));
        return action.isEnabled("editNicknameLink");
    }

    @Step("Step: Click edit nickname")
    public void clickEditNickname() throws Exception {
        log.info("Step: Click edit nickname");
        action.takeSnapShot("User clicked edit nickname");
        action.waitForElementToBeClickable("editNicknameLink",ConfigUtilities.Timers.slow);
        action.click("editNicknameLink");
    }

    // For Prepaid Number Label verification
    @Step("Step: Verify if Prepaid Number Label is Displayed")
    public Boolean verifyLblPrepaidNumberIsDisplayed() throws Exception {
        log.info("Step: Verify if Prepaid Number Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPrepaidInternetNumber", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("lblPrepaidNumber"),action.getText("lblPrepaidInternetNumber"));
        return action.isDisplayed("lblPrepaidInternetNumber");
    }

    // For Prepaid Number verification
    @Step("Step: Verify if Prepaid Number is Displayed")
    public Boolean verifyPrepaidNumberIsDisplayed() throws Exception {
        log.info("Step: Verify if Prepaid Number is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("prepaidNumber", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("prepNumber"),action.getText("prepaidNumber"));
        return action.isDisplayed("prepaidNumber");
    }

    // For Edit Prepaid Number Status verification
    @Step("Step: Verify if Prepaid Number Status is Displayed")
    public Boolean verifyPrepaidNumberStatusIsDisplayed() throws Exception {
        log.info("Step: Verify if Prepaid Number Status is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("prepaidNumberStatus", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("mobileStatus"),action.getText("prepaidNumberStatus"));
        return action.isDisplayed("prepaidNumberStatus");
    }

    // For Edit My Profile Label verification
    @Step("Step: Verify if My Profile Label is Displayed")
    public Boolean verifyMyProfileLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if My Profile Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblMyProfile", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("lblMyProfileText"), action.getText("lblMyProfile"));
        return action.isDisplayed("lblMyProfile");
    }

    // For Edit My Profile Status verification
    @Step("Step: Verify if My Profile Status is Displayed")
    public Boolean verifyMyProfileStatusIsDisplayed() throws Exception {
        log.info("Step: Verify if My Profile Status is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblMyProfileStatus", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("profileStatus"),action.getText("lblMyProfileStatus"));
        return action.isDisplayed("lblMyProfileStatus");
    }

    // For Go to My Profile Button verification
    @Step("Step: Verify if Go to My Profile Button is Enabled")
    public Boolean verifyBtnGoToMyProfileIsEnabled() throws Exception {
        log.info("Step: Verify if Go to My Profile Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("goToMyProfileBtn", ConfigUtilities.Timers.slow));
        return action.isDisplayed("goToMyProfileBtn");
    }

    @Step("Step: Click Go to My Profile")
    public void clickBtnGoToMyProfile() throws Exception {
        log.info("Step: Click Go to My Profile");
        action.takeSnapShot("User clicked Go to My Profile");
        action.waitForElementToBeClickable("goToMyProfileBtn",ConfigUtilities.Timers.slow);
        action.click("goToMyProfileBtn");
    }

    //Verify Edit Nickname field
    @Step("Step: Verify if Edit Nickname Field is Enabled")
    public Boolean verifyFieldEditNicknameIsEnabled() throws Exception {
        log.info("Step: Verify if Edit Nickname Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("editNicknameField", ConfigUtilities.Timers.slow));
        return action.isEnabled("editNicknameField");
    }

    @Step("Step: Clear Edit Nickname Field")
    public void clearFieldEditNickname() throws Exception {
        log.info("Step: Clear Edit Nickname Field");
        action.takeSnapShot("User Clear Edit Nickname Field");
        action.clearTextField(action.getElements("editNicknameField"));
    }

    @Step("Step: Set New Nickname")
    public void setNewNickname() throws Exception {
        log.info("Step: Set New Nickname");
        action.takeSnapShot("User Set New Nickname");
        action.sendKeys("editNicknameField",excel.getTestdata("newName"));
    }

    @Step("Step: Submit New Nickname")
    public void submitNewNickname() throws Exception {
        log.info("Step: Submit New Nickname");
        action.takeSnapShot("User Submit New Nickname");
        action.waitForElementToBeClickable("submitNickname",ConfigUtilities.Timers.slow);
        action.click("submitNickname");
    }

    @Step("Step: Verify New Nickname")
    public Boolean verifyNewlySetNickname() throws Exception {
        log.info("Step: Verify New Nickname");
        Assert.assertTrue(action.waitForElementToBeVisible("lblNickname", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("newName"),action.getText("lblNickname"));
        return action.isDisplayed("lblNickname");
    }



    // ****************** STEPS ****************************** //

    @Step("Step: Navigate Account Details Page")
    public void accountDetailsPage() throws Exception {
        verifyLinkAccountDetailsIsEnabled();
        clickLinkAccountDetails();
    }

    @Step("Step: Check for the Account Details Page Content")
    public void accountDetailsPageContent() throws Exception {
        verifyNicknameAccountDetailsIsDisplayed();
        verifyAccountDetailsTxtIsDisplayed();
        verifyCameraIconIsEnable();
        verifyAccountImageIsDisplayed();
        verifyHamburgerBtnIsEnabled();
        verifyEditNicknameLinkIsEnabled();
        verifyLblPrepaidNumberIsDisplayed();
        verifyPrepaidNumberIsDisplayed();
        verifyPrepaidNumberStatusIsDisplayed();
        verifyMyProfileLabelIsDisplayed();
        verifyMyProfileStatusIsDisplayed();
        verifyBtnGoToMyProfileIsEnabled();
    }

    @Step("Step: Check for the Account Details Page Content")
    public void clickGoToMyProfile() throws Exception {
//        accountDetailsPage();
//        accountDetailsPageContent();
        verifyBtnGoToMyProfileIsEnabled();
        clickBtnGoToMyProfile();
    }

    @Step("Step: Check for the Account Details Page Content")
    public void editNickNameField() throws Exception {
        verifyEditNicknameLinkIsEnabled();
        clickEditNickname();
        verifyFieldEditNicknameIsEnabled();
        clearFieldEditNickname();
        setNewNickname();
        submitNewNickname();
        verifyNewlySetNickname();
    }

    @Step("Step: Check for Phone Number and Status")
    public void verifyNumberAndStatus() throws Exception {
        verifyPrepaidNumberIsDisplayed();
        verifyPrepaidNumberStatusIsDisplayed();
    }

    @Step("Step: Check for the Profile Status")
    public void verifyProfileStatus() throws Exception {
        verifyMyProfileLabelIsDisplayed();
        verifyMyProfileStatusIsDisplayed();
    }

}
