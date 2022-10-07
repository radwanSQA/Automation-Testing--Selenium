package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Filter extends BaseDriver{
	
	public static String baseUrl  = "https://www.aarong.com/";
	
	@Test(priority =0)
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void Test() throws InterruptedException {
		WebElement taaga =  driver.findElement(By.xpath("//a[@href='https://www.aarong.com/brand/taaga-man']"));
		taaga.click(); 
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 2)
	public void FilterFabric() throws InterruptedException {
		WebElement checkCottonBtn  = driver.findElement(By.xpath("//body/div[5]/main[1]/div[5]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]"));
		checkCottonBtn.click();
	    Thread.sleep(2000);
	
	}
	
}
