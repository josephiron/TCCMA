package com.ma.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports", //generates every time we run the cukes runner
				"json:target/cucumber.json"
		
		},
		
		tags="@login",
		features= {"src/test/resources/feature"}, 
		glue= {"step_definitions"}
	//	,dryRun = true
		)


public class Runner {

}