package com.lumens.stepdefinations;


import com.lumens.driverfactory.DriverFactory;
import com.lumens.pages.Promocode;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	public class PromocodStepDef {
		
		Promocode  promoCode;
		
		    @When("^User is able to go to cart$")
		    public void user_is_able_to_go_to_cart() throws Throwable {
		    	promoCode = new Promocode(DriverFactory.getDriver());
		    	promoCode.addToCart();
		    	promoCode.cart();
		    }

		    @Then("^User is able to add promocode$")
		    public void user_is_able_to_add_promocode() throws Throwable {
		    	promoCode.addCouponCode();

		}
		
	}



