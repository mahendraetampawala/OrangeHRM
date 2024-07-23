/**
 * 
 */
package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import io.cucumber.java.en.Given;

/**
 * @author mahen
 *
 */
public class LoginLogoutStepDefinitions {


	
	@Given("Open the URL as {string}")
	public void Open_the_URL_as(String URL) {
		WebDriverHelper.getWebDriverHelper().getURL(PropertyFileHandler.readProperty(URL));
	}
	@Given("Check the login button is clickable as {string}")
	public void Check_the_login_button_is_clickable_as(String arg1) {
		System.out.println("Need to implement");
	}
}
