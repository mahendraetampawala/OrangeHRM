#Author: Mahendra Etampawala
@tag
Feature: Feature to test the login and logout functionality as an existing user

  Background: 
    Given Directing to the "URL"

  @tag1
  Scenario: Verify the login funtionality with empty fields of username and password
    And User clicks on login button
    Then verifying the error messages
