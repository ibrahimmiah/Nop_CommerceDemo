package com.nopcommerce.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.nopcommerce.base.Base;
import com.nopcommerce.base.Browser;
import com.nopcommerce.pages.Dashboard;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.utility.Utilities;
@Listeners(com.nopcommerce.utility.MyTestListener.class)
public class DashBordPageTest extends Base{
	
	private static Logger log=Utilities.getLog(DashBordPageTest.class);
	
	public static WebDriver dr;
	@Test
	public void logOut() throws InterruptedException {
	//dr=	Browser.openBrowser();
	
	Thread.sleep(300);
		LoginPage lp = new LoginPage (dr);
		 lp.clickLogInButton();
		
	Thread.sleep(3000);
	Dashboard db = new Dashboard(dr);

	db.clickLogOutBtn();
	
	log.info("Click on logout button");
	Thread.sleep(3000);
	Utilities.verifyString("Your store. Login" ,dr.getTitle());
	
	//dr.close();
	}
	

}
