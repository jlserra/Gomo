package pageobjects;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;

public class ModemConfigurationPage extends BasePage{

    MobileDriver driver;

    public ModemConfigurationPage(MobileDriver driver) {
        this.driver = driver;
    }

    @Step("Step: Verify if Button Next is Enabled")
    public Boolean verifyUserAlreadyConnectedBtnEnabled() {
        log.info("Step: Verify I'm Already Connected Button is Enabled");
        return action.isEnabled("imAlreadyConnBtn");
    }

    @Step("Step: Verify choosing the fourth modem")
    public void verifyUserAlreadyConnected() throws Exception {
        verifyUserAlreadyConnectedBtnEnabled();
    }
}
