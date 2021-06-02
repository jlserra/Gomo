package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyChatWithUsPage extends BaseTestcase {

    @Test(testName = "VerifyChatWithUsPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be redirected to Chat with us modal")
    @Story("Story: Chat with us modal")
    public void navigateToChatWithUsModal() throws Exception {

        LoginTestCase.loginUser();
        homePage.clickHamburgerBtn();
        chatWithUsPage.clickChatWithUsBtn();
        Assert.assertTrue(chatWithUsPage.verifyChatWithUsModal());
    }
}
