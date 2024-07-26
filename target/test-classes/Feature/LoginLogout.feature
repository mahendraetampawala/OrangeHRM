#Author: Mahendra Etampawala

Feature: Feature to test the login and logout functionality as an existing user

  Background: 
    Given Directing to the "URL"

@FullPhase
  Scenario: Verify the login funtionality with empty fields of username and password
    And Check whether username and password fields are highlighted
@FullPhase
  Scenario: Verify the login functionality with empty username field and valid password
    And User enters the valid password as "Password"
    And User clicks on the login button
    Then Check whether the username field is highlighted
	@FullPhase
  Scenario: Verify the login functionality with empty password field and valid username
    And User enters the valid username as "Username"
    And User clicks on login button
    Then User Check whether the Password field is highlighted
@FullPhase
  Scenario: Verify the login functionality with Invalid username and valid password
    And User enters an Invalid username as "InvalidUsername"
    And User enters a valid password as "Password"
    When User clicks the login button
    Then Verify the error message as "Login_Error_Message"
 @FullPhase
  Scenario: Verify the login functinality with valid username and valid password
  	  And User enters a valid username as "Username"
  	  And enters a valid password as "Password"
  	  When Clicks on the login button
  	  Then Verifying whether the login is successful
