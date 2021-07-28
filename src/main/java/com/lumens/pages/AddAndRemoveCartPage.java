package com.lumens.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.driverfactory.DriverFactory;

public class AddAndRemoveCartPage {

	//Variable Declartion
		private WebDriver driver;
		
		//Desc- LoginPage constructor
		public AddAndRemoveCartPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public void searchTheFansInSerachBar() {
			
			WebElement searchBar=driver.findElement(By.xpath("//input[@id='searchinput']"));
			searchBar.sendKeys("Fans");	
			searchBar.sendKeys(Keys.ENTER);
									
			WebElement selectFan=driver.findElement(By.xpath("//*[contains(text(),'Spitfire Ceiling Fan')]"));
			selectFan.click();
				
		}
		
		public void addToCartItem() {
			WebElement addToCartBtn=driver.findElement(By.xpath("//button[@id='add-to-cart']"));
			addToCartBtn.click();
			
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   try{
		            FileHandler.copy(file, new File("C:\\Users\\LENOVO\\eclipse-workspace\\LumensProject\\Screenshots\\ItemAddedToCart.png"));
		            System.out.println("screenshot taken");
		        }catch(IOException e){
		            e.printStackTrace();
		        }
		
		}
		
		public void viewCartCartItem() {
			WebElement checkOutBtn=driver.findElement(By.xpath("//a[contains(text(),'CHECKOUT')]"));
			checkOutBtn.click();
		}
		
		public void removeCartItem() {
			WebElement removeBtn=driver.findElement(By.xpath("//button[@value='Remove']"));
			removeBtn.click();
			
			 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   try{
		            FileHandler.copy(file, new File("C:\\Users\\LENOVO\\eclipse-workspace\\LumensProject\\Screenshots\\RemoveCart.png"));
		            System.out.println("screenshot taken");
		        }catch(IOException e){
		            e.printStackTrace();
		        }
		
		}
		
}
