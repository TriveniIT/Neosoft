package com.Automation.TestCase;

import org.testng.annotations.Test;
import com.Automation.PageObjects.LoginPage;

public class TC_LoginTest_0001 extends BaseClass{
	@Test (invocationCount =2)
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
	
}
