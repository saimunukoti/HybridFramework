package com.redbusTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.redbuspages.Loginpage;
import com.redbusutilities.Base;
import com.redbusutilities.BrowserFactory;

public class Test1 extends Base{

	
	//comment for git push

@Test	
	public void logintoApp() {
		
	    logger = Report.createTest("logintoAPP");
		Loginpage loginpage = PageFactory.initElements(driver,Loginpage.class);
		logger.info("Application Started");
		loginpage.logintoFlipkart(Excel.getintData("logindetails", 0, 0),Excel.getstringData(0, 1, 0));
	    logger.pass("Login success");


            }
	
	
}
