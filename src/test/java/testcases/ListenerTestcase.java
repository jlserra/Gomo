package testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import pageobjects.BasePage;

public class ListenerTestcase extends BaseTestcase implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        BasePage.setTestName(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
