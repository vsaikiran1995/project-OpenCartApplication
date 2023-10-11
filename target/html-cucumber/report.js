$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/AddToCart.feature");
formatter.feature({
  "name": "Add to cart functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "As a user I will Navigate to Registration URL \"https://naveenautomationlabs.com/opencart/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.as_a_user_I_will_Navigate_to_Registration_URL(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "As a user I will enter UserName as \"Test05@gmail.com\" and Password as \"Test05\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.as_a_user_I_will_enter_UserName_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "As a user validate login is successfull",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.as_a_user_validate_login_is_successfull()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add a Not available product to the cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "name": "the user selects a product",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks add to cart button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "product should not added in the cart",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});