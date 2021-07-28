package com.lumens.stepdefinations;

import java.util.Properties;

import com.lumens.driverfactory.DriverFactory;
import com.lumens.pages.LoginPage;
import com.lumens.pages.LogoutPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutStepDeination {

	//Variable Declaration
	   LogoutPage logoutPage;
	  
	   
	 //Desc- Mapping the snippets for actions of login
	   
	  // LogOutFunctionality   
	   @When("^Place cursor on account profile image$")
	   public void place_cursor_on_account_profile_image() throws Throwable {
		   logoutPage=new LogoutPage(DriverFactory.getDriver());	
	   }

	   @Then("^click signout$")
	   public void click_signout() throws Throwable {
	     logoutPage.logOutFunctionality();
	   }

}
