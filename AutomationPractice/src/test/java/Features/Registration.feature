@tag
Feature: Register using a valid E-mail address

  @tag1
  Scenario Outline: successful registration with email address
    Given User is on Home Page
    When User navigate to SignIn Page
    And User enters email address "<email>"
    And User clicks on create account button 
    Then User should be able to view account creation page
    
    Examples:
    |Email								|
    |abc123456@gmail.com	|
    

	@tag2
	Scenario Outline: Unsuccessful registration with email address
	  Given User is on Home Page
    When User navigate to SignIn Page
    And User enters invalid Email address "<email>"
		Then User should be able to see invalid email address message
		
		Examples:
		|Email					|
    |abc@gmail.com	|		
