package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.HowToLoadPage;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyHowToLoadPage extends BaseTestcase{

    @Test(testName = "NavigateToHowToLoadPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be redirected to How to Load Page")
    @Story("Story: How to Load page")
    public void navigateToHowToLoadPage() throws Exception {

        LoginTestCase.loginUser();
        howToLoadPage.clickHowToLoadBtn();

    }
}
