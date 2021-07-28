package com.lumens.stepdefinations;

import java.util.List;

import com.lumens.driverfactory.DriverFactory;
import com.lumens.pages.LiveChatPage;
import com.lumens.pages.LogoutPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LiveChatStepDefination {

	//Variable Declaration
	LiveChatPage livechatPage;
	  
	   
	 //Desc- Mapping the snippets for actions of LiveChat
	   
	  // LiveChatFunctionality   
	@When("^User enters the correct name$")
	public void user_enters_the_correct_name(DataTable datatable) throws Throwable {
		 livechatPage=new LiveChatPage(DriverFactory.getDriver());	
		 List<String>li=datatable.asList(String.class);
		 livechatPage.liveChatByValidCredentials(li.get(0));
	}

	@And("^User is able to enter the Email$")
	public void user_is_able_to_enter_the_Email(DataTable datatable) throws Throwable {
		  List<String>li=datatable.asList(String.class);		  
		  livechatPage.enterEmail(li.get(0));
	}

	@Then("^Click on submit Button$")
	public void click_on_submit_Button() throws Throwable {
		livechatPage.submitButtonClick();
	}
	
	


}
