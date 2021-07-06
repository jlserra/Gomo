package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyLogOutPage extends BaseTestcase{

    @Test(testName = "VerifyLogOutPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be redirected to LogOut Page")
    @Story("Story: LogOut Page")
    public void navigateToLogOutPage() throws Exception {

        LoginTestCase.loginUser();
        //Cancel button
        homePage.clickHamburgerBtn();
        logOutPage.clickLOGOUTLinktxt();
        logOutPage.clickCANCELBtn();
        //Logout button
        homePage.clickHamburgerBtn();
        logOutPage.clickLOGOUTLinktxt();
        logOutPage.clickLOGOUTBtn();
    }
}
