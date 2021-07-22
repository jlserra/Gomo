package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyAddNewModemPage extends BaseTestcase{

    @Test(testName = "NavigateToAddNewModemPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be redirected to Add New Modem Page")
    @Story("Story: Add New Modem Page")
    public void navigateToAddNewModemPage() throws Exception {

        LoginTestCase.loginUser();
        addNewModemPage.clickAddANewModemBtn();

    }

    @Test(testName = "VerifyWhereCanIFindTheseModal", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be able to click Where Can I Find These? link ")
    @Story("Story: Add New Modem Page")
    public void verifyWhereCanIFindTheseModal() throws Exception {

        navigateToAddNewModemPage();
        addNewModemPage.verifyWhereCanIFindTheseModal();

    }
    @Test(testName = "VerifyEnterMobileNumber", priority = 3)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be able enter Mobile Number ")
    @Story("Story: Add New Modem Page")
    public void verifyEnterMobileNumber() throws Exception {

        navigateToAddNewModemPage();
        addNewModemPage.mobileNumberTextField(excel.getTestdata("number"));


    }

    @Test(testName = "VerifyPromoSubscriptiontoggle", priority = 4)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be able to click Promo Subscription toggle ")
    @Story("Story: Add New Modem Page")
    public void verifyPromoSubscriptiontoggle() throws Exception {

        verifyEnterMobileNumber();
        addNewModemPage.promoSubscriptiontoggle();
    }

    @Test(testName = "VerifyEnterModemNickname", priority = 5)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be able to enter a nickname ")
    @Story("Story: Add New Modem Page")
    public void verifyEnterModemNickname() throws Exception {

        verifyPromoSubscriptiontoggle();
        addNewModemPage.enterModemNickname(excel.getTestdata("modemname"));
    }
}
