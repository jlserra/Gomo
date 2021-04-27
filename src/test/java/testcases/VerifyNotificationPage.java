package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

@Listeners(testcases.ListenerTestcase.class)
public class VerifyNotificationPage extends BaseTestcase {

    @Test(testName = "VerifyNotificationPage", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will view the Notification Page")
    @Story("Story: Notification Page")
    public void verifyNotificationPage() throws Exception {

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

        //Homepage
        homePage.navigateToHomePage();
        homePage.verifyNotificationBell();

        //Notification Page
        notificationPage.verifyNotificationPage();
    }

    @Test(testName = "VerifyViewNotificationContent", priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will view a Notification Content from the Notification Page")
    @Story("Story: Notification Page")
    public void verifyViewNotificationContent() throws Exception {
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

        //Homepage
        homePage.navigateToHomePage();
        homePage.verifyNotificationBell();

        //Notification Page
        notificationPage.verifyNotificationPage();
        notificationPage.verifyViewNotifContentPage();
    }

    @Test(testName = "VerifyNotifSearchResults", priority = 3)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will search a text in the Notification Page")
    @Story("Story: Notification Page")
    public void verifyNotifSearchResults() throws Exception {
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

        //Homepage
        homePage.navigateToHomePage();
        homePage.verifyNotificationBell();

        //Notification Page
        notificationPage.verifyNotificationPage();

        //Notification Page - Search
        notificationPage.enterValueInSearchBox(excel.getTestdata("message"));
        notificationPage.clickKeyboardSearch();
        notificationPage.verifyNotifSearchResults();
    }

    @Test(testName = "VerifyNotifSearchEmptyResults", priority = 4)
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: User will search a text in the Notification Page - with empty results")
    @Story("Story: Notification Page")
    public void verifyNotifSearchEmptyResults() throws Exception {
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

        //Homepage
        homePage.navigateToHomePage();
        homePage.verifyNotificationBell();

        //Notification Page
        notificationPage.verifyNotificationPage();

        //Notification Page - Search (Empty Results)
        notificationPage.enterValueInSearchBox(excel.getTestdata("message"));
        notificationPage.clickKeyboardSearch();
        notificationPage.verifyNotifSearchEmptyResults();
    }

}
