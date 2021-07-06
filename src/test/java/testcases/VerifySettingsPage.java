package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testcases.ListenerTestcase.class)
public class VerifySettingsPage extends BaseTestcase{

    @Description("Test Description: User will be redirected to Settings Page")
    @Story("Story: Settings Page")
    public void navigateToSettingsPage() throws Exception {

        LoginTestCase.loginUser();
        homePage.clickHamburgerBtn();
        settingsPage.clickSettingsBtn();
    }

    @Test(testName = "VerifySettingsPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be redirected to Change App PIN Page")
    @Story("Story: Change App PIN")
    public void verifyChangeAppPIN() throws Exception {

        navigateToSettingsPage();
        settingsPage.changeAppPIN();

    }
    @Test(testName = "VerifySettingsPage", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be redirected to Custom Alert Page")
    @Story("Story: Custom Alert")
    public void verifyCustomAlert() throws Exception {

        navigateToSettingsPage();
        settingsPage.customAlertSettings();

    }
}
