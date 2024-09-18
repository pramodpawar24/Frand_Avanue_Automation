package com.UtilityPackage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;*/
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends Baseclass implements ITestListener {
	
	//ExtentReports extent=ExtendReportGenrator.getReport();
	ExtentReports extent=ExtendReportGenrator.getReport();
	ThreadLocal<ExtentTest>extenttest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("inside onTestSuccess: ");
		extenttest.get().log(Status.PASS, "Test Case Pass");
		extenttest.get().addScreenCaptureFromBase64String(Screenshot());

	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "Test Case Fail");
		extenttest.get().addScreenCaptureFromBase64String(Screenshot());
	}

	
	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test Case Skip");
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	public static String Screenshot() {
		
	
		TakesScreenshot ts=(TakesScreenshot) driver;
		System.out.println("inside line 53");
		 return ts.getScreenshotAs(OutputType.BASE64);
		 
		
	}
	
		
}
	

	
	

