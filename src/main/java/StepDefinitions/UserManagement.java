/**
 * 
 */
package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginLogoutPO;
import PageObject.UserManagementPO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author mahen
 *
 */
public class UserManagement {
	
	@And("user clicks on the admin")
	public void user_clicks_on_the_admin() {
		UserManagementPO.getUserManagement().AdminButtonClick();
	}
	
	@And("verify whether the user directed to the admin user management section")
	public void verify_whether_the_user_directed_to_the_admin_user_management_section() {
		
		assertEquals(UserManagementPO.getUserManagement().verificationOfDirectionToUserManagement(),true);
		
		//System.out.println("Verification Passed");
	}

	@And("user enters the username as {string}")
	public void user_enters_the_username_as(String Username){
		UserManagementPO.getUserManagement().EnterUsername(Username);
	}
	
	@And("The user selects the user role as {string}")
	public void The_user_selects_the_user_role_as(String UserRole) {
		UserManagementPO.getUserManagement().selectUserRole(UserRole);
	}
	
	
	@Then("user enter the emaployee name as {string}")
	public void user_enter_the_emaployee_name_as(String EmployeeName) {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Inside the 'enter employee name method'");
		UserManagementPO.getUserManagement().SetEmployeeName(EmployeeName);
		
		
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user selects the status as {string}")
	public void user_selects_the_status_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user clicks on the search button")
	public void user_clicks_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Verify whether relavent search details are listed in the table")
	public void verify_whether_relavent_search_details_are_listed_in_the_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	/*-----------------------------------------------------------------------------------------------*/
	
	@Test(priority=1)
	@Then("User clicks on Add")
	public void user_clicks_on_add() {
	    UserManagementPO.getUserManagement().ClickOnAddButton();
	}
	@Test(priority=2)
	@Then("Verify user is on SaveSystemUser page")
	public void verify_user_is_on_save_system_user_page() {
	    Assert.assertEquals(UserManagementPO.getUserManagement().VerificationOfAddUserPage(), true);
	    System.out.println("Verification passed");
	}
	@Test(priority=3)
	@Then("User selects the user role")
	public void user_selects_the_user_role() {
	    UserManagementPO.getUserManagement().selectUserRole();
	}
	@Test(priority=4)
	@Then("User selects the status")
	public void user_selects_the_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Test(priority=5)
	@Then("User enters the employee name")
	public void user_enters_the_employee_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Test(priority=6)
	@Then("User enters the username")
	public void user_enters_the_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Test(priority=7)
	@Then("User enters the passowrd")
	public void user_enters_the_passowrd() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Test(priority=8)
	@Then("User confirms the password")
	public void user_confirms_the_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Test(priority=9)
	@When("User clicks on the save button")
	public void user_clicks_on_the_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Test(priority=10)
	@Then("Verification of successfully adding the user")
	public void verification_of_successfully_adding_the_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

}
