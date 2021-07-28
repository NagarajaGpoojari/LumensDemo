package com.lumens.stepdefinations;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.lumens.driverfactory.DriverFactory;
import com.lumens.pages.RegistrationPage;
import com.lumens.utils.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefination {

	//Variable Declarations
			RegistrationPage regPage;
			Properties prop;

			//Desc- User able to register the account
			
			@Given("^user launch correct url$")
			public void user_launch_correct_url() throws Throwable {
				 regPage=new RegistrationPage(DriverFactory.getDriver());		
			     regPage.signinAccount();
			}

			@When("^user is going to enter all required feilds from sheetname\"([^\"]*)\" and rownumber (\\d+)$")
			public void user_is_going_to_enter_all_required_feilds_from_sheetname_and_rownumber(String sheetName, int rowNumber) throws Throwable {
				  
				ExcelReader  reader=new ExcelReader();
				    
				    List<Map<String,String>> testData =  reader.getData("D:\\Automation\\datadetails.xlsx",sheetName);
				    String firstName2 = testData.get(rowNumber).get("FirstName");
				    String lastName2 = testData.get(rowNumber).get("LastName");
				    String email2 = testData.get(rowNumber).get("Email");
				    String confirmEmail2 = testData.get(rowNumber).get("ConfirmEmail");
				    String password2 = testData.get(rowNumber).get("Password");
				    String pwdconfirm2 = testData.get(rowNumber).get("ConfirmPassword");
				    
				    regPage.registerExcel(firstName2, lastName2, email2,confirmEmail2, password2, pwdconfirm2);
			}

			@Then("^user click on create account button$")
			public void user_click_on_create_account_button() throws Throwable {
				regPage.createAnAccountBtnClick();
			}


}
