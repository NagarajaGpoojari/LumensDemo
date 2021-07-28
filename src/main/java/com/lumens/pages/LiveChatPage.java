package com.lumens.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.driverfactory.DriverFactory;

public class LiveChatPage {

	//Variable Declartion
	private WebDriver driver;
	
	//Desc- LoginPage constructor
	public LiveChatPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Methods
	public void liveChatByValidCredentials(String name) {
		
		new WebDriverWait(DriverFactory.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Live Chat')]"))).click();
		WebElement enterNameFeild=driver.findElement(By.xpath("//input[@id='txt_4616424']"));
		enterNameFeild.sendKeys(name);
	}
	
	public void enterEmail(String email) {
		WebElement enterEmailFeild=driver.findElement(By.xpath("//input[@id='txt_4616425']"));
		enterEmailFeild.sendKeys(email);
	}
	
	public void submitButtonClick() {
		WebElement submitBtn=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		submitBtn.click();
		
		 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   try{
	            FileHandler.copy(file, new File("C:\\Users\\LENOVO\\eclipse-workspace\\LumensProject\\Screenshots\\LiveChatWithCorrectCred.png"));
	            System.out.println("screenshot taken");
	        }catch(IOException e){
	            e.printStackTrace();
	        }
	}
	
}
