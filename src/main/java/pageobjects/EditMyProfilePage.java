package pageobjects;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import utilities.ActionUtilities;
import utilities.ConfigUtilities;

import java.util.HashMap;

public class EditMyProfilePage extends BasePage {

    MobileDriver driver;

    public EditMyProfilePage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Click Edit My Profile Button")
    public void clickEditMyProfileBtn () throws Exception {
        log.info("Step: Click Edit My Profile Button");
        Assert.assertTrue(action.waitForElementToBeVisible("btnEditProfile", ConfigUtilities.Timers.normal));
        action.click("btnEditProfile");
        action.takeSnapShot("Click Edit My Profile Button");
    }

    @Step("Step: Verify if the user is in Edit My Profile Page")
    public void verifyIfEditMyProfilePage() throws Exception {
        log.info("Step: Verify if the user is in Edit My Profile Page");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPersonalInfo", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("personalInfoLbl"), action.getText("lblPersonalInfo"));
        action.takeSnapShot("Edit My Profile Page");
    }

    @Step("Step: Verify Next Button is Enabled")
    public Boolean VerifyIfNextBtnIsEnabled() throws Exception {
        log.info("Step: Verify if Next Button is enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnNextMyProfile", ConfigUtilities.Timers.normal));
        action.takeSnapShot("User clicked the Let's Go Button");
        return action.isEnabled("btnNextMyProfile");
    }

    @Step("Step: Click Next Button")
    public void clickNextBtn() throws Exception {
        log.info("Step: Click Next Button");
        Assert.assertTrue(VerifyIfNextBtnIsEnabled());
        action.click("btnNextMyProfile");
        action.takeSnapShot("Click Next Button");
    }

    @Step("Step: Verify Back Button is Enabled")
    public Boolean VerifyIfBackBtnIsEnabled() throws Exception {
        log.info("Step: Verify if Back Button is enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnBackMyProfile", ConfigUtilities.Timers.normal));
        action.takeSnapShot("User clicked the Let's Go Button");
        return action.isEnabled("btnBackMyProfile");
    }

    @Step("Step: Click Back Button")
    public void clickBackBtn() throws Exception {
        log.info("Step: Click Back Button");
        Assert.assertTrue(VerifyIfBackBtnIsEnabled());
        action.click("btnBackMyProfile");
        action.takeSnapShot("Click Back Button");
    }

