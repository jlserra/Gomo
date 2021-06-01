package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyMyVoucherPage extends BaseTestcase{

    @Test(testName = "VerifyMyVoucherPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will be redirected to My Voucher Page")
    @Story("Story: My Voucher Page")
    public void navigateToMyVoucherPage() throws Exception {

        //Get Started
        assertTrue(getStartedPage.verifyIfGetStartedPage());
        getStartedPage.clickBtnGetStarted();

        //Welcome Page
        assertTrue(welcomePage.verifyIfLoginPage());
        welcomePage.enterPrepaidNumber(excel.getTestdata("mobileNumber"));
        assertTrue(welcomePage.verifyIfBtnNextIsEnabled());
        welcomePage.clickBtnNext();

        //Secure Page
        assertTrue(secureAppPage.verifyIfSecurePage());
        secureAppPage.enterPin(excel.getTestdata("pin"));
        secureAppPage.clickBtnNext();
        assertTrue(secureAppPage.verifyIfSecurePageConfirmation());
        secureAppPage.enterPin(excel.getTestdata("pin"));
        secureAppPage.clickBtnNext();

        //Customer Profile
        assertTrue(customerProfilePage.verifyIfCustomerProfilePage());
        customerProfilePage.enterNickname(excel.getTestdata("nickname"));
        assertTrue(customerProfilePage.verifyIfBtnNextIsEnabled());
        customerProfilePage.clickBtnNext();

        //Choose Modem
        chooseModemPage.verifyChooseModemFour();
        modemConfigPage.verifyUserAlreadyConnected();

        //Home Page
        homePage.clickBtnProceed();
        homePage.clickHamburgerBtn();

        //Click My Voucher link
        myVoucherPage.clickMyVoucherBtn();
        //My Voucher Page
        myVoucherPage.verifyIfMyVoucherPage();

    }

    @Test(testName = "VerifyMyVoucherPage", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check the Voucher")
    @Story("Story: My Voucher Page")
    public void verifyMyVoucher() throws Exception{
        navigateToMyVoucherPage();
        myVoucherPage.verifyVoucher();
    }

}
