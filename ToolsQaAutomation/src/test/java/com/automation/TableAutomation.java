package com.automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableAutomation extends BaseDriver{
	 public static String baseURL = "https://demo.guru99.com/test/web-table-element.php";
	 public static String allURL= "http://demo.guru99.com/test/table.html";
	 
	 @Test(priority = 0)
	 public void openUrl() throws InterruptedException {
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}
	 
	@Test(priority = 1) 
	public void getTableSingleData() throws InterruptedException {
		List<WebElement> tableColList = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("No of cols "+ tableColList.size());
		
		
		List<WebElement> tableRowList = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No of cols "+ tableRowList.size());
		
		
		
		
		
		//Fetch cell value of a particular row and column of the Dynamic Table
		WebElement baseTablElement =  driver.findElement(By.tagName("table"));
		
		//TO find third row of table
		WebElement tableRowElement = baseTablElement.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]"));
		//WebElement  tableRowText = baseTablElement.findElement(By.xpath("//*[@id='leftcontainer']/table/thead/tr[3]/td[2]"));
		
		String rowText = tableRowElement.getText();
		System.out.println("Third row of Table "+rowText);
		
		
		//To find 3rd row and 2nd col
		WebElement tableCell =  baseTablElement.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));
		String cellValue =  tableCell.getText();
		System.out.println("Cell Vaue is " + cellValue);
		
		Thread.sleep(5000);
		
	}
	
	
	@Test(priority = 2)
	public void getTableAllData() throws InterruptedException {
		driver.get(allURL);
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows_table = table.findElements(By.tagName("tr"));
		int rows_count = rows_table.size();
		
		for(int row=0;row<rows_count;row++) {
			List<WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
			int columns_count = columns_row.size();
			System.out.println("Number of cell In"+row+"are"+columns_count);
	        for (int column = 0; column < columns_count; column++) {
	        	 // To retrieve text from that specific cell.
    	        String celtext = columns_row.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
			}
	        System.out.println("-------------------------------------------------- ");
		}
		
		Thread.sleep(5000);
	}
	
	
	
}
