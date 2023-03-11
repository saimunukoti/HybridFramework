package com.redbuspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchforIphone {

	WebDriver driver;
	
	public SearchforIphone(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	
	@FindBy(xpath = "//div[@class = '_37M3Pb']/div[2]")WebElement MobileIcon;
	
	public void Iphone() {
		MobileIcon.click();
	}
	
}
