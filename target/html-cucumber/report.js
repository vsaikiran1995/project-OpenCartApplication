$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Verify login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user I will Navigate to Registration URL \"https://naveenautomationlabs.com/opencart/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.as_a_user_I_will_Navigate_to_Registration_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login with invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "name": "user enter valid username \"Test05@gmail.com\" and invalid password as \"cyx\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.user_enter_valid_username_and_invalid_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see an error message indicating invalid password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.user_should_see_an_error_message_indicating_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});