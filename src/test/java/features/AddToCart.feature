Feature: Add to cart functionality

  Background: 
    Given As a user I will Navigate to Registration URL "https://naveenautomationlabs.com/opencart/"
    When As a user I will enter UserName as "Test05@gmail.com" and Password as "Test05"
    Then As a user validate login is successfull

  Scenario: Add a product to the cart
    When the user selects a product
    And they click the Add to cart button
    Then the product should be added to the cart

  Scenario: Add Multiple Products to the Cart
    When the user selects multiple products
    And they click the Add to Cart button for each product
    Then all selected products should be added to the cart

  Scenario: Proceed to Checkout
    When the user clicks the Checkout button in the cart
    Then they should be taken to the checkout page

  Scenario: Remove a Product from the Cart
    When the user removes a product from the cart
    Then the product should be removed from the cart

  Scenario: Remove all products from the Cart
    When the user removes all the productrs from the cart
    Then the cart should show zero items

  @WIP
  Scenario: Add a Not available product to the cart
    When the user selects a product
    Then the user clicks add to cart button
    And product should not added in the cart
