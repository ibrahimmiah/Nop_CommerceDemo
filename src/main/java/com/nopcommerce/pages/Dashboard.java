package com.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	public  WebDriver dr=null;
public 	Dashboard(WebDriver dr) {
	
	
	this.dr= dr;
	PageFactory.initElements(dr, this);
	
}
	@FindBy(xpath="//a[contains(text(),'Logout')]") WebElement LogoutBtn;

	
	public void clickLogOutBtn() {
		
		LogoutBtn.click();
		
	}
	
	
}
