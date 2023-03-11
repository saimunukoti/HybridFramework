package com.redbusutilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Base {
	
	public WebDriver driver;
	public ExcelReader Excel;
	public configFileReader config;
	public Helpers helper;
	public ExtentReports Report;
	public ExtentTest logger;
	
	
	@BeforeSuite
	public void excelSetup() throws IOException
	{
		Excel = new ExcelReader();
		config = new configFileReader();
		helper = new Helpers();
		
		ExtentHtmlReporter Extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/FlipKart/"+Helpers.time()+"_flipkart.html"));
	    Report = new ExtentReports();
	    Report.attachReporter(Extent);
	
	
	}
	
	
	@BeforeClass	
    public void setup() {
	
	Reporter.log("Application Setting up",true);
	driver=BrowserFactory.setBrowser(driver, config.getCofigBrowser(), config.getCofigURL());
	Reporter.log("Application running",true);
          }
	@AfterMethod
	public void ScreenShort(ITestResult result) throws IOException {
		Reporter.log("Setting Reports",true);
		if(result.getStatus()==ITestResult.FAILURE) {
			
			logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(Helpers.getScreenshot(driver)).build());
		}
		
		else if (result.getStatus()==ITestResult.SUCCESS){
			logger.pass("Test Passed",MediaEntityBuilder.createScreenCaptureFromPath(Helpers.getScreenshot(driver)).build());
		}
		Report.flush();
		Reporter.log("Reports >> generated",true);
	}
	
	
}
