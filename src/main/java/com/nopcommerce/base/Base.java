package com.nopcommerce.base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	public static WebDriver dr;
	@BeforeClass
	public void settingBrowser(	ITestContext context) {
		
	dr=	Browser.openBrowser();
	context.setAttribute("WebDriver", dr);
	}

	
	@AfterClass
	public void clossingBrowser() {
		
		dr.close();
		
		
	}
}
