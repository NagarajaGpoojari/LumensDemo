package com.lumens.stepdefinations;

import com.lumens.driverfactory.DriverFactory;
import com.lumens.pages.HomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplyFilter_StepDef {
	HomePage ApplyFilter;
	
	@When("^Mousover on Lightings and select Chandelier$")
	public void mousover_on_Lightings_and_select_Chandelier() throws Throwable {
		ApplyFilter=new HomePage(DriverFactory.getDriver());
		ApplyFilter.NavigateToChandelier();
	}

	@Then("^click on Large Chandelier and Apply Filter$")
	public void click_on_Large_Chandelier_and_Apply_Filter() throws Throwable {
		ApplyFilter=new HomePage(DriverFactory.getDriver());
		ApplyFilter.ApplyFilter();
		System.out.println("ApplyFilter test passed");
		
		
	}

}
