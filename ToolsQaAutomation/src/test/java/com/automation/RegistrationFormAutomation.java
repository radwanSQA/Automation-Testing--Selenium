package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class RegistrationFormAutomation extends BaseDriver{
	
	Faker faker = new Faker();
	
	 public static String baseURL = "https://demoqa.com/automation-practice-form";
	 
	 
	 @Test(priority = 0)
	 public void openUrl() throws InterruptedException {
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}
	 
	@Test(priority = 1) 
	public void formRegistration() throws InterruptedException {
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys(faker.name().firstName());
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys(faker.name().lastName());
		
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		userEmail.sendKeys("radwan@gmail.com");
		
		WebElement genderRadioMale = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		genderRadioMale.click();
		
		
		WebElement userNumber = driver.findElement(By.id("userNumber"));
		userNumber.sendKeys("017000000");
		
		WebElement dateOfBirthInput =  driver.findElement(By.id("dateOfBirthInput"));
		dateOfBirthInput.click();
		
		
		WebElement monthSelect =  driver.findElement(By.className("react-datepicker__month-select"));
		Select month = new Select(monthSelect);
		month.selectByIndex(1);
		
		
		WebElement yearSelect =  driver.findElement(By.className("react-datepicker__year-select"));
		Select year = new Select(yearSelect);
		year.selectByIndex(1);
		
		WebElement dateSelect =  driver.findElement(By.xpath("//div[contains(text(),'21')]"));
		dateSelect.click();
		
		
		WebElement hobbySport =  driver.findElement(By.id("hobbies-checkbox-1"));
		Actions actions = new Actions(driver);
		actions.moveToElement(hobbySport).click().build().perform();
		
		WebElement hobbyReading =  driver.findElement(By.xpath("//label[contains(text(),'Reading')]"));
		hobbyReading.click();
		
		WebElement uploadPicture =  driver.findElement(By.id("uploadPicture"));
		uploadPicture.sendKeys("C:\\Users\\USER\\Downloads\\sampleFile.jpeg");
		System.out.println("File is Uploaded Successfully");
		
		
		WebElement currentAddress =  driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys(faker.address().cityName());
		currentAddress.sendKeys(faker.address().country());
		
		Thread.sleep(2000);
		
		
		WebElement suggestionSelect =  driver.findElement(By.className("subjects-auto-complete__value-container"));
		suggestionSelect.click();
		Thread.sleep(10000);
		
		
		//https://www.qaautomation.co.in/2019/09/auto-suggestion-auto-complete-text-box-selenium.html
		
		
		
		
		
		
	} 
}
