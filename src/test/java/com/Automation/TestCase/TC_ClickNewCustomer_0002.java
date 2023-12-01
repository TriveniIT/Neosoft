package com.Automation.TestCase;

import org.testng.annotations.Test;
import com.Automation.PageObjects.LoginPage;
import com.Automation.PageObjects.NewCustomerClick;

public class TC_ClickNewCustomer_0002 extends BaseClass {
	
	@Test 
	public void clickNewCustomerLink() throws InterruptedException {
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		NewCustomerClick cl = new NewCustomerClick(driver);
		cl.clickNewCustomer();
		
		Thread.sleep(3000);
	}
	

}
