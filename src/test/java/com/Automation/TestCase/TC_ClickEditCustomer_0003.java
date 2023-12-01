package com.Automation.TestCase;

import org.testng.annotations.Test;
import com.Automation.PageObjects.EditCustomerClick;
import com.Automation.PageObjects.LoginPage;

public class TC_ClickEditCustomer_0003 extends BaseClass{

    @Test 
	public void clickEditCustomerLink() throws InterruptedException {
		driver.get(baseURL);
		
LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(userName);
		Thread.sleep(3000);
		lp.setPassword(password);
		Thread.sleep(3000);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		EditCustomerClick ECC = new EditCustomerClick(driver);
		ECC.editCustomerClk();
	}

}
