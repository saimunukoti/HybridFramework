package com.redbusTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.redbuspages.Loginpage;
import com.redbuspages.SearchforIphone;
import com.redbusutilities.Base;

public class Test2 extends Base {

	@Test
	public void mobiles() throws InterruptedException
	{
		Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);
		loginpage.logintoFlipkart(Excel.getintData("logindetails", 0, 0),Excel.getstringData(0, 1, 0));
		Thread.sleep(5000);
		SearchforIphone searchforiphone = PageFactory.initElements(driver, SearchforIphone.class);
		searchforiphone.Iphone();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
