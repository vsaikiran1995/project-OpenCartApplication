Feature: Add to cart functionality

  Background: 
    Given As a user I will Navigate to Registration URL "https://naveenautomationlabs.com/opencart/"
    When As a user I will enter UserName as "Test05@gmail.com" and Password as "Test05"
    Then As a user validate login is successfull

  Scenario: Add a product to the cart
    When the user selects a product
    And they click the Add to cart button
    Then the product should be added to the cart
    And the cart icon should show the updated item count
