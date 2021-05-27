package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ActionUtilities;
import utilities.ConfigUtilities;

public class MyProfilePage extends BasePage{

    MobileDriver driver;

    public MyProfilePage(MobileDriver driver) {
        this.driver = driver;
    }


    //*********  PageObject  **************//

    @Step("Step: Verify Personal Information")
    public Boolean verifyPersonalInfoSection() throws Exception {
        log.info("Step: Verify Personal Information");
        Assert.assertTrue(action.waitForElementToBeVisible("personalInfoSection", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("personalInfoSectionLbl"),action.getText("personalInfoSection"));
        return action.isDisplayed("personalInfoSection");
    }

    @Step("Step: Verify Business Information")
    public Boolean verifyBusinessInfoSection() throws Exception {
        log.info("Step: Verify Business Information");
        Assert.assertTrue(action.waitForElementToBeVisible("businessInfoSection", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("businessInfoSectionLbl"),action.getText("businessInfoSection"));
        return action.isDisplayed("businessInfoSection");
    }

    @Step("Step: Verify Button Edit Information")
    public Boolean verifyBtnEditInfoIsEnabled() throws Exception {
        log.info("Step: Verify Button Edit Information");
        Assert.assertTrue(action.waitForElementToBeVisible("btnEditProfile", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("btnLbl"),action.getText("btnEditProfile"));
        return action.isDisplayed("btnEditProfile");
    }

    @Step("Step: Verify Personal Information Label")
    public Boolean verifyPersonalInfoLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Personal Information Label");
        Assert.assertTrue(action.waitForElementToBeVisible("personalInfoLbl", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("personalInfoLbl"),action.getText("personalInfoLbl"));
        return action.isDisplayed("personalInfoLbl");
    }

    @Step("Step: Verify Full Name Label")
    public Boolean verifyFullNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Full Name Label");
        Assert.assertTrue(action.waitForElementToBeVisible("fullNameLbl", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("fullNameLbl"),action.getText("fullNameLbl"));
        return action.isDisplayed("fullNameLbl");
    }

    @Step("Step: Verify Full Name is Displayed")
    public Boolean verifyFullNameTxtIsDisplayed() throws Exception {
        log.info("Step: Verify Full Name is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("fullNameTxt", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("fullName"),action.getText("fullNameTxt"));
        return action.isDisplayed("fullNameTxt");
    }

    @Step("Step: Verify Full Name Label")
    public Boolean verifyNickNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Full Name Label");
        Assert.assertTrue(action.waitForElementToBeVisible("nickNameLbl", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("nickNameLbl"),action.getText("nickNameLbl"));
        return action.isDisplayed("nickNameLbl");
    }

    @Step("Step: Verify Full Name is Displayed")
    public Boolean verifyNickNameTxtIsDisplayed() throws Exception {
        log.info("Step: Verify Full Name is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("nickNameTxt", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("nickNameTxt"),action.getText("nickNameTxt"));
        return action.isDisplayed("nickNameTxt");
    }

    @Step("Step: Verify Mobile Number Label")
    public Boolean verifyMobileNoLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Mobile Number Label");
        Assert.assertTrue(action.waitForElementToBeVisible("mobNumLbl", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("mobNoLbl"),action.getText("mobNumLbl"));
        return action.isDisplayed("mobNumLbl");
    }

    @Step("Step: Verify Mobile Number is Displayed")
    public Boolean verifyMobileNoTxtIsDisplayed() throws Exception {
        log.info("Step: Verify Mobile Number is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("mobNumTxt", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("mobNoTxt"),action.getText("mobNumTxt"));
        return action.isDisplayed("mobNumTxt");
    }

    @Step("Step: Verify Email Label")
    public Boolean verifyEmailLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Email Label");
        Assert.assertTrue(action.waitForElementToBeVisible("emailLbl", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("emailLbl"),action.getText("emailLbl"));
        return action.isDisplayed("emailLbl");
    }

    @Step("Step: Verify Email is Displayed")
    public Boolean verifyEmailTxtIsDisplayed() throws Exception {
        log.info("Step: Verify Email Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("emailTxt", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("emailTxtApp"),action.getText("emailTxt"));
        return action.isDisplayed("emailTxt");
    }

    @Step("Step: Verify Position Label")
    public Boolean verifyPositionLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Position Label");
        Assert.assertTrue(action.waitForElementToBeVisible("positionLbl", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("positionLbl"),action.getText("positionLbl"));
        return action.isDisplayed("positionLbl");
    }

    @Step("Step: Verify Position is Displayed")
    public Boolean verifyPositionTxtIsDisplayed() throws Exception {
        log.info("Step: Verify Position Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("positionTxt", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("positionTxtApp"),action.getText("positionTxt"));
        return action.isDisplayed("positionTxt");
    }

    @Step("Step: Verify Department Label")
    public Boolean verifyDepartmentLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Department Label");
        Assert.assertTrue(action.waitForElementToBeVisible("departmentLbl", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("deptLbl"),action.getText("departmentLbl"));
        return action.isDisplayed("departmentLbl");
    }

    @Step("Step: Verify Department is Displayed")
    public Boolean verifyDepartmentTxtIsDisplayed() throws Exception {
        log.info("Step: Verify Department Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("departmentTxt", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("deptTxtApp"),action.getText("departmentTxt"));
        return action.isDisplayed("departmentTxt");
    }

    @Step("Step: Click Business Information Section")
    public void clickBusinessInformationSection() throws Exception {
        log.info("Step: Click Business Information Section");
        action.takeSnapShot("User clicked Business Information Section");
        action.waitForElementToBeClickable("businessInfoSection",ConfigUtilities.Timers.slow);
        action.click("businessInfoSection");
    }


    // ****************** STEPS ****************************** //

    @Step("Step: Navigate Account Details Page")
    public void myProfilePageView() throws Exception {
        verifyPersonalInfoSection();
        verifyBusinessInfoSection();
        verifyBtnEditInfoIsEnabled();
    }

    @Step("Step: Navigate Account Details Page")
    public void verifyPersonalInfo() throws Exception {
        verifyPersonalInfoLabelIsDisplayed();
        verifyFullNameLabelIsDisplayed();
        verifyFullNameTxtIsDisplayed();
        verifyNickNameLabelIsDisplayed();
        verifyNickNameTxtIsDisplayed();
        verifyMobileNoLabelIsDisplayed();
        verifyMobileNoTxtIsDisplayed();
        verifyEmailLabelIsDisplayed();
        verifyEmailTxtIsDisplayed();
        verifyPositionLabelIsDisplayed();
        verifyPositionTxtIsDisplayed();
        action.swipe(ActionUtilities.Direction.UP);
        verifyDepartmentLabelIsDisplayed();
        verifyDepartmentTxtIsDisplayed();
    }

    @Step("Step: Navigate Account Details Page")
    public void verifyBusinessInfo() throws Exception {
        verifyPersonalInfoSection();
        verifyBusinessInfoSection();
        clickBusinessInformationSection();

    }


}
