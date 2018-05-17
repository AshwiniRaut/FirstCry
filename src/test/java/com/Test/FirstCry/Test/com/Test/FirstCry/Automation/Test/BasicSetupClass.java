package com.Test.FirstCry.Test.com.Test.FirstCry.Automation.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BasicSetupClass {
	WebDriver driver=SingletonClass.getSingletonInstance();
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	
	@BeforeSuite
	public void launchDriver()
	{
		driver.get("http://www.firstcry.com");
		driver.manage().window().maximize();
	}
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}

}
