package Runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;

import Utility.propertyFileHandler;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



/**
 * @author mahen
 *
 */

@CucumberOptions(features="src/test/resources/Feature", glue={"StepDefinitions"},plugin={"pretty","json:target/cucumber-json.json"})
public class Runner extends AbstractTestNGCucumberTests{

	@BeforeClass
	public static void setup() throws FileNotFoundException, IOException {
		propertyFileHandler.getpropertyFile();
		propertyFileHandler.loadPropertyFile("src/test/resources/data.properties");
	}
	
}
