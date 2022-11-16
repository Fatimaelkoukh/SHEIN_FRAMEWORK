package com.auto.runnerpackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/Reporting.feature"},
		glue = {"com.smarttechqa.stepdef","com.smarttechqa.hooks"}, 
		plugin = {"pretty","json:target/cucumber.json"},
				dryRun = false,
				monochrome = true
				//tags = "@smoke"
			

)
public class FeatureRunnerClass extends AbstractTestNGCucumberTests {

			
			
}
