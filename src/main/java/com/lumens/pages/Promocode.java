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
	

	public class Promocode {
		
		
			
		 WebDriver driver;

		public Promocode(WebDriver driver) {
			this.driver= driver;
			// TODO Auto-generated constructor stub
		}


	public void search() {
		
		WebElement searchBar=driver.findElement(By.xpath("//*[@id='searchinput']"));
		searchBar.sendKeys("Grace Chandelier");
		searchBar.sendKeys(Keys.ENTER);
			
	}

	public void addToCart() throws Exception{
		Thread.sleep(20000);
		WebElement chandelier=driver.findElement(By.xpath("//*[@title='Grace Chandelier']"));
		chandelier.click();
		
		WebElement addTocart=driver.findElement(By.xpath("//*[@title='Add to Cart']"));
		addTocart.click();
		
		WebElement checkout=driver.findElement(By.xpath("//a[@title='View Cart']"));
		checkout.click();
				
	}

	public void cart() {
		
		WebElement cart=driver.findElement(By.xpath("//span[text()= 'Cart']"));
		cart.click();
	}

	public void addCouponCode() {
		
		WebElement couponCode=driver.findElement(By.xpath("//*[@name='dwfrm_cart_couponCode']"));
			couponCode.sendKeys("23456");
		
		WebElement apply=driver.findElement(By.xpath("//*[@name='addcoupons']"));
			apply.click();
		
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   try{
		            FileHandler.copy(file, new File("C:\\Users\\Nagaraj G Poojari\\git\\LumensDemo\\Screenshots\\PromoCode.png"));
		            System.out.println("screenshot taken");
		        }catch(IOException e){
		            e.printStackTrace();
		        }
		
	}

	

}
