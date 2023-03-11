package com.redbusutilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

WebDriver driver;


	public static  WebDriver setBrowser(WebDriver driver,String BrowserName,String appURL)
	
{
	if(BrowserName.equalsIgnoreCase("Chrome")) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(co);
	}
	
	else if(BrowserName.equalsIgnoreCase("IE")) {
		
	}
	
	else {
		System.out.println("Enter correct Browser Details");
	}
	
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(appURL);
    return driver; 
     
     }
	
	
	public static void quitBrowser(WebDriver driver) {
		
			driver.quit();
		
       }
	
}