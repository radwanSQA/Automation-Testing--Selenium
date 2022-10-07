package com.learningautomation.TestNgLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgPractice extends BaseDriver{
   public String baseURL = "https://www.browserstack.com/";
   
   @Test
   public void verifyHomePageTitle() throws InterruptedException {
	   driver.get(baseURL);
	   String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	   String actualTitle = driver.getTitle();
	   Assert.assertEquals(actualTitle, expectedTitle);
	   Thread.sleep(3000);
  }
   
}
