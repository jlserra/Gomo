package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyHelpSupportPage extends BaseTestcase{

    @Test(testName = "VerifyHelpSupportPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be redirected to Help & Support Page")
    @Story("Story: Help & Support Page")
    public void navigateToHelpSupportPagePage() throws Exception {

        LoginTestCase.loginUser();
        homePage.clickHamburgerBtn();
        helpSupportPage.clickHelpSupportBtn();


    }
}
