package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ModalAutomation extends BaseDriver{
	 public static String baseURL = "https://demoqa.com/modal-dialogs";
	 
	 @Test(priority = 0)
	 public void openUrl() throws InterruptedException {
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}
	 
	 @Test(priority = 1)
	 public void ModalDialouge() throws InterruptedException {
		 WebElement showSmallModal =  driver.findElement(By.id("showSmallModal"));
		 showSmallModal.click();
		 Thread.sleep(1000);
         WebElement closeSmallModal = driver.findElement(By.id("closeSmallModal"));
         closeSmallModal.click();
         Thread.sleep(2000);
		 
		 WebElement showLargeModal =  driver.findElement(By.id("showLargeModal"));
		 showLargeModal.click();
		 Thread.sleep(3000);
	}
	 

	 
	 
}
