package com.nopcommerce.utility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener{
	public  WebDriver dr=null;
	 public void onTestFailure(ITestResult result) {
		
	ITestContext context =	 result.getTestContext();
	dr= (WebDriver)context.getAttribute("WebDriver");
		 Utilities.takeScreenShot(dr, result.getName());	
	    }	
	
	

}
