/**
 * 
 */
package StepDefinitions;

import PageFactory.LoginLogoutFactory;
import PageObject.LoginLogoutPO;
import Utility.WebDriverHelper;
import Utility.propertyFileHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author mahen
 *
 */
public class LoginLogout {

	
	@Given("Directing to the {string}")
	public void directing_to_the(String URL) {
		
		WebDriverHelper.getWebDriverHelper().webdriverInitilizer();
		WebDriverHelper.getWebDriverHelper().getURL(propertyFileHandler.readProperty(URL));
		
		System.out.println("This completed");
	}
	
	@Given("User clicks on login button")
	public void User_clicks_on_login_button() {
		
		WebDriverHelper.getWebDriverHelper().implicitwait();
	   	System.out.println("inside the login click");
		LoginLogoutPO.getnnewLoginPO().clickonLoginButton();
	
		
		
	}



	@Then("verifying the error messages")
	public void verifying_the_error_messages() {
	  
	System.out.println("inside the verification method");
		
		
	}

}
