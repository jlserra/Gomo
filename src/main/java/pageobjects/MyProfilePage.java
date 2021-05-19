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

    // ****************** STEPS ****************************** //

    @Step("Step: Navigate Account Details Page")
    public void myProfilePageView() throws Exception {
        verifyPersonalInfoSection();
        verifyBusinessInfoSection();
        verifyBtnEditInfoIsEnabled();
    }


}
