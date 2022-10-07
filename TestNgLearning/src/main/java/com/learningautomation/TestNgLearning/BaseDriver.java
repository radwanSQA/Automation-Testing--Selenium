package com.learningautomation.TestNgLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
     public static WebDriver driver;
     @BeforeSuite
     public void Start() {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
	}
     
     @AfterSuite
     public void Close() {
		driver.close();
	}
}
