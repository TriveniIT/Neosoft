package com.Automation.TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {
	public String baseURL= "https://www.demo.guru99.com/v4/index.php";
	public String userName= "mngr539217";
	public String password= "EsAdupu";
	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","G:\\Learning\\Java Automation\\Drivers\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","G:\\Learning\\Java Automation\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe"); 
		//driver = new FirefoxDriver();
		
		logger = Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("Log4j.properties");
		

		// --System.getProperty(\"user.dir\") + \"//Drivers//geckodriver.exe
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
