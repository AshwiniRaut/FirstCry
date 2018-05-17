package com.Test.FirstCry.Test.com.Test.FirstCry.Automation.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends BasicSetupClass {
	
	@Test
	public void login()
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div._pop_close")));
		driver.findElement(By.cssSelector("div._pop_close")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.poplogin_main")));
		driver.findElement(By.cssSelector("span.poplogin_main")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Email")));
		driver.findElement(By.name("Email")).sendKeys("rautashwini56@gmail.com");
		driver.findElement(By.id("txtLPass")).sendKeys("ashwini28");
		driver.findElement(By.id("btnlogon")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span#welcome.myacc_2")));
		String account=driver.findElement(By.cssSelector("span#welcome.myacc_2")).getText();
		Assert.assertEquals("My Account", account);
	}

}
