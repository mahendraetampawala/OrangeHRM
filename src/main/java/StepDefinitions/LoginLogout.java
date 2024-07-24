/**
 * 
 */
package StepDefinitions;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeoutException;

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
	
	@Given("Check whether username and password fields are highlighted")
	public void Check_whether_username_and_password_fields_are_highlighted() throws InterruptedException {

	   	System.out.println("inside the login click");

	   	assertEquals(LoginLogoutPO.getnnewLoginPO().ValidateUsernameAndPwdFields(),true);

	}
	@Given("User enters the valid password as {string}")
	public void User_enters_the_valid_password_as(String pwd) {
		
		WebDriverHelper.getWebDriverHelper().pageRefresh();
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutPO.getnnewLoginPO().enterpassword(pwd);
		
	}
	@Given("User clicks on the login button")
	public void User_clicks_on_the_login_button() {
		
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutPO.getnnewLoginPO().loginButtonClick();
		
	}
	@Then("Check whether the username field is highlighted")
	public void Check_whether_the_username_field_is_highlighted() {
		
		
		assertEquals(LoginLogoutPO.getnnewLoginPO().loginValidationWithEmptyUsername(),true);
		
	}

}
