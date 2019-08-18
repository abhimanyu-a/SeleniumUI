package com.Selenium.Utilities;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Selenium.BaseTest;
import com.Selenium.DriverTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestListener extends DriverTest implements ITestListener {
	ExtentReports reports = new ExtentReports(System.getProperty("user.dir") + "\\Reports\\"
			+ new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date()) + "_reports.html", false);
	ExtentTest extentTest;
	ScreenshotUtility shUtility = new ScreenshotUtility();

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		String parameters ="";
		for(Object obj :result.getParameters())
		{
			parameters = obj.toString() + "," + parameters;
		}
		extentTest.log(LogStatus.INFO, "Test Parameters: " + parameters + " has failed");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub.
		extentTest.log(LogStatus.PASS, "Test " + result.getName().toString() + " has passed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		try {
			Object obj = result.getInstance();
			WebDriver driver = ((BaseTest) obj).getDriver();
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(ScreenshotUtility.CaptureScreenshot((driver)))+" STACK TRACE--> "+result.getThrowable());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			extentTest.log(LogStatus.FAIL, "Test " + result.getName().toString() + " has failed");
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		extentTest = reports.startTest("Test " + context.getName().toString() + " has started");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		reports.endTest(extentTest);
		reports.flush();
	}

}
