package com.lumens.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.driverfactory.DriverFactory;
import com.lumens.utils.TestUtils;

public class LoginPage {

	//Variable Declartion
		private WebDriver driver;
		
		//Desc- LoginPage constructor
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public void validatingTheLogin() {
			
		WebElement closeWindow=driver.findElement(By.xpath("//*[@id='ltkpopup-close-button']"));
		closeWindow.click();	
		
		WebElement myAcc=driver.findElement(By.xpath("//button[@class='btn account-btn']"));
		myAcc.click();
		Actions act = new Actions(driver);
		act.moveToElement(myAcc).perform();
		
		
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);			
		WebElement signinClick=driver.findElement(By.xpath("//a[text()='Sign In']"));	
		signinClick.click();
		
		}
		
		public void enterEmailId(String emailId) {
			//WebElement eid=driver.findElement(By.xpath("//input[@id='dwfrm_login_username']"));
			new WebDriverWait(DriverFactory.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dwfrm_login_username']"))).sendKeys(emailId);
			//eid.sendKeys(emailId);
		}
		
	   public void enterPassword(String password) {
		   WebElement pwd=driver.findElement(By.xpath("//input[@id='dwfrm_login_password']"));	
	
		   pwd.sendKeys(password);
		}
	   
    	public void loginClick() {
    		WebElement loginClick=driver.findElement(By.xpath("//button[@name='dwfrm_login_login']"));	
       		loginClick.click();
       		
       	 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   try{
	            FileHandler.copy(file, new File("C:\\Users\\Nagaraj G Poojari\\git\\LumensDemo\\Screenshots\\Login.png"));
	            System.out.println("screenshot taken");
	        }catch(IOException e){
	            e.printStackTrace();
	        }

		}
}
