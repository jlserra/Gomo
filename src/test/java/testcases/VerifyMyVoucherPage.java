package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyMyVoucherPage extends BaseTestcase{

    @Test(testName = "NavigateToMyVoucherPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be redirected to My Voucher Page")
    @Story("Story: My Voucher Page")
    public void navigateToMyVoucherPage() throws Exception {

        LoginTestCase.loginUser();
        homePage.clickHamburgerBtn();
        myVoucherPage.clickMyVoucherBtn();
        myVoucherPage.verifyIfMyVoucherPage();

    }

    @Test(testName = "VerifyMyVoucher", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check the Voucher")
    @Story("Story: My Voucher Page")
    public void verifyMyVoucher() throws Exception{

        LoginTestCase.loginUser();
        homePage.clickHamburgerBtn();
        myVoucherPage.clickMyVoucherBtn();
        myVoucherPage.verifyVoucher();
    }

}
