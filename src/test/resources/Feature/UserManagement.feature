#Author: Mahendra Etampawala
Feature: Feature to test admin user management functionalities

  Background: 
    Given Directing to the "URL"
    #And User enters a valid username as "Username"
    #And enters a valid password as "Password"
    # When Clicks on the login button
    Then Verifying whether the login is successful
    And user clicks on the admin
    And verify whether the user directed to the admin user management section

	@FullPhase
  Scenario: Verifying the functionality of adding users
    And User clicks on Add
    Then Verify user is on SaveSystemUser page
    And User selects the user role
    And User selects the status
    And User enters the employee name
    And User enters the username
    Then User enters the passowrd
    And User confirms the password
    When User clicks on the save button
    Then Verification of successfully adding the user

  #///////////////////////////////////////////////////////////////////////
  @FullPhase
  Scenario: Verify the functionality of user search
    And user enters the username as "user_"
    And The user selects the user role as "user_role_"
    Then user enter the emaployee name as "Employee_Name"
    And user selects the status as "Status"
    When user clicks on the search button
    Then Verify whether relavent search details are listed in the table

  Scenario: Verify the functionality of user search with Invalid username
    And user enters an invalid username as "Invalid_Username"
    And user selects the user_role as "admin"
    And user enters the emaployee_name as "Employee_Name"
    And the user selects the status as "Status"
    When the user clicks on the search button
    Then Verify whether the empty search details are listed in the table

  Scenario: Verifying the functionality of user search with invalid employee name
    And The user enters the user_name as "Username"
    And The user selects the user role as "admin"
    And The user enters an Invalid employee name as "Invalid_Employee_Name"
    And The user selects the "Status"
    When The user clicks on the search_button
    Then Verify whether there is non of the records for the relevant search

  Scenario: Verify the functionality of user search with empty values
    And user clicks on the search button without using any filteration option
    Then Verify whether the all records of the table retrieved as results

  Scenario: Verify the functionality of user search only with username
    And User enters a valid username as "Username"
    When User clicks on Search
    Then Verify whether all the relevant details according to the filteration retrieved

  Scenario: Verify the functionality of user search only with user role
    And The user selects the user role as "User_role"
    When User clicks on the search
    Then Verify whether all the relevant details according to the filteration retrieved into the table

  Scenario: Verify the functionality of user search only with employee name
    And User enters a valid employee name as "Employee_Name"
    When click on the search button
    Then Verify that all the relevant details according to the filteration retrieved into the table

  Scenario: Verify the functionality of user search only with status
    And select the status as "Status"
    When click on the search
    Then Verify that all the relevant details according to the filteration retrieved
