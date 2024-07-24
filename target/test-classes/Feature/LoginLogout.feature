#Author: Mahendra Etampawala
@tag
Feature: Feature to test the login and logout functionality as an existing user

  Background: 
    Given Directing to the "URL"

  @tag1
  Scenario: Verify the login funtionality with empty fields of username and password
    And Check whether username and password fields are highlighted

	Scenario: Verify the login functionality with empty username field and valid password
		And User enters the valid password as "Password"
		And User clicks on the login button
		Then Check whether the username field is highlighted
		
		