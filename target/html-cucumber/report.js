$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Verify login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Test with Registered User",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user I will Navigate to Registration URL \"https://naveenautomationlabs.com/opencart/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.RegistrationNewUserStepDef.as_a_user_I_will_Navigate_to_Registration_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user I will enter UserName as \"Test05@gmail.com\" and Password as \"Test05\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.as_a_user_I_will_enter_UserName_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user validate login is successfull",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.as_a_user_validate_login_is_successfull()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});