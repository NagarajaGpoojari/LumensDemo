package com.lumens.stepdefinations;

import java.util.Properties;

import com.lumens.driverfactory.DriverFactory;
import com.lumens.pages.AddAndRemoveCartPage;
import com.lumens.pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAndRemoveStepDefination {

	//Variable Declaration
	AddAndRemoveCartPage addAndRemoveItem;
	   
	 //Desc- Mapping the snippets for actions of Addandremove item from cart	   
	   @When("^user search the item as fans$")
	   public void user_search_the_item_as_fans() throws Throwable {
		   addAndRemoveItem=new AddAndRemoveCartPage(DriverFactory.getDriver());	
		   addAndRemoveItem.searchTheFansInSerachBar();
	   }

	   @And("^Select the item and addto cart$")
	   public void select_the_item_and_addto_cart() throws Throwable {
		  addAndRemoveItem.addToCartItem();
	   }

	   @And("^click on view cart to view the item$")
	   public void click_on_view_cart_to_view_the_item() throws Throwable {
		   addAndRemoveItem.viewCartCartItem();
	   }

	   @Then("^remove the item from cart$")
	   public void remove_the_item_from_cart() throws Throwable {
	      
		   addAndRemoveItem.removeCartItem();
	   }

  
}
