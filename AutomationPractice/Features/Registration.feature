@tag
Feature: Automating a fashion website using Cucumber Framework

  @tag1
  Scenario: successful registration with email address
    Given User is on Home Page
    When User navigate to SignIn Page
    And User enters email address "sowq@gmail.com"
    And User clicks on create account button 
    When User clicks on Gender Title
    And User enters "Rossi" in Personal Account First Name
    And User enters "Valencia" in Personal Account Last name
    And User enters "Password@123" in password field
    And User enters "Rossi" in First Name
    And User enters "Valencia" in Last name
    And User enters "12th street london" in Address Field
    And User enters "London" in City Field
    And User selects appropriate State
    And User enters "23456" in Zip Code Field
    And User enters Phone Number "4958371230"
    And User assign an address alias as "xyz"
    Then User Clicks on Register Button

	@tag2
	Scenario: Checking if Mega Menu Works and navigating in dresses section
		Given User is on Home Page
		When User Hovers over the dresses button and select summer dress
		Then User should be navigated to summer dress section
		When User clicks on sort button
	 Then Dresses should be arranged in the grid accordingly
	
	
	@tag3
	Scenario: Unsuccessful registration with email address
	  Given User is on Home Page
    When User navigate to SignIn Page
    And User enters invalid Email address "ab1244.com"
    And User clicks on create account button
		Then User should be able to see invalid email address message
			
