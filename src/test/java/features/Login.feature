@Regression
Feature: Verify login functionality

  Background: 
    Given As a user I will Navigate to Registration URL "https://naveenautomationlabs.com/opencart/"

  Scenario: successful login with valid credentials
    When As a user I will enter UserName as "Test05@gmail.com" and Password as "Test05"
    Then As a user validate login is successfull

  Scenario: Login with both invalid username and password credentials
    When As a user I will enter UserName as "test" and Password as "test"
    Then As a user validate login is unsuccessfull

  Scenario: login with invalid username
    When user enter invalid username "Test0510@gmail.com" and valid password as "Test05"
    And user click on login button
    Then user should see an error message indicating invalid username

  Scenario: login with invalid password
    When user enter valid username "Test05@gmail.com" and invalid password as "cyx"
    And user click on login button
    Then user should see an error message indicating invalid password
