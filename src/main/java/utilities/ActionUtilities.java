package utilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ActionUtilities {

    static final int explicitWaitDefault = 10;
    MobileDriver driver;
    ConfigUtilities config;
    ExcelUtilities excel;
    LoggerUtilities log;

    public ActionUtilities(MobileDriver driver, LoggerUtilities log, ConfigUtilities config, ExcelUtilities excel ) {
        this.driver = driver;
        this.config = config;
        this.excel = excel;
        this.log = log;
    }


    public By getLocator(String key) throws Exception {
        By element = null;
        String[] locator = excel.getLocator(key);
        String locatorType = locator[0];
        String locatorValue = locator[1];

        log.info("Finding element by " + locatorType + " : " + locatorValue);

        try {
            switch (locatorType) {
                case "id":
                    element = MobileBy.id(locatorValue);
                    break;
                case "xpath":
                    element = MobileBy.xpath(locatorValue);
                    break;
                case "classname":
                    element = MobileBy.className(locatorValue);
                    break;
                case "cssselector":
                    element = MobileBy.cssSelector(locatorValue);
                    break;
                case "name":
                    element = MobileBy.name(locatorValue);
                    break;
                case "linktext":
                    element = MobileBy.linkText(locatorValue);
                    break;
                case "partiallinktext":
                    element = MobileBy.partialLinkText(locatorValue);
                    break;
                default:
                    log.error("Invalid locator type: " + locatorType);
                    throw new Exception("Invalid locator type: " + locatorType);
            }
        } catch (Exception e) {
            log.error(e, "Unable to find element " + locatorValue);
        }
        return element;
    }


    public MobileElement getElements(String key) throws Exception {
        MobileElement element = null;
        String[] locator = excel.getLocator(key);
        String locatorType = locator[0];
        String locatorValue = locator[1];

        log.info("Finding element by " + locatorType + " : " + locatorValue);

        try {
            switch (locatorType) {
                case "id":
                    element = (MobileElement) driver.findElementById(locatorValue);
                    break;
                case "xpath":
                    element = (MobileElement) driver.findElementByXPath(locatorValue);
                    break;
                case "classname":
                    element = (MobileElement) driver.findElementByClassName(locatorValue);
                    break;
                case "cssselector":
                    element = (MobileElement) driver.findElementByCssSelector(locatorValue);
                    break;
                case "name":
                    element = (MobileElement) driver.findElementByName(locatorValue);
                    break;
                case "linktext":
                    element = (MobileElement) driver.findElementByLinkText(locatorValue);
                    break;
                case "partiallinktext":
                    element = (MobileElement) driver.findElementByPartialLinkText(locatorValue);
                    break;
                default:
                    log.error("Invalid locator type: " + locatorType);
                    throw new Exception("Invalid locator type: " + locatorType);
            }
        } catch (Exception e) {
            log.error(e, "Unable to find element " + locatorValue);
        }
        return element;
    }

    public void click(MobileElement element) {
        try {
            element.click();
            log.info("Element clicked");
        } catch (Exception e) {
            log.error(e, "Unable to click element");
        }
    }

    public void click(String locator) throws Exception {
        try {
            new WebDriverWait(driver, ConfigUtilities.Timers.appStandard.getValue())
                    .until(ExpectedConditions.elementToBeClickable(getLocator(locator)))
                    .click();
            log.info("Successfully clicked element : " + locator);
        } catch (Exception e) {
            log.error(e, "Unable to click element " + locator);
            throw new Exception("Unable to click element " + locator);
        }
    }

    public void sendKeys(String locator, String text) throws Exception {
        try {
            new WebDriverWait(driver, ConfigUtilities.Timers.appStandard.getValue())
                    .until(ExpectedConditions.visibilityOfElementLocated(getLocator(locator)))
                    .sendKeys(text);
            log.info("Able to enter text successfully " + text);
        } catch (Exception e) {
            log.error(e, "Unable to enter text successfully " + text);
            throw new Exception("Unable to enter text successfully " + text);
        }
    }

    public String getText(MobileElement element) {
        String text = "";
        try {
            text = element.getText().replaceAll("[\n\r]", "");
            log.info("Text fetched successfully");
        } catch (Exception e) {
            log.error(e, "Unable to get element text");
        }
        return text;
    }

    public String getText(String locator) throws Exception {
        String text = "";
        try {
            text = new WebDriverWait(driver, ConfigUtilities.Timers.appStandard.getValue())
                    .until(ExpectedConditions.visibilityOfElementLocated(getLocator(locator)))
                    .getText().replaceAll("[\n\r]", "");
            log.info("Able to get text successfully " + text);
        } catch (Exception e) {
            log.error(e, "Unable to get text from locator " + locator);
            throw new Exception("Unable to get text from locator " + locator);
        }
        return text;
    }

    public Boolean isDisplayed(MobileElement element) {
        boolean isDisplayed = false;
        try {
            isDisplayed = element.isDisplayed();
            log.info("Element displayed");
        } catch (Exception e) {
            log.error(e, "Element not displayed");
        }
        return isDisplayed;
    }

    public Boolean isDisplayed(String locator) throws Exception {
        boolean isDisplayed = false;
        try {
            isDisplayed = new WebDriverWait(driver, ConfigUtilities.Timers.slow.getValue())
                    .until(ExpectedConditions.visibilityOfElementLocated(getLocator(locator))).isDisplayed();
            log.info("Element displayed with locator " + locator);
        } catch (Exception e) {
            log.error(e, "Element not displayed with locator " + locator);
            throw new Exception("Element not displayed with locator " + locator);
        }
        return isDisplayed;
    }

    public Boolean isEnabled(MobileElement element) {
        boolean isEnabled = false;
        try {
            isEnabled = element.isEnabled();
            log.info("Element enabled");
        } catch (Exception e) {
            log.error(e, "Element not enabled");
        }
        return isEnabled;
    }

    public Boolean isEnabled(String locator) throws Exception {
        boolean isEnabled = false;
        try {
            isEnabled = new WebDriverWait(driver, ConfigUtilities.Timers.appStandard.getValue())
                    .until(ExpectedConditions.visibilityOfElementLocated(getLocator(locator))).isEnabled();
            log.info("Element is enabled with locator " + locator);
        } catch (Exception e) {
            log.error(e, "Element is not enabled with locator " + locator);
            throw new Exception("Element is not enabled with locator " + locator);
        }
        return isEnabled;
    }

    public void waitForElementToBeVisible(MobileElement element) {
        try {
            new WebDriverWait(driver, explicitWaitDefault)
                    .until(ExpectedConditions.visibilityOf(element));
            log.info("Element now visible");
        } catch (Exception e) {
            log.error(e, "Element not visible");
        }
    }

    public Boolean waitForElementToBeVisible(String locator, ConfigUtilities.Timers timers) throws Exception {
        boolean visible = false;
        try {
            log.info("Waiting for element to be now visible");
            visible = new WebDriverWait(driver, timers.getValue())
                    .until(ExpectedConditions.visibilityOfElementLocated(getLocator(locator)))
                    .isDisplayed();
            log.info("Element now visible with " + locator);
        } catch (Exception e) {
            log.error(e, "Element not visible with " + locator);
            throw new Exception("Element not visible with " + locator);
        }
        return visible;
    }

    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(ConfigUtilities.Timers.appStandard.getValue(), TimeUnit.MILLISECONDS);
    }

    public void implicitlyWait(ConfigUtilities.Timers timer) {
        driver.manage().timeouts().implicitlyWait(timer.getValue(), TimeUnit.MILLISECONDS);
    }

    public void waitForElementToBeClickable(MobileElement element) {
        try {
            new WebDriverWait(driver, explicitWaitDefault)
                    .until(ExpectedConditions.elementToBeClickable(element));
            log.info("Element now clickable");
        } catch (Exception e) {
            log.error(e, "Element not clickable");
        }
    }

    public Boolean waitForElementToBeClickable(String locator, ConfigUtilities.Timers timer) throws Exception {
        boolean clickable = false;
        try {
            log.info("Waiting for element to be clickable " + locator);
            clickable = new WebDriverWait(driver, timer.getValue())
                    .until(ExpectedConditions.elementToBeClickable(getLocator(locator)))
                    .isEnabled();
            log.info("Element now clickable");
        } catch (Exception e) {
            log.error(e, "Element not clickable");
            throw new Exception("Element not clickable " + locator);
        }
        return clickable;
    }

    public Boolean waitForElementToBeSelected(String locator, ConfigUtilities.Timers timer) throws Exception {
        boolean selected = false;
        try {
            log.info("Waiting for element to be clickable " + locator);
            selected = new WebDriverWait(driver, timer.getValue())
                    .until(ExpectedConditions.elementToBeClickable(getLocator(locator)))
                    .isEnabled();
            log.info("Element now clickable");
        } catch (Exception e) {
            log.error(e, "Element not clickable");
            throw new Exception("Element not clickable " + locator);
        }
        return selected;
    }

    public void takeSnapShot(String description) throws IOException {

        String testname = config.getTestcase();
        String suitename = config.getSuitename();

        // Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        // Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        // Move image file to new destination
        File DestFile = new File("./screenshots/" + suitename + "/" + testname + "/" + testname + " - " + description + ".png");
        // Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);

        saveScreenshotPNG();
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshotPNG() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "Logs", type = "text/plain")
    public String saveTextLog(String message) {
        return message;
    }

    public void swipe(Direction dir) {

        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int startx = 0, starty = 0, endx = 0, endy = 0;

        switch (dir) {
            case UP:
                startx = (int) (width * .50);
                starty = (int) (height * .95);
                endx = (int) (width * .50);
                endy = (int) (height * .05);
                break;
            case DOWN:
                startx = (int) (width * .50);
                starty = (int) (height * .05);
                endx = (int) (width * .50);
                endy = (int) (height * .95);
                break;
            case LEFT:
                startx = (int) (width * .95);
                starty = (int) (height * .50);
                endx = (int) (width * .05);
                endy = (int) (height * .50);
                break;
            case RIGHT:
                startx = (int) (width * .05);
                starty = (int) (height * .50);
                endx = (int) (width * .95);
                endy = (int) (height * .50);
                break;
            default:
                break;
        }

        TouchAction action = new TouchAction(driver);
        action.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy)).release().perform();
        log.info("Swiping " + dir);

    }

    public void swipe(String locator1, String locator2) throws Exception {

        MobileElement element1 = (MobileElement) driver.findElement(getLocator(locator1));
        Point location1 = element1.getLocation();

        MobileElement element2 = (MobileElement) driver.findElement(getLocator(locator2));
        Point location2 = element2.getLocation();

        TouchAction action = new TouchAction(driver);

        action.press(PointOption.point(location1)).moveTo(PointOption.point(location2)).release().perform();
        log.info("Swiping");
    }

    public MobileElement findElementBy(String loc) {
        return (MobileElement) driver.findElementByXPath(loc);
    }

    public void clearTextField(MobileElement textfield) {
        textfield.clear();
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public void switchContextToWebView() {
        Boolean isWebView = false;

        do {
            Set<String> contexts = driver.getContextHandles();
            for (String contextNames : contexts) {
                if (contextNames.equals("WEBVIEW_chrome")) {
                    isWebView = true;
                }
            }
        } while (!isWebView);

        driver.context("WEBVIEW_chrome");
    }


}
