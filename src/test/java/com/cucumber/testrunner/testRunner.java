package com.cucumber.testrunner;

import org.junit.runner.RunWith;

import com.cucumber.baseclass.BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\cucumber\\feature",
		glue = "com.cucumber.stepdefinition"
		)
public class testRunner extends BaseClass1 {
	
	
	

}
