package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Menu extends BaseDriver{
	
	public static String baseUrl = "https://www.aarong.com/"; 
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void Test() throws InterruptedException {
		WebElement taaga =  driver.findElement(By.xpath("//a[@href='https://www.aarong.com/brand/taaga']"));
		taaga.click(); 
		Thread.sleep(5000);
	}
	
    //Left Side Menu Click	
	@Test (priority = 2)
	public void LeftMenu() {
		List<WebElement> elementList = driver.findElements(By.cssSelector(".nav_left li a"));
		int numberOfMenuElements =  elementList.size();
		for(int i =0; i < numberOfMenuElements;i++) {
			System.out.print("Left Menu Name "+numberOfMenuElements);
			elementList = driver.findElements(By.cssSelector(".nav_left li a"));
	        elementList.get(i).click();
		}
	}

}
