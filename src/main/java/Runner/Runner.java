package Runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



/**
 * @author mahen
 *
 */

@CucumberOptions(features="src/test/resources/Features", glue={"StepDefinitions"},plugin={"pretty","json:target/cucumber-json.json"})
public class Runner extends AbstractTestNGCucumberTests{

	public static void setup() throws FileNotFoundException, IOException {
		PropertyFileHandler.getPropertyFileHandler();
		PropertyFileHandler.loadPropertyFile("src/test/resources/TestData/data.properties");
		
		//WebDriverHelper.getWebDriverHelper();
		
	}
	
}
