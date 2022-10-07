package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ButtonAutomation extends BaseDriver{
     
	 public static String baseURL = "https://demoqa.com/buttons";
	 
	 @Test(priority = 0)
	 public void openUrl() throws InterruptedException {
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}
	 
	 
	@Test(priority = 1)
	public void differentButtonAutomation() throws InterruptedException {
		
		Actions actions =  new Actions(driver);
		WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(doubleClickBtn).perform();
		Thread.sleep(2000);
		
		WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(rightClickBtn).perform();
		Thread.sleep(2000);
		
		WebElement clickBtnn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]"));
		clickBtnn.click();
		
		Thread.sleep(5000);
		
	
		
	} 
	
	
	
}
