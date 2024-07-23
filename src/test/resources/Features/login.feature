#Author: Mahendra Etampawala

@tag
Feature: Verify that the customer could able to login and logout from the OrangeHRM application as an existing user

Background:
	Given Open the URL as "url_OrangeHRM"
	
  @tag1
  Scenario Outline: Click on login button with empty username and password fields
  	And Check the login button is clickable as "false"

  