#Author: Mahendra Etampawala
@tag
Feature: Feature to test the login and logout functionality as an existing user

  Background: 
    Given Directing to the "URL"

  @tag1
  Scenario: Verify the login funtionality with empty fields of username and password
    And Check whether username and password fields are highlighted
    #Scenario: Click submit button with the blank institute id without click the institute text field in login page
    #And I checked the submit button is clickable as "false"
