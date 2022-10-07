package com.automation;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class BrowserTabHandling extends BaseDriver{
	public static String baseURL= "https://demoqa.com/menu";
	public static String aarongURL = "https://www.aarong.com/";
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void browserTabSwitch() throws InterruptedException {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(aarongURL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Back to previous window
		driver.switchTo().window(windowHandling().get(0));
		
	}
	
	
	public List<String> windowHandling(){
		Set<String> windowHandles =  driver.getWindowHandles();
		ArrayList<String> windowHandleList = new ArrayList<String>(windowHandles);
		
		@SuppressWarnings("unused")
		int size = windowHandleList.size();
		return windowHandleList;
		
		
	}
}
