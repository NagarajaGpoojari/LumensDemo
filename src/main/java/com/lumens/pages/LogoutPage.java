package com.lumens.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.driverfactory.DriverFactory;
import com.lumens.utils.TestUtils;

public class LogoutPage {

	//Variable Declartion
			private WebDriver driver;
			
			//Desc- LoginPage constructor
			public LogoutPage(WebDriver driver) {
				this.driver = driver;
			}
			
			public void logOutFunctionality() {
				
//				WebElement closeWindow=driver.findElement(By.xpath("//*[@id='ltkpopup-close-button']"));
//				closeWindow.click();	
				
				WebElement myAcc=driver.findElement(By.xpath("//button[@class='btn account-btn']"));

				Actions act = new Actions(driver);
				act.moveToElement(myAcc).perform();
				
				
				//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);			
			//	WebElement signoutClick=driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));	
				//	signoutClick.click();
				
				new WebDriverWait(DriverFactory.getDriver(), 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Sign Out')]"))).click();
		
				
				}
}