//Edit Personal Information Page
    @Step("Step: Verify Edit My Profile Page - Personal Information Spiel")
    public void verifyEditMyProfilePersonalInfoSpiel() throws Exception {
        log.info("Step: Verify Edit My Profile Page - Personal Information Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPersonalInfoSpiel", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("personalInfoSpiel"), action.getText("lblPersonalInfoSpiel"));
        action.takeSnapShot("Edit My Profile Page Spiel");
    }
    //Prepaid Number
    @Step("Step: Verify Prepaid Number Label")
    public Boolean verifyPrepaidNumberLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Prepaid Number Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPrepaidNumber", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("prepaidNumberLbl"), action.getText("lblPrepaidNumber"));
        action.takeSnapShot("Prepaid Number Label");
        return action.isDisplayed("lblPrepaidNumber");
    }

    @Step("Step: Verify if Prepaid Number Text Field is Enabled")
    public Boolean verifyIfPrepaidNumberTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Prepaid Number Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldPrepaidNumber", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Prepaid Number Text Field");
        return action.isEnabled("txtfieldPrepaidNumber");
    }

    @Step("Step: Verify if Prepaid Number Text is Displayed")
    public void verifyPrepaidNumberText() throws Exception {
        log.info("Step: Verify if Prepaid Number Text is Displayed");
        Assert.assertTrue(verifyIfPrepaidNumberTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultPrepNumberTxt"), action.getText("txtfieldPrepaidNumber"));
        action.takeSnapShot("Prepaid Number Text");
    }

    //First Name
    @Step("Step: Verify First Name Label")
    public Boolean verifyFirstNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify First Name Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblFirstName", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("firstNameLbl"), action.getText("lblFirstName"));
        action.takeSnapShot("First Name Label");
        return action.isDisplayed("lblFirstName");
    }

    @Step("Step: Verify if First Name Text Field is Enabled")
    public Boolean verifyIfFirstNameTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if First Name Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldFirstName", ConfigUtilities.Timers.normal));
        action.takeSnapShot("First Name Text Field");
        return action.isEnabled("txtfieldFirstName");
    }

    @Step("Step: Verify if First Name Text is Displayed")
    public void verifyFirstNameText() throws Exception {
        log.info("Step: Verify if First Name Text is Displayed");
        Assert.assertTrue(verifyIfFirstNameTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultFirstName"), action.getText("txtfieldFirstName"));
        action.takeSnapShot("First Name Text");
    }

    //Nick Name
    @Step("Step: Verify Nick Name Label")
    public Boolean verifyNickNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Nick Name Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblNickName", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("nickNameLbl"), action.getText("lblNickName"));
        action.takeSnapShot("Nick Name Label");
        return action.isDisplayed("lblNickName");
    }

    @Step("Step: Verify if Nick Name Text Field is Enabled")
    public Boolean verifyIfNickNameTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Nick Name Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldNickName2", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Nick Name Text Field");
        return action.isEnabled("txtfieldNickName2");
    }

    @Step("Step: Verify if Nick Name Text is Displayed")
    public void verifyNickNameText() throws Exception {
        log.info("Step: Verify if Nick Name Text is Displayed");
        Assert.assertTrue(verifyIfNickNameTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultNickName"), action.getText("txtfieldNickName2"));
        action.takeSnapShot("Nick Name Text");
    }



    //Middle Name
    @Step("Step: Verify Middle Name Label")
    public Boolean verifyMiddleNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Middle Name Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblMiddleName", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("middleNameLbl"), action.getText("lblMiddleName"));
        action.takeSnapShot("Middle Name Label");
        return action.isDisplayed("lblMiddleName");
    }

    @Step("Step: Verify if Middle Name Text Field is Enabled")
    public Boolean verifyIfMiddleNameTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Middle Name Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldMiddleName", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Middle Name Text Field");
        return action.isEnabled("txtfieldMiddleName");
    }

    @Step("Step: Verify if Middle Name Text is Displayed")
    public void verifyMiddleNameText() throws Exception {
        log.info("Step: Verify if Middle Name Text is Displayed");
        Assert.assertTrue(verifyIfMiddleNameTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultMiddleName"), action.getText("txtfieldMiddleName"));
        action.takeSnapShot("Middle Name Text");
    }

    //Last Name
    @Step("Step: Verify Last Name Label")
    public Boolean verifyLastNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Last Name Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblLastName", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("lastNameLbl"), action.getText("lblLastName"));
        action.takeSnapShot("Last Name Label");
        return action.isDisplayed("lblLastName");
    }

    @Step("Step: Verify if Last Name Text Field is Enabled")
    public Boolean verifyIfLastNameTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Last Name Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldLastName", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Last Name Text Field");
        return action.isEnabled("txtfieldLastName");
    }

    @Step("Step: Verify if Last Name Text is Displayed")
    public void verifyLastNameText() throws Exception {
        log.info("Step: Verify if Last Name Text is Displayed");
        Assert.assertTrue(verifyIfLastNameTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultLastName"), action.getText("txtfieldLastName"));
        action.takeSnapShot("Last Name Text");
    }

    //Suffix
    @Step("Step: Verify Suffix Label")
    public Boolean verifySuffixLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Suffix Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblSuffix", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("suffixLbl"), action.getText("lblSuffix"));
        return action.isDisplayed("lblSuffix");
    }

    @Step("Step: Verify if Suffix Text Field is Enabled")
    public Boolean verifyIfSuffixTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Suffix Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldSuffix", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Suffix Text Field");
        return action.isEnabled("txtfieldSuffix");
    }

    @Step("Step: Verify if Suffix Text is Displayed")
    public void verifySuffixText() throws Exception {
        log.info("Step: Verify if Suffix Text is Displayed");
        Assert.assertTrue(verifyIfSuffixTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultSuffix"), action.getText("txtfieldSuffix"));
        action.takeSnapShot("Suffix Text");
    }

    //Mobile Number
    @Step("Step: Mobile Number Label")
    public Boolean verifyMobileNumberLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Mobile Number Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblMobileNumber", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("mobileNumberLbl"), action.getText("lblMobileNumber"));
        return action.isDisplayed("lblMobileNumber");
    }

    @Step("Step: Verify if Mobile Number Text Field is Enabled")
    public Boolean verifyIfMobileNumberTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Mobile Number Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldMobileNumber", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Mobile Number Text Field");
        return action.isEnabled("txtfieldMobileNumber");
    }

    @Step("Step: Verify if Mobile Number Text is Displayed")
    public void verifyMobileNumberText() throws Exception {
        log.info("Step: Verify if Mobile Number Text is Displayed");
        Assert.assertTrue(verifyIfMobileNumberTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultMobileNumber"), action.getText("txtfieldMobileNumber"));
        action.takeSnapShot("Mobile Number Text");
    }

    //Email Address
    @Step("Step: Verify Email Address Label")
    public Boolean verifyEmailAddressLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Email Address Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblEmailAddress", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("emailAddressLbl"), action.getText("lblEmailAddress"));
        return action.isDisplayed("lblEmailAddress");
    }

    @Step("Step: Verify if Email Address Text Field is Enabled")
    public Boolean verifyIfEmailAddressTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Mobile Number Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldEmailAddress", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Email Address Text Field");
        return action.isEnabled("txtfieldEmailAddress");
    }

    @Step("Step: Verify if Email Address Text is Displayed")
    public void verifyEmailAddressText() throws Exception {
        log.info("Step: Verify if Email Address Text is Displayed");
        Assert.assertTrue(verifyIfEmailAddressTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultEmailAddress"), action.getText("txtfieldEmailAddress"));
        action.takeSnapShot("Email Address Text");
    }

    //Position
    @Step("Step: Verify Position Label")
    public Boolean verifyPositionLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Position Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPosition", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("positionLbl"), action.getText("lblPosition"));
        return action.isDisplayed("lblPosition");
    }

    @Step("Step: Verify if Position Dropdown is Enabled")
    public Boolean verifyIfPositionDropdownIsEnabled() throws Exception {
        log.info("Step: Verify if Position Dropdown is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("dropdownPosition", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Position Text Field");
        return action.isEnabled("dropdownPosition");
    }

    @Step("Step: Verify if Position Text is Displayed")
    public void verifyPositionText() throws Exception {
        log.info("Step: Verify if Position Dropdown Text is Displayed");
        Assert.assertTrue(verifyIfPositionDropdownIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultPosition"), action.getText("dropdownPositionDesc"));
        action.takeSnapShot("Position Text");
    }

    //Department
    @Step("Step: Verify Department Label")
    public Boolean verifyDepartmentLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Department Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblDepartment", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("departmentLbl"), action.getText("lblDepartment"));
        return action.isDisplayed("lblDepartment");
    }

    @Step("Step: Verify if Department Dropdown is Enabled")
    public Boolean verifyIfDepartmentDropdownIsEnabled() throws Exception {
        log.info("Step: Verify if Department Dropdown is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("dropdownDepartment", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Department Text Field");
        return action.isEnabled("dropdownDepartment");
    }

    @Step("Step: Verify if Department Text is Displayed")
    public void verifyDepartmentText() throws Exception {
        log.info("Step: Verify if Department Text is Displayed");
        Assert.assertTrue(verifyIfDepartmentDropdownIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultDepartment"), action.getText("dropdownDepartmentDesc"));
        action.takeSnapShot("Department Text");
    }

//Edit Business Information Page
    @Step("Step: Verify if the user is in Edit My Profile Business Information - First Page")
    public void verifyIfEditMyProfileBusinessInfoPage() throws Exception {
        log.info("Step: Verify if the user is in Edit My Profile Business Information - First Page");
        Assert.assertTrue(action.waitForElementToBeVisible("lblBusinessInfo", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("businessInfoLbl"), action.getText("lblBusinessInfo"));
        action.takeSnapShot("Edit My Profile Business Information Page");
    }

    @Step("Step: Verify Edit My Profile Page - Business Information First Page Spiel")
    public void verifyEditMyProfileBusinessInfoSpiel() throws Exception {
        log.info("Step: Verify Edit My Profile Page - Business Information First Page Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("lblBusinessInfoSpiel", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("businessInfoSpiel"), action.getText("lblBusinessInfoSpiel"));
        action.takeSnapShot("Edit My Profile Business Information Spiel");
    }

    //Business Name
    @Step("Step: Verify Business Name Label")
    public Boolean verifyBusinessNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Business Name Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblBusinessName", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("businessNameLbl"), action.getText("lblBusinessName"));
        action.takeSnapShot("Business Name Label");
        return action.isDisplayed("lblBusinessName");
    }

    @Step("Step: Verify if Business Name Text Field is Enabled")
    public Boolean verifyIfBusinessNameTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Business Name Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldBusinessName", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Business Name Text Field");
        return action.isEnabled("txtfieldBusinessName");
    }

    @Step("Step: Verify if Business Name Text is Displayed")
    public void verifyBusinessNameText() throws Exception {
        log.info("Step: Verify if Business Name Text is Displayed");
        Assert.assertTrue(verifyIfBusinessNameTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultBusinessName"), action.getText("txtfieldBusinessName"));
        action.takeSnapShot("Business Name Text");
    }

    //Industry
    @Step("Step: Verify Industry Label")
    public Boolean verifyIndustryLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Industry Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblIndustry", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("industryLbl"), action.getText("lblIndustry"));
        action.takeSnapShot("Industry Label");
        return action.isDisplayed("lblIndustry");
    }

    @Step("Step: Verify if Industry Dropdown is Enabled")
    public Boolean verifyIfIndustryDropdownIsEnabled() throws Exception {
        log.info("Step: Verify if Industry Dropdown is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("dropdownIndustry", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Industry Dropdown");
        return action.isEnabled("dropdownIndustry");
    }

    @Step("Step: Verify if Industry Dropdown Text is Displayed")
    public void verifyIndustryText() throws Exception {
        log.info("Step: Verify if Industry Dropdown Text is Displayed");
        Assert.assertTrue(verifyIfIndustryDropdownIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultIndustry"), action.getText("dropdownIndustryDesc"));
        action.takeSnapShot("Industry Dropdown Text");
    }

    //Number of Employees
    @Step("Step: Verify Number of Employees Label")
    public Boolean verifyNoOfEmployeesLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Number of Employees Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblNoOfEmployees", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("noOfEmpLbl"), action.getText("lblNoOfEmployees"));
        action.takeSnapShot("Number of Employees Label");
        return action.isDisplayed("lblNoOfEmployees");
    }

    @Step("Step: Verify if No. Of Employees Dropdown is Enabled")
    public Boolean verifyIfNoOfEmployeesDropdownIsEnabled() throws Exception {
        log.info("Step: Verify if Industry Dropdown is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("dropdownNoOfEmp", ConfigUtilities.Timers.normal));
        action.takeSnapShot("No. Of Employees Dropdown");
        return action.isEnabled("dropdownNoOfEmp");
    }

    @Step("Step: Verify if No. Of Employees Dropdown Text is Displayed")
    public void verifyNoOfEmployeesText() throws Exception {
        log.info("Step: Verify if No. Of Employees Dropdown Text is Displayed");
        Assert.assertTrue(verifyIfNoOfEmployeesDropdownIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultNoOfEmp"), action.getText("dropdownNoOfEmpDesc"));
        action.takeSnapShot("No. Of Employees Dropdown Text");
    }

//Edit Personal Information Page
    @Step("Step: Verify Edit My Profile Page - Business Information Second Page Spiel")
    public void verifyEditMyProfileBusinessInfoSpiel2() throws Exception {
        log.info("Step: Verify Edit My Profile Page - Business Information Second Page Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("lblBusinessInfoSpiel2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("businessInfoSpiel2"), action.getText("lblBusinessInfoSpiel2"));
        action.takeSnapShot("Edit My Profile - Business Information Second Page Spiel");
    }

    //Floor/Unit No.
    @Step("Step: Verify if Floor/Unit No. Label is Displayed")
    public Boolean verifyFlrUnitNoLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if Floor/Unit No. Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblFlrUnitNo", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("flrUnitNoLbl"), action.getText("lblFlrUnitNo"));
        action.takeSnapShot("Floor/Unit Label");
        return action.isDisplayed("lblFlrUnitNo");
    }

    @Step("Step: Verify if Floor/Unit No. Text Field is Enabled")
    public Boolean verifyIfFlrUnitNoTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Floor/Unit No. Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldFlrUnitNo", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Floor/Unit No. Text Field");
        return action.isEnabled("txtfieldFlrUnitNo");
    }

    @Step("Step: Verify if Floor/Unit No. Text is Displayed")
    public void verifyFlrUnitNoText() throws Exception {
        log.info("Step: Verify if Floor/Unit No. Text is Displayed");
        Assert.assertTrue(verifyIfFlrUnitNoTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultFlrUnitNo"), action.getText("txtfieldFlrUnitNo"));
        action.takeSnapShot("Floor/Unit No. Text");
    }

    //Street No.
    @Step("Step: Verify if Street No. Label is Displayed")
    public Boolean verifyStreetNoLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if Street No. Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblStreetNo", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("streetNoLbl"), action.getText("lblStreetNo"));
        action.takeSnapShot("Street Label");
        return action.isDisplayed("lblStreetNo");
    }

    @Step("Step: Verify if Street No. Text Field is Enabled")
    public Boolean verifyIfStreetNoTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Street No. Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldStreetNo", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Street No. Text Field");
        return action.isEnabled("txtfieldStreetNo");
    }

    @Step("Step: Verify if Street No. Text is Displayed")
    public void verifyStreetNoText() throws Exception {
        log.info("Step: Verify if Street No. Text is Displayed");
        Assert.assertTrue(verifyIfStreetNoTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultStreetNo"), action.getText("txtfieldStreetNo"));
        action.takeSnapShot("Street No. Text");
    }

    //Street No.
    @Step("Step: Verify if Street No. Label is Displayed")
    public Boolean verifyStreetNoLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if Street No. Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblStreetNo", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("streetNoLbl"), action.getText("lblStreetNo"));
        action.takeSnapShot("Street Label");
        return action.isDisplayed("lblStreetNo");
    }

    @Step("Step: Verify if Street No. Text Field is Enabled")
    public Boolean verifyIfStreetNoTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Street No. Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldStreetNo", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Street No. Text Field");
        return action.isEnabled("txtfieldStreetNo");
    }

    @Step("Step: Verify if Street No. Text is Displayed")
    public void verifyStreetNoText() throws Exception {
        log.info("Step: Verify if Street No. Text is Displayed");
        Assert.assertTrue(verifyIfStreetNoTextFieldIsEnabled());
        Assert.assertEquals(excel.getTestdata("defaultStreetNo"), action.getText("txtfieldStreetNo"));
        action.takeSnapShot("Street No. Text");
    }


