package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePickerAutomation extends BaseDriver{
	 public static String baseURL = "https://demoqa.com/date-picker";
	 
	 @Test(priority = 0)
	 public void openUrl() throws InterruptedException {
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}
	 
	@Test(priority = 1) 
	public void datePicker() throws InterruptedException {
		
		WebElement datePickerMonthYearInput = driver.findElement(By.id("datePickerMonthYearInput"));
		datePickerMonthYearInput.click();
		Thread.sleep(2000);
		
		
		WebElement monthSelect =  driver.findElement(By.className("react-datepicker__month-select"));
		Select month = new Select(monthSelect);
		month.selectByIndex(1);
		
		
		WebElement yearSelect =  driver.findElement(By.className("react-datepicker__year-select"));
		Select year = new Select(yearSelect);
		year.selectByIndex(1);
		
		WebElement dateSelect =  driver.findElement(By.xpath("//div[contains(text(),'21')]"));
		dateSelect.click();
		
		Thread.sleep(3000);
	
	} 
	
	
	@Test(priority = 2)
	public void dateAndTimePicker() throws InterruptedException {
		
		WebElement dateAndTimePickerInput = driver.findElement(By.id("dateAndTimePickerInput"));
		dateAndTimePickerInput.click();
		Thread.sleep(2000);
		
		
		WebElement selectMonthDropdown =  driver.findElement(By.className("react-datepicker__month-dropdown-container"));
		selectMonthDropdown.click();
		WebElement selectMonth = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]"));
		selectMonth.click();
		
		WebElement selectYearDropdown =  driver.findElement(By.className("react-datepicker__year-dropdown-container"));
		selectYearDropdown.click();
		Thread.sleep(3000);
		WebElement selectYear = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[7]"));
		selectYear.click();
		
		Thread.sleep(5000);
		
		WebElement dateSelect =  driver.findElement(By.xpath("//div[contains(text(),'21')]"));
		dateSelect.click();
		
		Thread.sleep(5000);
		
		WebElement timeSelect =  driver.findElement(By.xpath("//li[contains(text(),'12:15')]"));
		timeSelect.click();
		
		Thread.sleep(10000);

		
		Thread.sleep(3000);
	}
}
