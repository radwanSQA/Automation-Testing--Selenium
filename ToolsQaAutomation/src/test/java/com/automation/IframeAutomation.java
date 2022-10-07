package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeAutomation extends BaseDriver{
	public static String baseURL= "https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void iframeMethod() throws InterruptedException {
		driver.switchTo().frame("packageListFrame");
		WebElement getPackageListFrame = driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]"));
		Thread.sleep(1000);
		getPackageListFrame.click();
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("packageFrame");
		WebElement getPackageFrame = driver.findElement(By.xpath("//span[contains(text(),'Alert')]"));
		Thread.sleep(1000);
		getPackageFrame.click();
		Thread.sleep(5000);
		
		
        driver.switchTo().parentFrame();
		
		driver.switchTo().frame("classFrame");
		WebElement classFrame = driver.findElement(By.xpath("//body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		Thread.sleep(1000);
		classFrame.click();
		Thread.sleep(5000);
	}
	
  
}
