Feature: Purchase product E2E flow

  Background: 
    Given As a user I will Navigate to Registration URL "https://naveenautomationlabs.com/opencart/"
    When As a user I will enter UserName as "Test05@gmail.com" and Password as "Test05"
    Then As a user validate login is successfull

  @Smoke
  Scenario: Test Purchase Product E2E Flow
    Given As a user I will select desired product
    When As a user I will enter required details to complete the order
    Then As a user I will validate order is placed successfull
