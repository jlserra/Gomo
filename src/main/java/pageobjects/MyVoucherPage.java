package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ConfigUtilities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MyVoucherPage extends BasePage{

    MobileDriver driver;

    public MyVoucherPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Click My Voucher Button")
    public void clickMyVoucherBtn () throws Exception {
        log.info("Step: Click My Voucher Button");
        action.takeSnapShot("User clicked the My Voucher Link");
        action.waitForElementToBeClickable("lnkMyVouchers",ConfigUtilities.Timers.slow);
        action.click("lnkMyVouchers");
    }

    @Step("Step: Verify if user is in My Voucher Page")
    public void verifyIfMyVoucherPage() throws Exception {

        log.info("Step: Verify My Voucher Page");
        assertEquals(excel.getTestdata("text1"), action.getText("txtMyVouchersTitle"));
        action.takeSnapShot("User is in My Voucher Page");
    }

    @Step("Step: Verify Voucher")
    public void verifyVoucher() throws Exception {

        log.info("Step: Verify Voucher");
        assertTrue(action.waitForElementToBeVisible("txtNoVoucher", ConfigUtilities.Timers.slow));
        assertEquals(excel.getTestdata("text2"), action.getText("txtNoVoucher"));
        action.takeSnapShot("User has no Voucher");
    }


}
