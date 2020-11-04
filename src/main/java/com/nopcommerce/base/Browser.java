package com.nopcommerce.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {
	
	public  static WebDriver dr=null;
	public static String os= System.getProperty("os.name");
	
public static void getBrowserForMac(String br) {
	
	if(br.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/ibrahimmiah/Desktop/chromedriver");
		dr= new ChromeDriver();
	}else if(br.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/ibrahimmiah/Desktop/geckodriver");
		dr= new FirefoxDriver();
		
	}else if(br.equalsIgnoreCase("safari")){
		
		dr = new SafariDriver();
	}else {
		
		System.out.println("Please enter proper browser name "+br);
	}
	
	
}

public static void getBrowserForWindows(String br) {

if(br.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "/Users/ibrahimmiah/Desktop/chromedriver");
	dr= new ChromeDriver();
}else if(br.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", "/Users/ibrahimmiah/Desktop/geckodriver");
	
	dr= new FirefoxDriver();
	
}else if(br.equalsIgnoreCase("safari")){
	
	dr = new SafariDriver();
}else {
	
	System.out.println("Please enter proper browser name "+br);
}


}

public static WebDriver openBrowser() {
	String bro =Apps.BROWSERNAME;
	
	if(os.toLowerCase().contains("mac")) {
		
		getBrowserForMac(bro);
	}else if (os.toLowerCase().contains("windows")) {
		
		getBrowserForWindows(bro);
		
	}else {
		
		System.out.println("Opps cheak open browser");
	}
	dr.get(Apps.URL);

	return dr;
}


}
