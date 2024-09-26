/**
 * 
 */
package StepDefinitions;

import static org.testng.Assert.assertEquals;

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
	
	@And("user selects the user role as {string}")
	public void user_selects_the_user_role_as(String UserRole) {
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

}
