package com.lumens.stepdefinations;

import java.util.List;
import java.util.Properties;

import com.lumens.driverfactory.DriverFactory;
import com.lumens.pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	//Variable Declaration
	   LoginPage loginPage;
	   public static Properties prop;
	   
	 //Desc- Mapping the snippets for actions of login
	   @Given("^User Able to Enter the EmailId$")
	   public void user_Able_to_Enter_the_EmailId(DataTable datatable) throws Throwable {
		   loginPage=new LoginPage(DriverFactory.getDriver());	
	   
		   loginPage.validatingTheLogin();
		   List<String>li=datatable.asList(String.class);
		   loginPage.enterEmailId(li.get(0));
		  
	   }

	   @Given("^User Able to Enter the Password$")
	   public void user_Able_to_Enter_the_Password(DataTable datatable) throws Throwable {
		   List<String>li=datatable.asList(String.class);
		   loginPage.enterPassword(li.get(0));
	   }

	   @Then("^User is Able to Click on Login Button$")
	   public void user_is_Able_to_Click_on_Login_Button() throws Throwable {
		   loginPage.loginClick();
	   }



}
