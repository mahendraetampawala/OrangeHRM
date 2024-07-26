/**
 * 
 */
package StepDefinitions;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageFactory.LoginLogoutFactory;
import PageObject.LoginLogoutPO;
import Utility.WebDriverHelper;
import Utility.propertyFileHandler;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author mahen
 *
 */ 
public class LoginLogout {

	



	
	@Given("Directing to the {string}")
	public  void directing_to_the(String URL) {
		
		//WebDriverHelper.getWebDriverHelper().webdriverInitilizer();
		WebDriverHelper.getWebDriverHelper().getURL(propertyFileHandler.readProperty(URL));
		
		System.out.println("This completed");
	}
	
	@Given("Check whether username and password fields are highlighted")
	public void Check_whether_username_and_password_fields_are_highlighted() throws InterruptedException {

	   	System.out.println("inside the login click");

	   	assertEquals(LoginLogoutPO.getnnewLoginPO().ValidateUsernameAndPwdFields(),true);
	   	//WebDriverHelper.getWebDriverHelper().closeDriver();

	}
	
	/* -----------------Working Fine-----------------------------------         */
	
	@Given("User enters the valid password as {string}")
	public void User_enters_the_valid_password_as(String pwd) {
		
		
		//WebDriverHelper.getWebDriverHelper().pageRefresh();
		WebDriverHelper.getWebDriverHelper().waitForPageLoad();
		LoginLogoutPO.getnnewLoginPO().enterpassword(pwd);
		
		
	}
	
	@Given("User clicks on the login button")
	public void User_clicks_on_the_login_button() {
		
		WebDriverHelper.getWebDriverHelper().waitForPageLoad();
		LoginLogoutPO.getnnewLoginPO().loginButtonClick();
		
	}
	
	@Then("Check whether the username field is highlighted")
	public void Check_whether_the_username_field_is_highlighted() {
		
		WebDriverHelper.getWebDriverHelper().implicitwait();
		assertEquals(LoginLogoutPO.getnnewLoginPO().loginValidationWithEmptyUsername(),true);
	 	
		
	}
	/* -----------------Working Fine-----------------------------------         */
	
	@And("User enters the valid username as {string}")
	public void User_enters_the_valid_username_as(String username) {
		
		WebDriverHelper.getWebDriverHelper().waitForPageLoad();
		LoginLogoutPO.getnnewLoginPO().enterUsername(username);
		
	}
	
	@And("User clicks on login button")
	public void User_clicks_on_login_button() {
		
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutPO.getnnewLoginPO().loginButtonClick();
		
	}
	
	@Then("User Check whether the Password field is highlighted")
	public void User_Check_whether_the_Password_field_is_highlighted() {
		
		WebDriverHelper.getWebDriverHelper().implicitwait();
		assertEquals(LoginLogoutPO.getnnewLoginPO().loginValidationWithEmptyPassword(),true);
	 
	}
	
	/* -----------------Working Fine-----------------------------------         */
	
	@And("User enters an Invalid username as {string}")
	public void User_enters_an_Invalid_username_as(String InvalidUsername) {
		
		WebDriverHelper.getWebDriverHelper().waitForPageLoad();
		LoginLogoutPO.getnnewLoginPO().enterUsername(InvalidUsername);
	}
	
	@And("User enters a valid password as {string}")
	public void User_enters_a_valid_password_as(String Password) {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutPO.getnnewLoginPO().enterpassword(Password);
	}
	
	@When("User clicks the login button")
	public void User_clicks_the_login_button() {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutPO.getnnewLoginPO().loginButtonClick();
	}
	
	@Then("Verify the error message as {string}")
	public void Verify_the_error_message_as(String errorMsg) {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutPO.getnnewLoginPO().verifyLoginErrorMessage(errorMsg);
	 	
	}

}
