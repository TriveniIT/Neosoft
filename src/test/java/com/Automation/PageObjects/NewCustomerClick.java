package com.Automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerClick {

	@FindBy (xpath= "//a[text()= 'New Customer']")
	private WebElement newCustomer;
	
	WebDriver driver;
	
	public NewCustomerClick (WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickNewCustomer () {
		newCustomer.click();
	}
	
}
