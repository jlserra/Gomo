package testcases;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyHomePage extends BaseTestcase{

    @Test(testName = "VerifyHomePage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for the Home Page")
    @Story("Story: Home Page")
    public void verifyChooseModemOne() throws Exception {

    }




}
