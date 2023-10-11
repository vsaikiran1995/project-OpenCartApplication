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
formatter.scenario({
  "name": "Proceed to Checkout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "name": "the user clicks the Checkout button in the cart",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.AddToCartSetpDef.the_user_clicks_the_Checkout_button_in_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "they should be taken to the checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AddToCartSetpDef.they_should_be_taken_to_the_checkout_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});