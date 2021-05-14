package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.ActionUtilities;
import utilities.ConfigUtilities;

import javax.validation.constraints.AssertTrue;
import java.io.IOException;

public class GetMoreDataPage extends BasePage {

    MobileDriver driver;

    public GetMoreDataPage(MobileDriver driver) {
        this.driver = driver;
    }

    //Promos Tab
    @Step("Step: Verify if user is in Get More Data Page")
    public Boolean VerifyIfGetMoreDataPage() throws Exception {
        log.info("Step: Verify if user is in Get More Data Page");
        Assert.assertTrue(action.waitForElementToBeVisible("hdrGetMoreData", ConfigUtilities.Timers.normal));
        action.takeSnapShot("User is in Get More Data Page");
        return action.isDisplayed("hdrGetMoreData");

    }

    public void VerifyGetMoreDataSpiel() throws Exception {
        log.info("Step: Verify Get More Data Page Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("spielGetMoreData", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("spiel"), action.getText("spielGetMoreData"));
        action.takeSnapShot("Get More Data Page Spiel");
    }

    public Boolean VerifyIfSubscribeBtnIsEnabled() throws Exception {
        log.info("Step: Verify if Subscribe Button is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnSubscribe", ConfigUtilities.Timers.slow));
        action.takeSnapShot("Subscribe Button");
        return action.isEnabled("btnSubscribe");
    }

    public void clickSubscribeBtn() throws Exception {
        log.info("Step: Click Subscribe Button");
        Assert.assertTrue(VerifyIfSubscribeBtnIsEnabled());
        action.click("btnSubscribe");
        action.takeSnapShot("Click Subscribe Button");
    }

    public void VerifyDataPromo199() throws Exception {
        log.info("Step: Verify Prepaid Data Promo myBizSurf 199");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataDesc1", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc1"), action.getText("lblPromoDataDesc1"));
        action.takeSnapShot("Get More Data - Promo myBizSurf 199");
    }

    public void VerifyDataPromo599() throws Exception {
        log.info("Step: Verify Prepaid Data Promo myBizSurf 599");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataDesc2", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc2"), action.getText("lblPromoDataDesc2"));
        action.takeSnapShot("Get More Data - Promo myBizSurf 599");
    }

    public void VerifyDataPromo799() throws Exception {
        log.info("Step: Verify Prepaid Data Promo myBizSurf 799");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataDesc3", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc3"), action.getText("lblPromoDataDesc3"));
        action.takeSnapShot("Get More Data - Promo myBizSurf 799");
    }

    public void VerifyDataPromo999() throws Exception {
        log.info("Step: Verify Prepaid Data Promo myBizSurf 999");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataDesc4", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc4"), action.getText("lblPromoDataDesc4"));
        action.takeSnapShot("Get More Data - Promo myBizSurf 999");
    }

    public void VerifyDataPromo1499() throws Exception {
        log.info("Step: Verify Prepaid Data Promo myBizSurf 1499");
        Assert.assertTrue(action.waitForElementToBeVisible("lblPromoDataDesc5", ConfigUtilities.Timers.normal));
        Assert.assertEquals(excel.getTestdata("dataDesc5"), action.getText("lblPromoDataDesc5"));
        action.takeSnapShot("Get More Data - Promo myBizSurf 1499");
    }

    //Add Ons Tab
    public Boolean VerifyIfAddonsTabIsEnabled() throws Exception {
        log.info("Step: Verify if Add Ons tab is Enabled");
        Assert.assertTrue(action.waitForElementToBeVisible("btnAddOns", ConfigUtilities.Timers.slow));
        action.takeSnapShot("Add Ons tab");
        return action.isEnabled("btnAddOns");
    }

    public void clickAddOns() throws Exception {
        log.info("Step: Click Subscribe Button");
        Assert.assertTrue(VerifyIfAddonsTabIsEnabled());
        action.click("btnAddOns");
        action.takeSnapShot("Click Add Ons tab");
    }

    public void VerifyGetMoreDataAddOnsSpielNoSubscription() throws Exception {
        log.info("Step: Verify Get More Data Add Ons Page Spiel");
        Assert.assertTrue(action.waitForElementToBeVisible("spielGetMoreDataAddOns", ConfigUtilities.Timers.slow));
        Assert.assertEquals(excel.getTestdata("spielNoSubs"), action.getText("spielGetMoreDataAddOns"));
        action.takeSnapShot("Get More Data Add Ons Page Spiel - No Active Subscriptions");
    }




    public void VerifyGetMoreDataPromosPage() throws Exception {
        log.info("Step: Verify Get More Data - Promos Page");
        VerifyGetMoreDataSpiel();
        Assert.assertTrue(VerifyIfSubscribeBtnIsEnabled());
        VerifyDataPromo199();
        VerifyDataPromo599();
        VerifyDataPromo799();
        action.swipe(ActionUtilities.Direction.UP);
        VerifyDataPromo999();
        VerifyDataPromo1499();
    }

    public void VerifyGetMoreDataAddOnsPageNoSubscription() throws Exception {
        log.info("Step: Verify Get More Data - Add Ons Page");
        clickAddOns();
        VerifyGetMoreDataAddOnsSpielNoSubscription();
        Assert.assertFalse(VerifyIfSubscribeBtnIsEnabled());
        Thread.sleep(10000);
    }
}
