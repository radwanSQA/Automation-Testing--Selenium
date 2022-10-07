package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class AccordianAutomation extends BaseDriver{
	 public static String baseURL = "https://demoqa.com/accordian";
	 
	 @Test(priority = 0)
	 public void openUrl() throws InterruptedException {
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}
	 
	@Test(priority = 1) 
	public void accordianSelect() throws InterruptedException {
		
		WebElement section1Heading = driver.findElement(By.id("section1Heading"));
		section1Heading.click();
		Thread.sleep(3000);
		
	
	} 
	 
}
