package com.StepDefinations;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.HelperClass;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public static void setup() {
    	HelperClass.setUpDriver();
    }
//   
    @After(order = 1)
	public void takeScreenshot(Scenario scenario) throws IOException{
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) HelperClass.getDriver();
			byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr,"image/png","Screenshot");
 
		}
	}
    
    @After(order=0)
    public static void afterOpertation() {
        HelperClass.tearDown();
    }


}
