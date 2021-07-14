package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyPrivacyPolicyPage extends BaseTestcase{

    @Test(testName = "NavigateToPrivacyPolicyPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be redirected to Privacy Policy Page")
    @Story("Story: Privacy Policy Page")
    public void navigateToPrivacyPolicyPage() throws Exception {

        LoginTestCase.loginUser();
        homePage.clickHamburgerBtn();
        privacyPolicyPage.clickPrivacyPolicyBtn();

    }
}
