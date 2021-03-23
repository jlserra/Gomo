package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyChooseModem extends BaseTestcase {

    @Test(testName = "VerifyChooseModem1", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will check for the first modem")
    @Story("Story: Choose modem ")
    public void verifyChooseModemOne() throws Exception {
        chooseModemPage.verifyChooseModemOne();
    }

//    @Test(testName = "VerifyChooseModem1", priority = 2)
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Test Description: User will check for the first modem")
//    @Story("Story: Choose modem 1")
//    public void verifyChooseModemOne() throws Exception {
//
//        assertTrue(getStartedPage.verifyIfGetStartedPage());
//        getStartedPage.clickBtnGetStarted();
//        welcomePage.enterPrepaidNumber("09271080510");
//        welcomePage.clickBtnNext();
//
//        assertTrue(secureAppPage.verifyIfSecurePage());
//        secureAppPage.enterPin("1111");
//        secureAppPage.verifyIfBtnNextIsEnabled();
//        secureAppPage.clickBtnNext();
//
//        assertTrue(secureAppPage.verifyIfSecurePageConfirmation());
//        secureAppPage.enterPin("1111");
//        secureAppPage.verifyIfBtnNextIsEnabled();
//        secureAppPage.clickBtnNext();
//
//        customerProfilePage.enterNickname("Abe");
//        assertTrue(customerProfilePage.verifyIfBtnNextIsEnabled());
//        customerProfilePage.clickBtnNext();
//
//        chooseModemPage.clickCheckBox();
//        chooseModemPage.clickLetsGoBtn();
//
//        chooseModemPage.clickSkipBtn();
//        chooseModemPage.clickCloseModalBtn();
//        chooseModemPage.clickModemOneBtn();
//
//    }
//
//    @Test(testName = "VerifyChooseModem2", priority = 2)
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Test Description: User will check for the second modem")
//    @Story("Story: Choose modem 2")
//    public void verifyChooseModemTwo() throws Exception {
//
//        assertTrue(getStartedPage.verifyIfGetStartedPage());
//        getStartedPage.clickBtnGetStarted();
//        welcomePage.enterPrepaidNumber("09271080510");
//        welcomePage.clickBtnNext();
//
//        assertTrue(secureAppPage.verifyIfSecurePage());
//        secureAppPage.enterPin("1111");
//        secureAppPage.verifyIfBtnNextIsEnabled();
//        secureAppPage.clickBtnNext();
//
//        assertTrue(secureAppPage.verifyIfSecurePageConfirmation());
//        secureAppPage.enterPin("1111");
//        secureAppPage.verifyIfBtnNextIsEnabled();
//        secureAppPage.clickBtnNext();
//
//        customerProfilePage.enterNickname("Abe");
//        assertTrue(customerProfilePage.verifyIfBtnNextIsEnabled());
//        customerProfilePage.clickBtnNext();
//
//        chooseModemPage.clickCheckBox();
//        chooseModemPage.clickLetsGoBtn();
//
//        chooseModemPage.clickSkipBtn();
//        chooseModemPage.clickCloseModalBtn();
//        chooseModemPage.clickModemTwoBtn();
//
//    }
//
//    @Test(testName = "VerifyChooseModem3", priority = 2)
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Test Description: User will check for the third modem")
//    @Story("Story: Choose modem 3")
//    public void verifyChooseModemThree() throws Exception {
//
//        assertTrue(getStartedPage.verifyIfGetStartedPage());
//        getStartedPage.clickBtnGetStarted();
//        welcomePage.enterPrepaidNumber("09271080510");
//        welcomePage.clickBtnNext();
//
//        assertTrue(secureAppPage.verifyIfSecurePage());
//        secureAppPage.enterPin("1111");
//        secureAppPage.verifyIfBtnNextIsEnabled();
//        secureAppPage.clickBtnNext();
//
//        assertTrue(secureAppPage.verifyIfSecurePageConfirmation());
//        secureAppPage.enterPin("1111");
//        secureAppPage.verifyIfBtnNextIsEnabled();
//        secureAppPage.clickBtnNext();
//
//        customerProfilePage.enterNickname("Abe");
//        assertTrue(customerProfilePage.verifyIfBtnNextIsEnabled());
//        customerProfilePage.clickBtnNext();
//
//        chooseModemPage.clickCheckBox();
//        chooseModemPage.clickLetsGoBtn();
//
//        chooseModemPage.clickSkipBtn();
//        chooseModemPage.clickCloseModalBtn();
//        chooseModemPage.clickModemThreeBtn();
//
//    }
//
//    @Test(testName = "VerifyChooseModem4", priority = 2)
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Test Description: User will check for the fourth modem")
//    @Story("Story: Choose modem 4")
//    public void verifyChooseModemFour() throws Exception {
//
//        assertTrue(getStartedPage.verifyIfGetStartedPage());
//        getStartedPage.clickBtnGetStarted();
//        welcomePage.enterPrepaidNumber("09271080510");
//        welcomePage.clickBtnNext();
//
//        assertTrue(secureAppPage.verifyIfSecurePage());
//        secureAppPage.enterPin("1111");
//        secureAppPage.verifyIfBtnNextIsEnabled();
//        secureAppPage.clickBtnNext();
//
//        assertTrue(secureAppPage.verifyIfSecurePageConfirmation());
//        secureAppPage.enterPin("1111");
//        secureAppPage.verifyIfBtnNextIsEnabled();
//        secureAppPage.clickBtnNext();
//
//        customerProfilePage.enterNickname("Abe");
//        assertTrue(customerProfilePage.verifyIfBtnNextIsEnabled());
//        customerProfilePage.clickBtnNext();
//
//        chooseModemPage.clickCheckBox();
//        chooseModemPage.clickLetsGoBtn();
//
//        chooseModemPage.clickSkipBtn();
//        chooseModemPage.clickCloseModalBtn();
//        chooseModemPage.clickModemFourBtn();
//
//    }

}
