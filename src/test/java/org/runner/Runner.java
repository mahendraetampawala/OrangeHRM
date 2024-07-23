/**
 * 
 */
package org.runner;

import io.cucumber.testng.CucumberOptions;

/**
 * @author mahen
 *
 */

@CucumberOptions(features="src/test/resources/Feature", glue={"org.StepDefinitions"},plugin= {"pretty","json:target/cucumber-json.json"})
public class Runner {

	
	
}
