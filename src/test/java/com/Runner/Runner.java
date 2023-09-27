package com.Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class) 
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
public class Runner {
	
	@CucumberOptions(
			features = {"src/test/resources/features/Register.feature","src/test/resources/features/loginPage.feature","src/test/resources/features/LoginPageForgetPassword.feature"},
			glue = "com.StepDefinations",
			plugin = {"pretty","html:target/cucumber reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			//DM - Monochrome & Publish added
			monochrome = true,
			publish = true
			
			//We use monochrome = true in the runner file to make the console output of Cucumber tests more readable. When monochrome = false, the console output may contain unreadable characters, especially if the output is being piped to a file or another application.
			
			
	)
	
	//DM - This class is added to implement parallel execution using testng.
	
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests{		

//		The @Override annotation indicates that the child class method is over-writing its base class method. The @Override annotation can be useful for two reasons It extracts a warning from the compiler if the annotated method doesn't actually override anything. It can improve the readability of the source code.
		
		@Override
		@DataProvider(parallel = true)
		public Object[][] scenarios() {
			return super.scenarios();
		}
	}


}
