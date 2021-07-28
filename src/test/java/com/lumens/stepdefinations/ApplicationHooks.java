package com.lumens.stepdefinations;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.lumens.driverfactory.DriverFactory;
import com.lumens.utils.ConfigReader;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ApplicationHooks {

	
	//Variable Declartion
		private DriverFactory driverFactory;
		private WebDriver driver;
		private ConfigReader configReader;
		Properties prop;
		
		//annotations
		@Before(order = 0)
		public void getProperty() {
			configReader = new ConfigReader();
			prop = configReader.init_prop();
		}
		
		@Before(order = 1) 
		public void lauchBrowser() {
			String browserName = prop.getProperty("browser");
			driverFactory = new DriverFactory();
			driverFactory.init_driver(browserName);
			driverFactory.getDriver().get(prop.getProperty("url"));
	      
		}
		
		@After(order = 0)
		public void quitBrowser() {
			driverFactory.getDriver().close();    // closing bowser
		}
		
		@After(order = 1)
		public void endTest(Scenario scenario) { // Taking Screenshots for failed testcases
			if (scenario.isFailed()) {

				try {
	    // Taking Screenshot code for failed Testcases
					final byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
					scenario.embed(screenshot, "image/png"); // ... and embed it in
				} catch (WebDriverException e) {
					e.printStackTrace();
				}
				
			} else {   // Taking Screenshots for passed testcases
				try {
					scenario.embed(((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		//	DriverFactory.getDriver().quit();
		}
			
}
