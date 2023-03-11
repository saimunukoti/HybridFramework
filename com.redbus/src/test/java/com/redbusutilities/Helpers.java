package com.redbusutilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Helpers {
	
	
	
	public static String getScreenshot(WebDriver driver) {
		String Screenshortpath = System.getProperty("user.dir")+"/ScrrenShorts/"+time()+".png";
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(Src, new File(Screenshortpath));
		} catch (Exception e) {
			System.out.println("Unable to take screenshot"+e.getMessage());
			
		}
		return Screenshortpath;
	}
	
	
	public static String time() {
		DateFormat customdateformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currendate = new Date();
		return customdateformat.format(currendate);
	}
	
	public static void selectDropdownByvisualText(WebDriver driver,WebElement Element,String VisualText) {
		Select select = new Select(Element);
		select.selectByVisibleText(VisualText);
	}

}
