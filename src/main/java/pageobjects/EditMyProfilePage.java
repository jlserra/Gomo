package pageobjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ConfigUtilities;

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

    @Step("Step: Verify if Next Button is Enabled")
    public Boolean VerifyIfNextBtnIsEnabled() throws Exception {
        log.info("Step: Verify if Next Button is enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnNextMyProfile", ConfigUtilities.Timers.normal));
        action.takeSnapShot("User clicked the Next Button");
        return action.isEnabled("btnNextMyProfile");
    }

    @Step("Step: Click Next Button")
    public void clickNextBtn() throws Exception {
        log.info("Step: Click Next Button");
        Assert.assertTrue(VerifyIfNextBtnIsEnabled());
        action.click("btnNextMyProfile");
        action.takeSnapShot("Click Next Button");
    }

    @Step("Step: Verify if Back Button is Enabled")
    public Boolean VerifyIfBackBtnIsEnabled() throws Exception {
        log.info("Step: Verify if Back Button is enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnBackMyProfile", ConfigUtilities.Timers.normal));
        action.takeSnapShot("User clicked the Back Go Button");
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

    @Step("Step: Enter First Name")
    public void enterFirstName(String text) throws Exception {
        log.info("Step: Enter First Name");
        Assert.assertTrue(verifyIfFirstNameTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldFirstName"));
        action.sendKeys("txtfieldFirstName", text);
        action.takeSnapShot("Enter First Name");
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

    @Step("Step: Enter Nick Name")
    public void enterNickName(String text) throws Exception {
        log.info("Step: Enter Nick Name");
        Assert.assertTrue(verifyIfNickNameTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldNickName2"));
        action.sendKeys("txtfieldNickName2", text);
        action.takeSnapShot("Enter Nick Name");
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

    @Step("Step: Enter Middle Name")
    public void enterMiddleName(String text) throws Exception {
        log.info("Step: Enter Middle Name");
        Assert.assertTrue(verifyIfMiddleNameTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldMiddleName"));
        action.sendKeys("txtfieldMiddleName", text);
        action.takeSnapShot("Enter Middle Name");
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

    @Step("Step: Enter Last Name")
    public void enterLastName(String text) throws Exception {
        log.info("Step: Enter Last Name");
        Assert.assertTrue(verifyIfLastNameTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldLastName"));
        action.sendKeys("txtfieldLastName", text);
        action.takeSnapShot("Enter Last Name");
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

    @Step("Step: Enter Suffix")
    public void enterSuffix(String text) throws Exception {
        log.info("Step: Enter Suffix");
        Assert.assertTrue(verifyIfSuffixTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldSuffix"));
        action.sendKeys("txtfieldSuffix", text);
        action.takeSnapShot("Enter Suffix");
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

    @Step("Step: Enter Mobile Number")
    public void enterMobileNumber(String text) throws Exception {
        log.info("Step: Enter Mobile Number");
        Assert.assertTrue(verifyIfMobileNumberTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldMobileNumber"));
        action.sendKeys("txtfieldMobileNumber", text);
        action.takeSnapShot("Enter Mobile Number");
    }

    @Step("Step: Verify if Invalid Mobile Number Error Message is Displayed")
    public Boolean verifyIfMobileNoErrorMsgIsDisplayed() throws Exception {
        log.info("Step: Verify if Invalid Mobile Number Error Message is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblMobileNoErrorMsg", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("MobileNoErrorMsg"), action.getText("lblMobileNoErrorMsg"));
        action.takeSnapShot("Invalid Mobile Number Error Message");
        return action.isDisplayed("lblMobileNoErrorMsg");
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

    @Step("Step: Enter Email Address")
    public void enterEmailAddress(String text) throws Exception {
        log.info("Step: Enter Email Address");
        Assert.assertTrue(verifyIfEmailAddressTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldEmailAddress"));
        action.sendKeys("txtfieldEmailAddress", text);
        action.takeSnapShot("Enter Mobile Number");
    }

    @Step("Step: Verify if Invalid Email Address Error Message is Displayed")
    public Boolean verifyIfEmailAddErrorMsgIsDisplayed() throws Exception {
        log.info("Step: Verify if Invalid Email Address Error Message is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblEmailErrorMsg", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("EmailErrorMsg"), action.getText("lblEmailErrorMsg"));
        action.takeSnapShot("Invalid Email Address Error Message");
        return action.isDisplayed("lblEmailErrorMsg");
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

    @Step("Step: Choose a Position")
    public void choosePosition(String text) throws Exception {
        log.info("Step: Choose a Position");
        Assert.assertTrue(verifyIfPositionDropdownIsEnabled());
        action.click("dropdownPositionDesc");
        selectFromDropdown(text);
        action.takeSnapShot("Choose a Position");
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

    @Step("Step: Choose a Department")
    public void chooseDepartment(String text) throws Exception {
        log.info("Step: Choose a Department");
        Assert.assertTrue(verifyIfDepartmentDropdownIsEnabled());
        action.click("dropdownDepartmentDesc");
        selectFromDropdown(text);
        action.takeSnapShot("Choose a Department");
    }

//Edit Business Information First Page
    @Step("Step: Verify if the user is in Edit My Profile Business Information")
    public void verifyIfEditMyProfileBusinessInfoPage() throws Exception {
        log.info("Step: Verify if the user is in Edit My Profile Business Information");
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

    @Step("Step: Enter Business Name")
    public void enterBusinessName(String text) throws Exception {
        log.info("Step: Enter Email Address");
        Assert.assertTrue(verifyIfBusinessNameTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldBusinessName"));
        action.sendKeys("txtfieldBusinessName", text);
        action.takeSnapShot("Enter Business Name");
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

    @Step("Step: Choose an Industry")
    public void chooseIndustry(String text) throws Exception {
        log.info("Step: Choose an Industry");
        Assert.assertTrue(verifyIfIndustryDropdownIsEnabled());
        action.click("dropdownIndustryDesc");
        selectFromDropdown(text);
        action.takeSnapShot("Choose an Industry");
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

    @Step("Step: Choose No. of Employees")
    public void chooseNoOfEmployees(String text) throws Exception {
        log.info("Step: Choose No. of Employees");
        Assert.assertTrue(verifyIfNoOfEmployeesDropdownIsEnabled());
        action.click("dropdownNoOfEmpDesc");
        selectFromDropdown(text);
        action.takeSnapShot("Choose No of Employees");
    }

//Edit Business Information Second Page
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

    @Step("Step: Enter Floor/Unit No.")
    public void enterFlrUnitNo(String text) throws Exception {
        log.info("Step: Enter Floor/Unit No.");
        Assert.assertTrue(verifyIfFlrUnitNoTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldFlrUnitNo"));
        action.sendKeys("txtfieldFlrUnitNo", text);
        action.takeSnapShot("Enter Floor/Unit No.");
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

    @Step("Step: Enter Street No.")
    public void enterStreetNo(String text) throws Exception {
        log.info("Step: Enter Street No.");
        Assert.assertTrue(verifyIfStreetNoTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldStreetNo"));
        action.sendKeys("txtfieldStreetNo", text);
        action.takeSnapShot("Enter Street No.");
    }

    //Building Name
    @Step("Step: Verify if Building Name Label is Displayed")
    public Boolean verifyBldgNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if Building Name Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblBldgName", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("bldgNameLbl"), action.getText("lblBldgName"));
        action.takeSnapShot("Building Name Label");
        return action.isDisplayed("lblBldgName");
    }

    @Step("Step: Verify if Building Name Text Field is Enabled")
    public Boolean verifyIfBldgNameTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Building Name Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldBldgName", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Building Name Text Field");
        return action.isEnabled("txtfieldBldgName");
    }

    @Step("Step: Enter Building Name")
    public void enterBldgName(String text) throws Exception {
        log.info("Step: Enter Building Name");
        Assert.assertTrue(verifyIfBldgNameTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldBldgName"));
        action.sendKeys("txtfieldBldgName", text);
        action.takeSnapShot("Enter Building Name");
    }

    //Street Name
    @Step("Step: Verify if Street Name Label is Displayed")
    public Boolean verifyStreetNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if Street Name Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblStreetName", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("streetNameLbl"), action.getText("lblStreetName"));
        action.takeSnapShot("Street Name Label");
        return action.isDisplayed("lblStreetName");
    }

    @Step("Step: Verify if Street Name Text Field is Enabled")
    public Boolean verifyIfStreetNameTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Street Name Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldStreetName", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Street Name Text Field");
        return action.isEnabled("txtfieldStreetName");
    }

    @Step("Step: Enter Street Name")
    public void enterStreetName(String text) throws Exception {
        log.info("Step: Enter Street Name");
        Assert.assertTrue(verifyIfStreetNameTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldStreetName"));
        action.sendKeys("txtfieldStreetName", text);
        action.takeSnapShot("Enter Street Name");
    }

    //Country
    @Step("Step: Verify if Country Label is Displayed")
    public Boolean verifyCountryLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if Country Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblCountry", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("countryLbl"), action.getText("lblCountry"));
        action.takeSnapShot("Country Label");
        return action.isDisplayed("lblCountry");
    }

    @Step("Step: Verify if Country Dropdown is Enabled")
    public Boolean verifyIfCountryDropdownIsEnabled() throws Exception {
        log.info("Step: Verify if Country Dropdown is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("dropdownCountry", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Country Dropdown");
        return action.isEnabled("dropdownCountry");
    }

    @Step("Step: Choose a Country")
    public void chooseCountry(String text) throws Exception {
        log.info("Step: Choose a Country");
        Assert.assertTrue(verifyIfCountryDropdownIsEnabled());
        action.click("dropdownCountryDesc");
        selectFromDropdown(text);
        action.takeSnapShot("Choose a Country");
    }

    //Province
    @Step("Step: Verify if Province Label is Displayed")
    public Boolean verifyProvinceLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if Province Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblProvince", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("provinceLbl"), action.getText("lblProvince"));
        action.takeSnapShot("Province Label");
        return action.isDisplayed("lblProvince");
    }

    @Step("Step: Verify if Province Dropdown is Enabled")
    public Boolean verifyIfProvinceDropdownIsEnabled() throws Exception {
        log.info("Step: Verify if Province Dropdown is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("dropdownProvince", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Province Dropdown");
        return action.isEnabled("dropdownProvince");
    }

    @Step("Step: Choose a Province")
    public void chooseProvince(String text) throws Exception {
        log.info("Step: Choose a Province");
        Assert.assertTrue(verifyIfProvinceDropdownIsEnabled());
        action.click("dropdownProvinceDesc");
        selectFromDropdown(text);
        action.takeSnapShot("Choose a Province");
    }

    //City
    @Step("Step: Verify if City Label is Displayed")
    public Boolean verifyCityLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if City Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblCity", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("cityLbl"), action.getText("lblCity"));
        action.takeSnapShot("City Label");
        return action.isDisplayed("lblCity");
    }

    @Step("Step: Verify if City Dropdown is Enabled")
    public Boolean verifyIfCityDropdownIsEnabled() throws Exception {
        log.info("Step: Verify if City Dropdown is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("dropdownCity", ConfigUtilities.Timers.normal));
        action.takeSnapShot("City Dropdown");
        return action.isEnabled("dropdownCity");
    }

    @Step("Step: Choose a City")
    public void chooseCity(String text) throws Exception {
        log.info("Step: Choose a City");
        Assert.assertTrue(verifyIfCityDropdownIsEnabled());
        action.click("dropdownCityDesc");
        selectFromDropdown(text);
        action.takeSnapShot("Choose a City");
    }

    //Barangay
    @Step("Step: Verify if Barangay Label is Displayed")
    public Boolean verifyBrgyLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if Barangay Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblBrgy", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("brgyLbl"), action.getText("lblBrgy"));
        action.takeSnapShot("Barangay Label");
        return action.isDisplayed("lblBrgy");
    }

    @Step("Step: Verify if Barangay Dropdown is Enabled")
    public Boolean verifyIfBrgyDropdownIsEnabled() throws Exception {
        log.info("Step: Verify if Barangay Dropdown is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("dropdownBrgy", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Barangay Dropdown");
        return action.isEnabled("dropdownBrgy");
    }

    @Step("Step: Choose a Barangay")
    public void chooseBrgy(String text) throws Exception {
        log.info("Step: Choose a Barangay");
        Assert.assertTrue(verifyIfBrgyDropdownIsEnabled());
        action.click("dropdownBrgyDesc");
        selectFromDropdown(text);
        action.takeSnapShot("Choose a Barangay");
    }

    //Postal Code
    @Step("Step: Verify if Postal Code Label is Displayed")
    public Boolean verifyPostalCodeLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if Postal Code Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPostalCode", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("postalCodeLbl"), action.getText("lblPostalCode"));
        action.takeSnapShot("Postal Code Label");
        return action.isDisplayed("lblPostalCode");
    }

    @Step("Step: Verify if Postal Code Text Field is Enabled")
    public Boolean verifyIfPostalCodeTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Postal Code Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldPostalCode", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Postal Code Text Field");
        return action.isEnabled("txtfieldPostalCode");
    }

    @Step("Step: Enter Postal Code")
    public void enterPostalCode(String text) throws Exception {
        log.info("Step: Enter Postal Code");
        Assert.assertTrue(verifyIfPostalCodeTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldPostalCode"));
        action.sendKeys("txtfieldPostalCode", text);
        action.takeSnapShot("Enter Postal Code");
    }

    //Landline No
    @Step("Step: Verify if Landline No Label is Displayed")
    public Boolean verifyLandlineNoLabelIsDisplayed() throws Exception {
        log.info("Step: Verify if Landline No Label is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblLandlineNo", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("landlineNoLbl"), action.getText("lblLandlineNo"));
        action.takeSnapShot("Landline No Label");
        return action.isDisplayed("lblLandlineNo");
    }

    @Step("Step: Verify if Landline No Text Field is Enabled")
    public Boolean verifyIfLandlineNoTextFieldIsEnabled() throws Exception {
        log.info("Step: Verify if Landline No Text Field is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("txtfieldLandlineNo", ConfigUtilities.Timers.normal));
        action.takeSnapShot("Landline No Text Field");
        return action.isEnabled("txtfieldLandlineNo");
    }

    @Step("Step: Enter Landline No")
    public void enterLandlineNo(String text) throws Exception {
        log.info("Step: Enter Landline No");
        Assert.assertTrue(verifyIfLandlineNoTextFieldIsEnabled());
        action.clearTextField(action.getElements("txtfieldLandlineNo"));
        action.sendKeys("txtfieldLandlineNo", text);
        action.takeSnapShot("Enter Landline No");
    }

    @Step("Step: Verify if Invalid Landline No Error Message is Displayed")
    public Boolean verifyIfLandlineErrorMsgIsDisplayed() throws Exception {
        log.info("Step: Verify if Invalid Landline No Error Message is Displayed");
        Assert.assertTrue(action.waitForElementToBeVisible("lblLandlineErrorMsg", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("LandlineErrorMsg"), action.getText("lblLandlineErrorMsg"));
        action.takeSnapShot("Invalid Landline No Error Message");
        return action.isDisplayed("lblLandlineErrorMsg");
    }

    //Consent
    @Step("Step: Verify Consent Header Spiel")
    public void verifyConsentHeaderSpiel() throws Exception {
        log.info("Step: Verify Consent Header Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("lblConsentHdr", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("consentHdrLbl"), action.getText("lblConsentHdr"));
        action.takeSnapShot("Consent Header Spiel");
    }

    @Step("Step: Verify Consent Message Spiel")
    public void verifyConsentMsgSpiel() throws Exception {
        log.info("Step: Verify Consent Message Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("lblConsentMsg", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("consentMsgLbl"), action.getText("lblConsentMsg"));
        action.takeSnapShot("Consent Message Spiel");
    }

    @Step("Step: Verify if Save My Profile Button is Enabled")
    public Boolean verifyIfSaveBtnIsEnabled() throws Exception {
        log.info("Step: Verify if Save My Profile Button is enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnSaveMyProfile", ConfigUtilities.Timers.normal));
        action.takeSnapShot("User clicked the Save My Profile Button");
        return action.isEnabled("btnSaveMyProfile");
    }

    @Step("Step: Click Save My Profile Button")
    public void clickSaveBtn() throws Exception {
        log.info("Step: Click Save Button");
        Assert.assertTrue(verifyIfSaveBtnIsEnabled());
        action.click("btnSaveMyProfile");
        action.takeSnapShot("Click Save My Profile Button");
    }

    @Step("Step: Select from the dropdown list")
    public void selectFromDropdown(String text) {
        log.info("Step: Select from the dropdown list");
        try {
            MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
            element.click();
            log.info("Successfully selected " + text);
        } catch (Exception e) {
            log.error(e, "Unable to find " + text);
        }
    }

//Thank You Page

    @Step("Step: Verify We'll Get Back To You Message Spiel")
    public void verifyGetBackMsgSpiel() throws Exception {
        log.info("Step: Verify We'll Get Back To You Message Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("lblSaveMsg1", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("saveMsg1"), action.getText("lblSaveMsg1"));
        action.takeSnapShot("We'll Get Back To You Message Spiel");
    }

    @Step("Step: Verify Thank You Message Spiel")
    public void verifyThankYouMsgSpiel() throws Exception {
        log.info("Step: Verify Thank You Message Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("lblSaveMsg2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("saveMsg2"), action.getText("lblSaveMsg2"));
        action.takeSnapShot("Thank You Message Spiel");
    }

    @Step("Step: Verify if Next Button is Enabled")
    public Boolean VerifyIfThankYouPageNextBtnIsEnabled() throws Exception {
        log.info("Step: Verify if Next Button is enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnNextAfterSavingProfile", ConfigUtilities.Timers.normal));
        action.takeSnapShot("User clicked the Next Button");
        return action.isEnabled("btnNextAfterSavingProfile");
    }

    @Step("Step: Click Next Button")
    public void clickThankYouPageNextBtn() throws Exception {
        log.info("Step: Click Save Button");
        Assert.assertTrue(VerifyIfThankYouPageNextBtnIsEnabled());
        action.click("btnNextAfterSavingProfile");
        action.takeSnapShot("Click Next Button");
    }


//TEST STEPS

    @Step("Step: Verify Edit My Profile Personal Information Page")
    public void verifyEditMyProfilePersonalInfo() throws Exception {
        log.info("Step: Verify Edit My Profile Personal Information Page");
        verifyIfEditMyProfilePage();
        verifyEditMyProfilePersonalInfoSpiel();
        Assert.assertTrue(verifyPrepaidNumberLabelIsDisplayed());
        Assert.assertTrue(verifyIfPrepaidNumberTextFieldIsEnabled());
        Assert.assertTrue(verifyFirstNameLabelIsDisplayed());
        Assert.assertTrue(verifyIfFirstNameTextFieldIsEnabled());
        Assert.assertTrue(verifyNickNameLabelIsDisplayed());
        Assert.assertTrue(verifyIfNickNameTextFieldIsEnabled());
        Assert.assertTrue(verifyMiddleNameLabelIsDisplayed());
        Assert.assertTrue(verifyIfMiddleNameTextFieldIsEnabled());
        Assert.assertTrue(verifyLastNameLabelIsDisplayed());
        Assert.assertTrue(verifyIfLastNameTextFieldIsEnabled());
        Assert.assertTrue(verifySuffixLabelIsDisplayed());
        Assert.assertTrue(verifyIfSuffixTextFieldIsEnabled());
        Assert.assertTrue(verifyMobileNumberLabelIsDisplayed());
        Assert.assertTrue(verifyIfMobileNumberTextFieldIsEnabled());
        Assert.assertTrue(verifyEmailAddressLabelIsDisplayed());
        Assert.assertTrue(verifyIfEmailAddressTextFieldIsEnabled());
        action.scrollIntoElement("lblMobileNumber");
        Assert.assertTrue(verifyPositionLabelIsDisplayed());
        Assert.assertTrue(verifyIfPositionDropdownIsEnabled());
        Assert.assertTrue(verifyDepartmentLabelIsDisplayed());
        Assert.assertTrue(verifyIfDepartmentDropdownIsEnabled());
    }

    @Step("Step: Verify Edit My Profile Business Information First Page")
    public void verifyEditMyProfileBusinessInfoFirstPage() throws Exception {
        log.info("Step: Verify Edit My Profile Business Information First Page");
        verifyIfEditMyProfileBusinessInfoPage();
        verifyEditMyProfileBusinessInfoSpiel();
        Assert.assertTrue(verifyBusinessNameLabelIsDisplayed());
        Assert.assertTrue(verifyIfBusinessNameTextFieldIsEnabled());
        Assert.assertTrue(verifyIndustryLabelIsDisplayed());
        Assert.assertTrue(verifyIfIndustryDropdownIsEnabled());
        Assert.assertTrue(verifyNoOfEmployeesLabelIsDisplayed());
        Assert.assertTrue(verifyIfNoOfEmployeesDropdownIsEnabled());
    }

    @Step("Step: Verify Edit My Profile Business Information Second Page")
    public void verifyEditMyProfileBusinessInfoSecPage() throws Exception {
        log.info("Step: Verify Edit My Profile Business Information Second Page");
        verifyIfEditMyProfileBusinessInfoPage();
        verifyEditMyProfileBusinessInfoSpiel2();
        Assert.assertTrue(verifyFlrUnitNoLabelIsDisplayed());
        Assert.assertTrue(verifyIfFlrUnitNoTextFieldIsEnabled());
        Assert.assertTrue(verifyStreetNoLabelIsDisplayed());
        Assert.assertTrue(verifyIfStreetNoTextFieldIsEnabled());
        Assert.assertTrue(verifyBldgNameLabelIsDisplayed());
        Assert.assertTrue(verifyIfBldgNameTextFieldIsEnabled());
        Assert.assertTrue(verifyStreetNameLabelIsDisplayed());
        Assert.assertTrue(verifyIfStreetNameTextFieldIsEnabled());
        Assert.assertTrue(verifyCountryLabelIsDisplayed());
        Assert.assertTrue(verifyIfCountryDropdownIsEnabled());
        Assert.assertTrue(verifyProvinceLabelIsDisplayed());
        Assert.assertTrue(verifyIfProvinceDropdownIsEnabled());
        Assert.assertTrue(verifyCityLabelIsDisplayed());
        Assert.assertTrue(verifyIfCityDropdownIsEnabled());
        Assert.assertTrue(verifyBrgyLabelIsDisplayed());
        Assert.assertTrue(verifyIfBrgyDropdownIsEnabled());
        action.scrollIntoElement("lblFlrUnitNo");
        Assert.assertTrue(verifyPostalCodeLabelIsDisplayed());
        Assert.assertTrue(verifyIfPostalCodeTextFieldIsEnabled());
        Assert.assertTrue(verifyLandlineNoLabelIsDisplayed());
        Assert.assertTrue(verifyIfLandlineNoTextFieldIsEnabled());
        verifyConsentHeaderSpiel();
        verifyConsentMsgSpiel();
    }

    @Step("Step: Enter Valid Values In Personal Information Page")
    public void enterValidValuesInPersonalInfo() throws Exception {
        log.info("Step: Enter Valid Values In Personal Information Page");
        verifyIfEditMyProfilePage();
        enterFirstName(excel.getTestdata("validFirstName"));
        enterNickName(excel.getTestdata("validNickName"));
        enterMiddleName(excel.getTestdata("validMiddleName"));
        enterLastName(excel.getTestdata("validLastName"));
        enterSuffix(excel.getTestdata("validSuffix"));
        enterMobileNumber(excel.getTestdata("validMobileNo"));
        enterEmailAddress(excel.getTestdata("validEmailAdd"));
        action.scrollIntoElement("lblMobileNumber");
        choosePosition(excel.getTestdata("validPosition"));
        chooseDepartment(excel.getTestdata("validDepartment"));
    }

    @Step("Step: Enter Valid Values In Business Information First Page")
    public void enterValidValuesInBusinessInfoFirstPage() throws Exception {
        log.info("Step: Enter Valid Values In Business Information First Page");
        verifyIfEditMyProfileBusinessInfoPage();
        enterBusinessName(excel.getTestdata("validBusinessName"));
        chooseIndustry(excel.getTestdata("validIndustry"));
        chooseNoOfEmployees(excel.getTestdata("validNoOfEmp"));
    }

    @Step("Step: Enter Valid Values In Business Information Second Page")
    public void enterValidValuesInBusinessInfoSecPage() throws Exception {
        log.info("Step: Enter Valid Values In Business Information Second Page");
        verifyIfEditMyProfileBusinessInfoPage();
        enterFlrUnitNo(excel.getTestdata("validFlrUnitNo"));
        enterStreetNo(excel.getTestdata("validStreetNo"));
        enterBldgName(excel.getTestdata("validBldgName"));
        enterStreetName(excel.getTestdata("validStreetName"));
        chooseCountry(excel.getTestdata("validCountry"));
        chooseProvince(excel.getTestdata("validProvince"));
        chooseCity(excel.getTestdata("validCity"));
        chooseBrgy(excel.getTestdata("validBrgy"));
        action.scrollIntoElement("lblFlrUnitNo");
        enterPostalCode(excel.getTestdata("validPostal"));
        enterLandlineNo(excel.getTestdata("validLandline"));
    }

    @Step("Step: Enter Invalid Values In Personal Information Page")
    public void enterInvalidValuesInPersonalInfo() throws Exception {
        log.info("Step: Enter Invalid Values In Personal Information Page");
        verifyIfEditMyProfilePage();
        enterMobileNumber(excel.getTestdata("invalidMobileNo"));
        Assert.assertTrue(verifyIfMobileNoErrorMsgIsDisplayed());
        action.scrollIntoElement("lblMobileNumber");
        enterEmailAddress(excel.getTestdata("invalidEmailAdd"));
        Assert.assertTrue(verifyIfEmailAddErrorMsgIsDisplayed());
    }

    @Step("Step: Enter Invalid Values In Business Information Second Page")
    public void enterInvalidValuesInBusinessInfoSecPage() throws Exception {
        log.info("Step: Enter Invalid Values In Business Information Second Page");
        verifyIfEditMyProfileBusinessInfoPage();
        action.scrollIntoElement("lblCountry");
        enterLandlineNo(excel.getTestdata("invalidLandline"));
        Assert.assertTrue(verifyIfLandlineErrorMsgIsDisplayed());
    }

    @Step("Step: Verify Thank You Message Upon Clicking Save My Profile Button")
    public void verifyThankYouMsgUponSave() throws Exception {
        log.info("Step: Verify Thank You Message Upon Clicking Save My Profile Button");
        verifyGetBackMsgSpiel();
        verifyThankYouMsgSpiel();
        Assert.assertTrue(VerifyIfThankYouPageNextBtnIsEnabled());
    }


}
