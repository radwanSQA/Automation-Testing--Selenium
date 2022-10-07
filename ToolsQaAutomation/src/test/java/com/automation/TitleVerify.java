package com.automation;

import org.testng.annotations.Test;

import junit.framework.Assert;



public class TitleVerify extends BaseDriver{
	public static String baseURL= "https://demoqa.com/";
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test
	public void titleVerify() {
		String expectedTitle= "ToolsQA";
		String actualTitle = driver.getTitle();
		System.out.println("Title : "+ actualTitle);
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}else {
			System.out.println("Title Not Matched");
		}
		
		//If else alternative
		//Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	
	
}
