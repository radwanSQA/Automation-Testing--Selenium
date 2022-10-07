package com.automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MenuAutomation extends BaseDriver{
	
	public static String baseURL= "https://demoqa.com/menu";
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void Menu() throws InterruptedException {
		
		Actions action =  new Actions(driver);
		
		WebElement mainMenuElement =  driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
		action.moveToElement(mainMenuElement).perform();
		Thread.sleep(2000);
		
		WebElement subMenuElement = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
		action.moveToElement(subMenuElement).perform();
		Thread.sleep(2000);
		
		WebElement subMenuItemElement = driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 1')]"));
		action.moveToElement(subMenuItemElement).perform();
		Thread.sleep(5000);
		
		
	}
	
}
