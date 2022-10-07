package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectAutomation extends BaseDriver{
	public static String baseURL= "https://demoqa.com/select-menu";
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void selectMenu() throws InterruptedException {
		
		WebElement oldSelectMenu =  driver.findElement(By.id("oldSelectMenu"));
		
		Select colorSelect =  new Select(oldSelectMenu);
		//colorSelect.selectByValue("3");
		//colorSelect.selectByIndex(2);
		colorSelect.selectByVisibleText("Green");
		Thread.sleep(3000);
		
	}
	
	
	@Test(priority = 2)
	public void multiSelectMenu() throws InterruptedException {
		
		WebElement cars =  driver.findElement(By.id("cars"));
		
		Select carSelect =  new Select(cars);
		carSelect.selectByValue("volvo");
		carSelect.selectByValue("saab");
		
		Thread.sleep(3000);
		
	}
}
