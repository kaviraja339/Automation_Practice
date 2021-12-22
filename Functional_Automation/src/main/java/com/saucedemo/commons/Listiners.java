package com.saucedemo.commons;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.saucedemo.pages.TestPageHandler;

public class Listiners extends TestPageHandler implements ITestListener{

	public void onTestStart(ITestResult result) {
		logger = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "Test Case: "+result.getMethod().getMethodName()+ " is passed successfully");
	}

	public void onTestFailure(ITestResult result) {
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		extent = ExtentReportSetup.setupExtentReport();
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
