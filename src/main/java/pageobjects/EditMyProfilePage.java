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

    @Step("Step: Verify if the user is in Edit My Profile Page")
    public void verifyIfEditMyProfilePage() throws Exception {
        log.info("Step: Verify if the user is in Edit My Profile Page");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPersonalInfo", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("personalInfoLbl"), action.getText("lblPersonalInfo"));
        action.takeSnapShot("Edit My Profile Page");
    }

    @Step("Step: Verify Edit My Profile Page - Personal Information Spiel")
    public void verifyEditMyProfilePersonalInfoSpiel() throws Exception {
        log.info("Step: Verify Edit My Profile Page - Personal Information Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPersonalInfoSpiel", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("personalInfoSpiel"), action.getText("lblPersonalInfoSpiel"));
        action.takeSnapShot("Edit My Profile Page Spiel");
    }

    @Step("Step: Verify Prepaid Number Label")
    public Boolean verifyPrepaidNumberLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Prepaid Number Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPrepaidNumber", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("prepaidNumberLbl"), action.getText("lblPrepaidNumber"));
        action.takeSnapShot("Prepaid Number Label");
        return action.isDisplayed("lblPrepaidNumber");
    }

    @Step("Step: Verify First Name Label")
    public Boolean verifyFirstNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify First Name Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblFirstName", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("firstNameLbl"), action.getText("lblFirstName"));
        action.takeSnapShot("First Name Label");
        return action.isDisplayed("lblFirstName");
    }

    @Step("Step: Verify Nick Name Label")
    public Boolean verifyNickNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Nick Name Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblNickName", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("nickNameLbl"), action.getText("lblNickName"));
        action.takeSnapShot("Nick Name Label");
        return action.isDisplayed("lblNickName");
    }

    @Step("Step: Verify Middle Name Label")
    public Boolean verifyMiddleNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Middle Name Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblMiddleName", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("middleNameLbl"), action.getText("lblMiddleName"));
        action.takeSnapShot("Middle Name Label");
        return action.isDisplayed("lblMiddleName");
    }

    @Step("Step: Verify Last Name Label")
    public Boolean verifyLastNameLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Last Name Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblLastName", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("lastNameLbl"), action.getText("lblLastName"));
        action.takeSnapShot("Last Name Label");
        return action.isDisplayed("lblLastName");
    }

    @Step("Step: Verify Suffix Label")
    public Boolean verifySuffixLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Suffix Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblSuffix", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("suffixLbl"), action.getText("lblSuffix"));
        return action.isDisplayed("lblSuffix");
    }

    @Step("Step: Mobile Number Label")
    public Boolean verifyMobileNumberLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Mobile Number Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblMobileNumber", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("mobileNumberLbl"), action.getText("lblMobileNumber"));
        return action.isDisplayed("lblMobileNumber");
    }

    @Step("Step: Verify Email Address Label")
    public Boolean verifyEmailAddressLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Email Address Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblEmailAddress", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("emailAddressLbl"), action.getText("lblEmailAddress"));
        return action.isDisplayed("lblEmailAddress");
    }

    @Step("Step: Verify Position Label")
    public Boolean verifyPositionLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Position Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPosition", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("positionLbl"), action.getText("lblPosition"));
        return action.isDisplayed("lblPosition");
    }

    @Step("Step: Verify Department Label")
    public Boolean verifyDepartmentLabelIsDisplayed() throws Exception {
        log.info("Step: Verify Department Label");
        Assert.assertTrue(action.waitForElementToBeVisible("lblDepartment", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("departmentLbl"), action.getText("lblDepartment"));
        return action.isDisplayed("lblDepartment");
    }


//TEST STEPS

    @Step("Step: Verify Edit My Profile Personal Information Page")
    public void verifyEditMyProfilePersonalInfo() throws Exception {
        clickEditMyProfileBtn();
        verifyIfEditMyProfilePage();
        verifyEditMyProfilePersonalInfoSpiel();
        verifyPrepaidNumberLabelIsDisplayed();
        verifyFirstNameLabelIsDisplayed();
        verifyNickNameLabelIsDisplayed();
        verifyMiddleNameLabelIsDisplayed();
        verifyLastNameLabelIsDisplayed();
        verifySuffixLabelIsDisplayed();
        verifyMobileNumberLabelIsDisplayed();
        verifyEmailAddressLabelIsDisplayed();
        action.swipe(ActionUtilities.Direction.UP);
        verifyPositionLabelIsDisplayed();
        verifyDepartmentLabelIsDisplayed();
        clickNextBtn();
    }

}
