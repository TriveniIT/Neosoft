package com.Automation.TestCase;

import org.testng.annotations.Test;

import com.Automation.PageObjects.EditCustomerClick;
import com.Automation.PageObjects.LoginPage;
import com.Automation.PageObjects.NewCustomerClick;

public class SmokeTestingSuit extends BaseClass{
		@Test (priority=001)
		public void loginTest() throws Exception {
			driver.get(baseURL);
			LoginPage lp = new LoginPage(driver);
			
			lp.setUserName(userName);
			Thread.sleep(3000);
			lp.setPassword(password);
			Thread.sleep(3000);
			lp.clickSubmit();
			Thread.sleep(3000);
		}
		@Test (priority=002)
		public void clickNewCustomerLink() throws InterruptedException {
			NewCustomerClick cl = new NewCustomerClick(driver);
			 cl.clickNewCustomer();
			 Thread.sleep(3000);
		}
		
		@Test (priority=003)
		public void clickEditCustomerLink() throws InterruptedException {
		EditCustomerClick ECC = new EditCustomerClick(driver);
		ECC.editCustomerClk();
		Thread.sleep(3000);
		
	}

}
