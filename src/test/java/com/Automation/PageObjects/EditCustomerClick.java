package com.Automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerClick {

	// Declaration 
	@FindBy (xpath = "//a[text()='Edit Customer']")
	private WebElement ClickEditCustomer;
	WebDriver driver;
	
	// Initialization
	
	public EditCustomerClick (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	// Action Methods
	public void editCustomerClk() {
		ClickEditCustomer.click();
	}
	
	
	
	
}
