package com.lumens.pages;

	
	import java.util.concurrent.TimeUnit;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.JavascriptExecutor;
	
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.utils.UtilScreenshot;

	

	public class ZipCodePage {
		private WebDriver driver;
		//home page locator
		private By HomeButton = By.xpath("//a[@class='logo-link lu-sprite']");
//		product locators
		private By LightingButton = By.xpath("//span[contains(text(),'fans')]");
		private By Product = By.xpath("//a[@title='Ceiling Fans with Lights']");
		private By product = By.xpath("//a[@class='name-link'][contains(text(),'Spitfire Ceiling Fan')]");
		private By Close = By.xpath("//div[@id='ltkpopup-close-button']//a[@class='ltkpopup-close']");
		private By ClosePop = By.xpath("//div[@id='ltkpopup-close-button']//a[@class='ltkpopup-close']");
		private By product1 = By.xpath("//div//img[@id='LPMcloseButton-1627408834776-8']");
		private By ClosePop1 = By.xpath("//img[@id='LPMcloseButton-1627393470756-3']");
//		cart locators
		private By CartButton = By.xpath("//form[@id='dwfrm_product_addtocart_d0hwkwfrznqr']//button[@id='add-to-cart']");
		private By DropDown = By.xpath("//div[@id='downrod-variations']/ul/select[1]");
		private By DropDown1 = By.xpath("//div[@id='downrod-variations']/ul/select[2]");
		private By PlusButton = By.xpath("//button[@class='plusButton pdp-btn pdp-btn-plus']");
		private By Cartbutton = By.xpath("//button[@type='button'][contains(text(),'ADD TO CART')]");
	// zip locators
		private By Securecheckout = By.xpath("//button[contains(text(),'Secure checkout')]");
		private By enterAddress = By.xpath("//a[@class='enter-address']");
		private By FirstName = By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_firstName']");
		private By LastName = By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_lastName']");
		private By address = By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_address1']");
		private By address2 = By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_address2']");
		private By city = By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_city']");
		private By cityfeild = By.xpath("//select[@id='dwfrm_singleshipping_shippingAddress_addressFields_states_stateUS']");
		private By postal = By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_postal']");
		private By phone = By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_phone']");
		private By savebutton= By.xpath("//span[contains(text(),'SAVE & CONTINUE')]");
		private By errorMessage = By.xpath("//span[@for='dwfrm_singleshipping_shippingAddress_addressFields_postal']");
//		private By phone = By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_phone']");
//		private By savebutton= By.xpath("//span[contains(text(),'SAVE & CONTINUE')]");
		
		public ZipCodePage(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			this.driver = driver; // pagefactory
		}
		
		public void homepage() throws Throwable {
//			navigate to home page 
			WebDriverWait wait = new WebDriverWait(driver, 2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(HomeButton));
			driver.findElement(HomeButton).click();
			System.out.println("@user able goes to home page");
		}

		public void lightingButton()  {
//			product page
			Actions action = new Actions(driver);
				WebDriverWait wait = new WebDriverWait(driver, 2000);
				action.moveToElement(driver.findElement(LightingButton)).build().perform();
				System.out.println("@user able click fan button");
				driver.findElement(Product).click();
				System.out.println("@user able click lighting fan button");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", driver.findElement(product));
				wait.until(ExpectedConditions.visibilityOfElementLocated(product));
				driver.findElement(product).click();
				System.out.println("@user able click product page");
			}
		
		public void plusButton() throws Throwable {
//			increasing the quantity in cart page
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(CartButton));
//			wait.until(ExpectedConditions.visibilityOfElementLocated(CartButton));
			driver.findElement(CartButton).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(DropDown));
			Select dropbutton =new Select(driver.findElement(DropDown));
			dropbutton.selectByIndex(5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(DropDown1));
			Select dropbutton2 =new Select(driver.findElement(DropDown1));
			dropbutton2.selectByIndex(1);
			for(int i = 0; i<3; i++) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PlusButton));
			driver.findElement(PlusButton).click();
			System.out.println("@user able increase quantity");
			}
			wait.until(ExpectedConditions.visibilityOfElementLocated(Cartbutton));
			driver.findElement(Cartbutton).click();
			System.out.println("@user able click cart button");
			Thread.sleep(8000);
			UtilScreenshot shots = new UtilScreenshot();
			shots.CaptureScreenshot(driver, "Quantity.png");
		}
		
		public void postal() throws Throwable {
//			entring zip/postal code
			WebDriverWait wait = new WebDriverWait(driver, 2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Securecheckout));
			driver.findElement(Securecheckout).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(enterAddress));
			driver.findElement(enterAddress).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(FirstName));
			driver.findElement(FirstName).sendKeys("santosh");
			driver.findElement(LastName).sendKeys("reddy");
			driver.findElement(address).sendKeys("No909 North Street US noisec");
//			driver.findElement(address2).sendKeys("Unit A");
			driver.findElement(city).sendKeys("hendey");
			Select select1=new Select(driver.findElement(cityfeild));
			select1.selectByIndex(3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(postal));
			driver.findElement(postal).sendKeys("123456");
			driver.findElement(phone).sendKeys("7894561230");
			driver.findElement(savebutton).click();
			Thread.sleep(8000);
			UtilScreenshot shots = new UtilScreenshot();
			shots.CaptureScreenshot(driver, "ZipCodeError.png");;
		}
		public String getTextMessage() {
//			zip/postal code error message
			return driver.findElement(errorMessage).getText();	
		}
//		public static void CaptureScreenshot(WebDriver driver, String fileName) throws IOException {
//			TakesScreenshot ts = (TakesScreenshot)driver;
//			File file = ts.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(file, new File("./Screenshot/"+fileName+""));
//		}
	}



