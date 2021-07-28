package com.lumens.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/TC12_13_14.feature", glue={"com.lumens.stepdefinations"}, monochrome=true,
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent reports/report.html",
"pretty","junit:target/MyReports/report.xml","html:target/cucumber-html-report",
	"json:target/MyReports/report.json"})
public class AllFeatureTestRunner {
	@AfterClass
	public static void extentReport() {
		  Reporter.loadXMLConfig(new File(com.lumens.managers.FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));	
    }
	
}
