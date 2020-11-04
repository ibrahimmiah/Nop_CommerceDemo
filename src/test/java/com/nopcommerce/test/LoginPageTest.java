package com.nopcommerce.test;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import com.nopcommerce.base.Browser;
import com.nopcommerce.pages.Dashboard;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.utility.Utilities;


public class LoginPageTest {
	private static Logger log=Utilities.getLog(LoginPageTest.class);
	public static WebDriver dr;
	
	@Test
	public static void loginTest() throws InterruptedException {
		
		
	dr=	Browser.openBrowser();
	log.info("Open Url");
	LoginPage lp = new LoginPage (dr);
	Thread.sleep(3000);
	 lp.clickLogInButton();
		
		Thread.sleep(3000);
		Utilities.verifyString("Dashboard / nopCommerce administration" ,dr.getTitle());
		
		dr.close();
	}
	

}
