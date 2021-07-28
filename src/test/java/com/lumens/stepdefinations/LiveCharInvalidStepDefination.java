package com.lumens.stepdefinations;

import java.util.List;

import com.lumens.driverfactory.DriverFactory;
import com.lumens.pages.LiveChatPage;
import com.lumens.pages.LiveChatWithInvalidCredentials;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LiveCharInvalidStepDefination {
	
	LiveChatWithInvalidCredentials liveChatInvalid;
	
	@When("^User enter the correct name$")
	public void user_enter_the_correct_name(DataTable datatable) throws Throwable {
		liveChatInvalid=new LiveChatWithInvalidCredentials(DriverFactory.getDriver());	
		 List<String>li=datatable.asList(String.class);
		 liveChatInvalid.liveChatByValidCredentials(li.get(0));
	}

	@And("^User is able to enter wrong Email id$")
	public void user_is_able_to_enter_wrong_Email_id(DataTable datatable) throws Throwable {
		 List<String>li=datatable.asList(String.class);		  
		 liveChatInvalid.enterEmail(li.get(0));
	}

	@Then("^Click on submit$")
	public void click_on_submit() throws Throwable {
		liveChatInvalid.submitButtonClick();
	}

}
