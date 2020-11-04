package com.nopcommerce.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Utilities {
private static Logger log=	Utilities.getLog(Utilities.class);
public static	Properties	prop;
	public static String filePropertie(String key) {
		
		try {
			prop = new Properties();
			FileInputStream fi= new FileInputStream("/Users/ibrahimmiah/eclipse-workspace/com.nopcommerce.demo/src/main/resources/NopCommmarce/config.properties");
			prop.load(fi);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	String value =	prop.getProperty(key);
		return value;
	}
	public static void verifyString(String expectedvalue, String actualvalue) {
		
		
		if(expectedvalue.equals(actualvalue)) {
			
			System.out.println("Test is passed");
		}else {
			log.info("Test is failed");
			log.info("Expected value is "+expectedvalue);
			log.info("Actual value is "+actualvalue);
			
			Assert.assertEquals(actualvalue, expectedvalue);
		}
	}
	public static Logger getLog(Class clazz) {
		Logger log=Logger.getLogger(clazz);
		PropertyConfigurator.configure("src/test/resources/log4j.properties");
		return log;
		}
	public static void takeScreenShot(WebDriver dr,String methodname) {
		try {
		TakesScreenshot screenshot = (TakesScreenshot)dr;
	File sourceFile =	screenshot.getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(sourceFile , new File("/Users/ibrahimmiah/eclipse-workspace/com.nopcommerce.demo/ScreenShot"+System.currentTimeMillis()+"+methodname.jpeg"));
	} catch (IOException e) {
		log.info(e.getMessage());
	}

	
		
	}
	
	
	
	
	

}
