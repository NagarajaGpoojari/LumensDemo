package com.lumens.stepdefinations;

import java.util.Properties;

import com.lumens.driverfactory.DriverFactory;
import com.lumens.pages.HomePage;

import cucumber.api.java.en.Then;


public class Tab_StepDef {
	HomePage tab;
	   public static Properties prop;
	   @Then("^mousover on the Lumens Webelements$")
	   public void mousover_on_the_Lumens_Webelements() throws Throwable {
	       tab= new HomePage(DriverFactory.getDriver());
	       tab.Tab();
	       System.out.println("Tab test passed");
	   }
}
