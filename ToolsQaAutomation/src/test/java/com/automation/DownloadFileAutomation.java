package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DownloadFileAutomation extends BaseDriver{

	 public static String baseURL = "https://demoqa.com/upload-download";
	 
	 @Test(priority = 0)
	 public void openUrl() throws InterruptedException {
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}
	
	@Test(priority = 1) 
	public void downloadFile() throws InterruptedException {
		WebElement downloadButton =  driver.findElement(By.id("downloadButton"));
		downloadButton.click();
		Thread.sleep(10000);
		
		
		WebElement uploadFile =  driver.findElement(By.id("uploadFile"));
		uploadFile.sendKeys("C:\\Users\\USER\\Downloads\\sampleFile.jpeg");
		System.out.println("File is Uploaded Successfully");
		Thread.sleep(10000);
		
		
		
	} 
}
