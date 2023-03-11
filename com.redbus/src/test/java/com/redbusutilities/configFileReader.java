package com.redbusutilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class configFileReader {

	
	Properties pro;
	
	
	public configFileReader() {
		
		
		try {
			File src = new File("./Configfiles/config.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println("unable to read Config File:"+e.getMessage());
		}
		
		
		
	}
	
	
	public String getCofigBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getCofigURL()
	{
		return pro.getProperty("URL");
	}
}
