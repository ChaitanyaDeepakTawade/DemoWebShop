package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class) 
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
public class Runner {
	
	@CucumberOptions(
			features = {
					"src/test/resources/features"
			},
			glue = "com.StepDefinations",
			plugin = {"pretty","html:target/cucumber-reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests{		

	}


}
