package com.lumens.stepdefinations;

	import com.lumens.driverfactory.DriverFactory;
	import com.lumens.pages.NavigateBack;

	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class NavigateBackStepDef  {

		NavigateBack  navigateback;
		
		

	    @When("^User is able to go to product page$")
	    public void user_is_able_to_go_to_product_page() throws Throwable {
	    	navigateback= new NavigateBack(DriverFactory.getDriver());
	    	navigateback.productPage();
	    	
	    }

	    @Then("^User is able to navigate back to homepage$")
	    public void user_is_able_to_navigate_back_to_homepage() throws Throwable {
	    	navigateback.homepage();
	    }

		
	}

