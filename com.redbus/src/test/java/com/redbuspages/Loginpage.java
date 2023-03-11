package com.redbuspages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.redbusutilities.Helpers;

public class Loginpage {
	
 WebDriver driver;
 
public Loginpage(WebDriver ldriver)

	{
		this.driver = ldriver;
	}

@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']") WebElement mobilenumber;
@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']") WebElement RequestOTP;
@FindBy(xpath = "//div[@class='_1psGvi _3BvnxG']/div[1]/div")WebElement Profile;	

		
	
	public void logintoFlipkart(double Regmobilenumber,String profilename) {
	//	driver.switchTo().alert();
		
		String name = Profile.getText();
		System.out.println("Logged in as :"+name);
		System.out.println("Data from Excel :"+profilename);
		if(name.equalsIgnoreCase(profilename)) {
			System.out.println("Logged in as :"+name);
		}
		else {
		mobilenumber.sendKeys(String.valueOf(Regmobilenumber));
		RequestOTP.click();
	//	Helpers.Dropdown(driver, Profile, name);
		
		}
	}
	
}
