package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxAutomation extends BaseDriver {
	
	public static String anotherUrl = "https://codenboxautomationlab.com/practice/";
    
    //for normal checkBox
    @Test(priority = 0)
	public void basicCheckBox() throws InterruptedException {
		driver.get(anotherUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement checkedInput = driver.findElement(By.id("checkBoxOption1"));
		checkedInput.click();
		Thread.sleep(5000);
		
	}
    
    
   
    public static String baseURL= "https://demoqa.com/checkbox";

    //for TreeCheckobox
	@Test(priority = 1)
	public void teeCheckBox() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement checkBoxTree = driver.findElement(By.xpath("//label[@for='tree-node-home']"));
		checkBoxTree.click();
		WebElement result =  driver.findElement(By.id("result"));
		System.out.println(result.getText());
		Thread.sleep(2000);
		
		
//		WebElement treeNodeWorkspace = driver.findElement(By.xpath("//label[@for='tree-node-workspace']"));
//		treeNodeWorkspace.click();
//		WebElement resultTreeNodeWorkspace =  driver.findElement(By.id("result"));
//		System.out.println(resultTreeNodeWorkspace.getText());
//		Thread.sleep(2000);
		
	}
	
	
}
