package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
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
        Assert.assertTrue(action.waitForElementToBeVisible("personalInfoLbl", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("personalInfoLbl"),action.getText("personalInfoLbl"));
        return action.isDisplayed("personalInfoLbl");
    }

    @Step("Step: Verify Business Information")
    public Boolean verifyBusinessInfoSection() throws Exception {
        log.info("Step: Verify Business Information");
        Assert.assertTrue(action.waitForElementToBeVisible("businessInfoLbl", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("businessInfoLbl"),action.getText("businessInfoLbl"));
        return action.isDisplayed("businessInfoLbl");
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
    }


}
