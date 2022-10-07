package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends BaseDriver{ 
    
	public static String baseUrl  = "https://www.aarong.com/";
	
	@Test(priority =0)
	public void openUrl() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority =1)
	public void LoginUrl() throws InterruptedException {
		WebElement loginBtn  = driver.findElement(By.xpath("//a[@href='https://www.aarong.com/customer/account/login/referer/aHR0cHM6Ly93d3cuYWFyb25nLmNvbS8,/']"));
	    loginBtn.click();
	    Thread.sleep(2000);
	
	}
	
	
	@Test(priority =2)
	public void LoginSubmit() throws InterruptedException {
		WebElement email  = driver.findElement(By.xpath("//body/div[6]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/form[1]/fieldset[1]/div[1]/div[1]/input[1]"));
	    email.sendKeys("anikradwan.ar@gmail.com");
	    
	    WebElement contineuBtn  = driver.findElement(By.id("send2"));
	    
	    contineuBtn.click(); 
	    
	    Thread.sleep(2000);

	}
	
	
	
			
	
	 
}
