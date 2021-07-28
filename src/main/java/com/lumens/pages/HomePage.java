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

	public class HomePage {

		//Variable Declartion
			private WebDriver driver;
			
			//Desc- LoginPage constructor
			public HomePage(WebDriver driver) {
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
		            FileHandler.copy(file, new File("C:\\Users\\Nagaraj G Poojari\\git\\LumensDemo\\Screenshots\\tab.png"));
		            System.out.println("screenshot taken");
		        }catch(IOException e){
		            e.printStackTrace();
		        }
			  
			   }
			

			public void Tab() throws Exception {
				
				Actions action = new Actions(driver);
				new WebDriverWait(DriverFactory.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav-tab-01\"]/a/span[1]")));			
				WebElement Lighting=driver.findElement(By.xpath("//*[@id=\"nav-tab-01\"]/a/span[1]"));
				action.moveToElement(Lighting).perform();
				//Lighting.click();
				Thread.sleep(20000);
				WebElement Fans=driver.findElement(By.xpath("//span[contains(text(),'fans')]"));
				action.moveToElement(Fans).build().perform();
				
				WebElement Furniture=driver.findElement(By.xpath("//span[contains(text(),'furniture')]"));
				action.moveToElement(Furniture).build().perform();
				
				WebElement Brands=driver.findElement(By.xpath("//*[@id=\"nav-tab-06\"]/a/span[1]"));
				action.moveToElement(Brands).build().perform();
			}
			public void NavigateToChandelier() throws InterruptedException {
				Thread.sleep(20000);
				WebElement Lighting=driver.findElement(By.xpath("//span[contains(text(),'lighting')]"));
				new WebDriverWait(DriverFactory.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'lighting')]")));
				//Lighting.click();
				Actions act = new Actions(driver);
				act.moveToElement(Lighting).perform();
				/*
				WebElement Lighting=driver.findElement(By.xpath("//span[contains(text(),'lighting')]"));
				
				//new WebDriverWait(DriverFactory.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'lighting')]")));			
				Actions action = new Actions(driver);
				action.moveToElement(Lighting).perform();
				Thread.sleep(20000);
				*/
				//Lighting.click();
				WebElement Chandeliers=driver.findElement(By.xpath("//a[contains(text(),'Chandeliers')]"));
				new WebDriverWait(DriverFactory.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Chandeliers')]"))).click();
				
			}
				public void ApplyFilter() {
					
				WebElement largeChandeliers=driver.findElement(By.xpath("//p[contains(text(),'Large Chandeliers')]"));
				largeChandeliers.click();
				
				WebElement TradeCheckBox=driver.findElement(By.xpath("//*[@id=\"refinement-tradeOnly\"]/div/ul/li[1]/a/span[1]/input"));
				TradeCheckBox.click();
				
				//WebElement selectProduct=driver.findElement(By.xpath("//a[contains(text(),'Chandelier Fleur de Kaolin')]"));
				new WebDriverWait(DriverFactory.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Chandelier Fleur de Kaolin')]"))).click();
				//selectProduct.click();
			}
			
			
			
			
			
}
	
