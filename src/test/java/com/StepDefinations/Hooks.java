package com.StepDefinations;

import com.utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public static void setup() {
    	HelperClass.setUpDriver();
    }
//  
    @After
    public static void afterOpertation() {
        HelperClass.tearDown();
    }


}
