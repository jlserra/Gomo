package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyAddNewModemPage extends BaseTestcase{

    @Test(testName = "VerifyAddNewModemPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be redirected to Add New Modem Page")
    @Story("Story: Add New Modem Page")
    public void navigateToAddNewModemPage() throws Exception {

        LoginTestCase.loginUser();
        addNewModemPage.clickAddANewModemBtn();

    }
}
