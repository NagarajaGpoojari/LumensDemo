package com.lumens.stepdefinations;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lumens.pages.VerifyTitlePage;

import cucumber.api.java.en.Then;

public class VerifyTitleStepDef {
	VerifyTitlePage verify;
	   public static Properties prop;
	   
	@Then("^verify the title of Lumens$")
	public void verify_the_title_of_Lumens() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lumens.com/");
		Assert.assertEquals("Modern Lighting, Ceiling Fans, Furniture &amp; Home Decor | Lumens.com", driver.getTitle());
		System.out.println("Verify Titletest passed");
}
}
