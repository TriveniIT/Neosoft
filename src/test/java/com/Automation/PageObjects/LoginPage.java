package com.Automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Declaration 
	
	@FindBy (name= "uid")
	WebElement txtUserName;
	
	@FindBy (name= "password")
	WebElement txtPassword;
	
	@FindBy (name= "btnLogin")
	WebElement btnLogin;
	
	WebDriver driver;
	
	// Initialization
	 
	public LoginPage(WebDriver driver ){
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	// Usage
	
	public void setUserName(String uName) {
		txtUserName.sendKeys(uName);
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit() {
		btnLogin.click();
	}
	
}
