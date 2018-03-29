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
  "duration": 21950795484,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Unsuccessful registration with email address",
  "description": "",
  "id": "automating-a-fashion-website-using-cucumber-framework;unsuccessful-registration-with-email-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "User navigate to SignIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User enters invalid Email address \"ab1244.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User clicks on create account button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User should be able to see invalid email address message",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.User_is_on_Home_Page()"
});
formatter.result({
  "duration": 445176789,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.User_navigate_to_SignIn_Page()"
});
formatter.result({
  "duration": 3626374899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ab1244.com",
      "offset": 35
    }
  ],
  "location": "TestSteps.User_enters_invalid_Email_address(String)"
});
formatter.result({
  "duration": 418638932,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.User_clicks_on_create_account_button()"
});
formatter.result({
  "duration": 241753915,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.User_should_be_able_to_see_invalid_email_address_message()"
});
formatter.result({
  "duration": 1789984134,
  "status": "passed"
});
});