//TEST STEPS

    @Step("Step: Verify Edit My Profile Personal Information Page")
    public void verifyEditMyProfilePersonalInfo() throws Exception {
        clickEditMyProfileBtn();
        verifyIfEditMyProfilePage();
        verifyEditMyProfilePersonalInfoSpiel();
        Assert.assertTrue(verifyPrepaidNumberLabelIsDisplayed());
        verifyPrepaidNumberText();
        Assert.assertTrue(verifyFirstNameLabelIsDisplayed());
        verifyFirstNameText();
        Assert.assertTrue(verifyNickNameLabelIsDisplayed());
        verifyNickNameText();
        Assert.assertTrue(verifyMiddleNameLabelIsDisplayed());
        verifyMiddleNameText();
        Assert.assertTrue(verifyLastNameLabelIsDisplayed());
        verifyLastNameText();
        Assert.assertTrue(verifySuffixLabelIsDisplayed());
        verifySuffixText();
        Assert.assertTrue(verifyMobileNumberLabelIsDisplayed());
        verifyMobileNumberText();
        Assert.assertTrue(verifyEmailAddressLabelIsDisplayed());
        verifyEmailAddressText();
        action.swipe("lblPosition", "lblMobileNumber");
        Assert.assertTrue(verifyPositionLabelIsDisplayed());
        verifyPositionText();
        Assert.assertTrue(verifyDepartmentLabelIsDisplayed());
        verifyDepartmentText();
    }

    @Step("Step: Verify Edit My Profile Business Information First Page")
    public void verifyEditMyProfileBusinessInfoFirstPage() throws Exception {
        verifyIfEditMyProfileBusinessInfoPage();
        verifyEditMyProfileBusinessInfoSpiel();
        Assert.assertTrue(verifyBusinessNameLabelIsDisplayed());
        verifyBusinessNameText();
        Assert.assertTrue(verifyIndustryLabelIsDisplayed());
        verifyIndustryText();
        Assert.assertTrue(verifyNoOfEmployeesLabelIsDisplayed());
        verifyNoOfEmployeesText();
    }

    @Step("Step: Verify Edit My Profile Business Information First Page")
    public void verifyEditMyProfileBusinessInfoSecPage() throws Exception {
        verifyIfEditMyProfileBusinessInfoPage();
        verifyEditMyProfileBusinessInfoSpiel2();
        Assert.assertTrue(verifyFlrUnitNoLabelIsDisplayed());
        verifyFlrUnitNoText();
        Assert.assertTrue(verifyStreetNoLabelIsDisplayed());
        verifyStreetNoText();
    }

}
