package Runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utility.WebDriverHelper;
import Utility.propertyFileHandler;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



/**
 * @author mahen
 *
 */

@CucumberOptions(features="src/test/resources/Feature", glue={"StepDefinitions"},plugin={"pretty","json:target/cucumber-json.json"},tags = "@FullPhase")
public class Runner extends AbstractTestNGCucumberTests{

	@BeforeClass
	public static void setup() throws FileNotFoundException, IOException {
		propertyFileHandler.getpropertyFile();
		propertyFileHandler.loadPropertyFile("src/test/resources/data.properties");
		WebDriverHelper.getWebDriverHelper();
		WebDriverHelper.getWebDriverHelper().webdriverInitilizer(propertyFileHandler.readProperty("Browser"),propertyFileHandler.readProperty("OS"));
	}
	@AfterClass
	public static void teaDown() {
		if(WebDriverHelper.getWebDriverHelper()!=null) {
			WebDriverHelper.getWebDriverHelper().quiteDriver();
		}
	}
	
}
