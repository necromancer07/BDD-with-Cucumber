$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 2,
  "name": "Automating a fashion website using Cucumber Framework",
  "description": "",
  "id": "automating-a-fashion-website-using-cucumber-framework",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 25907094107,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "successful registration with email address",
  "description": "",
  "id": "automating-a-fashion-website-using-cucumber-framework;successful-registration-with-email-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigate to SignIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters email address \"sowq@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on create account button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Gender Title",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters \"Rossi\" in Personal Account First Name",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters \"Valencia\" in Personal Account Last name",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enters \"Password@123\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters \"Rossi\" in First Name",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters \"Valencia\" in Last name",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters \"12th street london\" in Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters \"London\" in City Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User selects appropriate State",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters \"23456\" in Zip Code Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters Phone Number \"4958371230\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User assign an address alias as \"xyz\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User Clicks on Register Button",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.User_is_on_Home_Page()"
});
formatter.result({
  "duration": 435648380,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.User_navigate_to_SignIn_Page()"
});
formatter.result({
  "duration": 3314275412,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sowq@gmail.com",
      "offset": 27
    }
  ],
  "location": "TestSteps.User_enters_email_address(String)"
});
formatter.result({
  "duration": 447986491,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.User_clicks_on_create_account_button()"
});
formatter.result({
  "duration": 261664279,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.Click_on_Gender()"
});
formatter.result({
  "duration": 1982157803,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rossi",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_personal_FirstName(String)"
});
formatter.result({
  "duration": 625738285,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Valencia",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_personal_LastName(String)"
});
formatter.result({
  "duration": 332026865,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password@123",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_password(String)"
});
formatter.result({
  "duration": 330823113,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rossi",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_firstName(String)"
});
formatter.result({
  "duration": 231665456,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Valencia",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_lastName(String)"
});
formatter.result({
  "duration": 290197520,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12th street london",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_Address(String)"
});
formatter.result({
  "duration": 460255600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_city(String)"
});
formatter.result({
  "duration": 259729862,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_state()"
});
formatter.result({
  "duration": 251624972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23456",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_zipCode(int)"
});
formatter.result({
  "duration": 316045830,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4958371230",
      "offset": 26
    }
  ],
  "location": "TestSteps.enter_phoneNumber(int)"
});
formatter.result({
  "duration": 367152626,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz",
      "offset": 33
    }
  ],
  "location": "TestSteps.assign_alias(String)"
});
formatter.result({
  "duration": 218123592,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.click_registerBtn()"
});
formatter.result({
  "duration": 3076285409,
  "status": "passed"
});
});