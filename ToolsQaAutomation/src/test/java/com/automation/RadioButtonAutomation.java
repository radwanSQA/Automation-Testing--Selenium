package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonAutomation extends BaseDriver{
	public static String baseURL= "https://demoqa.com/radio-button";
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		

	}
	
	@Test(priority = 1)
	public void radioCheck() throws InterruptedException {
		
		WebElement yesRadio = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yesRadio.click();
		System.out.println(yesRadio.getText());
		Thread.sleep(1000);
		
		WebElement impressiveRadio = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		impressiveRadio.click();
		System.out.println(impressiveRadio.getText());
		Thread.sleep(1000);

		
		
		WebElement noRadio = driver.findElement(By.xpath("//label[@for='noRadio']"));
		noRadio.click();
		System.out.println(noRadio.getText());
		Thread.sleep(2000);

		
		
	}
}
