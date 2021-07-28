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

public class RegistrationPage {

	
	//Variable Declaration
		private WebDriver driver;
		
		//Desc- RegistrationPage constructor
		public RegistrationPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public void signinAccount() {
			WebElement closeWindow=driver.findElement(By.xpath("//*[@id='ltkpopup-close-button']"));
			closeWindow.click();

			//driver
			
			WebElement myAcc=driver.findElement(By.xpath("//button[@class='btn account-btn']"));
			myAcc.click();
			Actions act = new Actions(driver);
			act.moveToElement(myAcc).perform();
			
			
			driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);			
			WebElement signinClick=driver.findElement(By.xpath("//a[text()='Sign In']"));	
			signinClick.click();
			
			//WebElement createAccClick=driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
			new WebDriverWait(DriverFactory.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Create Account')]"))).click();
			//createAccClick.click();
			
		
		}
		
		public void registerExcel(String firstName1, String lastName1, String email1, String cnfmEmail1, String password1, String pwdConfirm1 )
	      {
	    	WebElement fn=driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_firstname']"));
	    	fn.sendKeys(firstName1);
	    	    	
	    	WebElement ln=driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_lastname']"));
	    	ln.sendKeys(lastName1);
	     
	    	WebElement eId=driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_email']"));
	    	eId.sendKeys(email1);
	    	
	    	WebElement edi1=driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_emailconfirm']"));  	
	    	edi1.sendKeys(cnfmEmail1);
	    	
	    	WebElement password=driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_password']"));
	    	password.sendKeys(password1);
	    	
	    	WebElement cnPassword=driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_passwordconfirm']"));
	    	cnPassword.sendKeys(pwdConfirm1);
	    	
	        }
		
		public void createAnAccountBtnClick() {
			
			WebElement createAccountBtn=driver.findElement(By.xpath("//button[@onclick='submitForm();']"));
			
			createAccountBtn.click();
			
			 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   try{
		            FileHandler.copy(file, new File("C:\\Users\\Nagaraj G Poojari\\git\\LumensDemo\\Screenshots\\Registration.png"));
		            System.out.println("screenshot taken");
		        }catch(IOException e){
		            e.printStackTrace();
		        }
			
		}
		
		
}
