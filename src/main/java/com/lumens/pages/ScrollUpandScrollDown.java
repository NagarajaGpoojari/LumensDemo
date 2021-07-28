package com.lumens.pages;



	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;

	import cucumber.api.java.en.When;

	public class ScrollUpandScrollDown {
		
		WebDriver driver;
		
		@When("^User is able to Scroll up and down$")
		public void user_is_able_to_Scroll_up_and_down() throws Throwable {
		        JavascriptExecutor js =(JavascriptExecutor) driver;  //using java script executer 
		        js.executeScript("window.scrollBby(0,350)", "");  //scroll down
		        js.executeScript("window.scrollBby(0,-350)", "");  //scroll up
		    }

	}



