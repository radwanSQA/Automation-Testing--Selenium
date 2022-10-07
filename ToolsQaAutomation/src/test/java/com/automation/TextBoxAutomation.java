package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TextBoxAutomation extends BaseDriver{
	
	public static String baseURL = "https://demoqa.com/text-box";
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(300);
		
	}
	
	
	@Test(priority = 1)
	public void userForm() throws InterruptedException {
		WebElement userName = driver.findElement(By.id("userName"));
		userName.sendKeys("Radwan Ahmed");
		
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		userEmail.sendKeys("radwan@gmail.com");
		
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("dhaka");
		
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		permanentAddress.sendKeys("Dhaka");
		
		
		Thread.sleep(2000);
		
		WebElement submitBtn =  driver.findElement(By.id("submit"));
		Thread.sleep(5000);
		submitBtn.click();
		
		Thread.sleep(10000);
		
		
		
		
	}
	

}
