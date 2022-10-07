package com.automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class LinksAutomation extends BaseDriver{

	 public static String baseURL = "https://demoqa.com/links";
	 
	 @Test(priority = 0)
	 public void openUrl() throws InterruptedException {
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}
	 
	 
	@Test(priority = 1) 
	public void allLinksTest() throws InterruptedException {
		
		WebElement createdLink = driver.findElement(By.xpath("//a[@id='created']"));
		createdLink.click();
		Thread.sleep(3000);
	
		WebElement simpleLink =  driver.findElement(By.id("simpleLink"));
		Thread.sleep(3000);
		simpleLink.click();
		Thread.sleep(3000);
		driver.switchTo().window(windowHandling().get(1));
		Thread.sleep(3000);
		
		
		
	} 
	
	
	public List<String> windowHandling(){
		 Set<String> windowHandles = driver.getWindowHandles();
		 ArrayList<String> windowHandleList = new ArrayList<String>(windowHandles);
		 
		 @SuppressWarnings("unused")
		 int size = windowHandleList.size();
		 return windowHandleList;
		 
	}
	
	
	
	
}
