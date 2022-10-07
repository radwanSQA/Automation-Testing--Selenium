package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert extends BaseDriver{
	
	public static String baseURL= "https://demoqa.com/alerts";
	
	@Test(priority = 0)
	public void alertAutomation() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement alertButton =  driver.findElement(By.id("alertButton"));
		alertButton.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		
		WebElement timerAlertButton =  driver.findElement(By.id("timerAlertButton"));
		timerAlertButton.click();
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		
		WebElement confirmButton =  driver.findElement(By.id("confirmButton"));
		confirmButton.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		WebElement promtButton =  driver.findElement(By.id("promtButton"));
		promtButton.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hello");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
	}

}
