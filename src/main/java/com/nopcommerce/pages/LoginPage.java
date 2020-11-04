package com.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver dr;
	
	public LoginPage(WebDriver dr) {
		
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath ="//input[@type='submit']") WebElement LogInBtn;
	
	public  Dashboard clickLogInButton() {
		
		LogInBtn.click();
		
	return	new Dashboard (dr);
		
	}
}
