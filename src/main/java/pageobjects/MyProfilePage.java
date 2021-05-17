package pageobjects;

import io.appium.java_client.MobileDriver;

public class MyProfilePage extends BasePage{

    MobileDriver driver;

    public MyProfilePage(MobileDriver driver) {
        this.driver = driver;
    }
}
