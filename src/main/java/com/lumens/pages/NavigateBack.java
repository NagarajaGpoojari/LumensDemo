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
	

	public class NavigateBack {

		private WebDriver driver;
		
				
		public NavigateBack(WebDriver driver) {
			this.driver= driver;
		}
		
		public void productPage() {
			WebElement searchBar=driver.findElement(By.xpath("//*[@id='searchinput']"));
			searchBar.sendKeys("Grace Chandelier");
			searchBar.sendKeys(Keys.ENTER);

			WebElement chandelier=driver.findElement(By.xpath("//*[@title='Grace Chandelier']"));
			chandelier.click();
			
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   try{
		            FileHandler.copy(file, new File("C:\\Users\\Nagaraj G Poojari\\git\\LumensDemo\\Screenshots\\ProductPage.png"));
		            System.out.println("screenshot taken");
		        }catch(IOException e){
		            e.printStackTrace();
		        }
			
		}
		
		public void homepage() {
			WebElement logo=driver.findElement(By.xpath("//*[@class='logo-link lu-sprite']"));
			logo.click();
			
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   try{
		            FileHandler.copy(file, new File("C:\\Users\\satish\\eclipse-workspace\\LumensProject\\Screenshots\\Homepage.png"));
		            System.out.println("screenshot taken");
		        }catch(IOException e){
		            e.printStackTrace();
		        }
		}
	}



