package com.travelers.helpers;

import com.travelers.helpers.DriverFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;
import java.sql.Driver;

public class TestListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            System.out.println("Test Failure");
            com.travelers.pages.helpers.SeleniumHelper.takeScreenShot(DriverFactory.getDriver());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test Failed But Within Success Percentage");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test Failed With Timeout");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Start");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Finish");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Start");

    }
}
