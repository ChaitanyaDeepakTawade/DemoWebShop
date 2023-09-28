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
					"src/test/resources/features/TC_1_Registration.feature",
					"src/test/resources/features/TC_2_LoginPage.feature",
					"src/test/resources/features/TC_2.2_LoginPageForgetPassword.feature",
					"src/test/resources/features/TC_4_Categories_Books.feature",
					"src/test/resources/features/TC_9_Footer_Information.feature"
			},
			glue = "com.StepDefinations",
			plugin = {"pretty","html:target/cucumber-reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests{		

	}


}
