@Regression
Feature: New Registration

  Background: 
    Given As a user I will Navigate to Registration URL "https://naveenautomationlabs.com/opencart/"

  Scenario: Successful user registration
    When As a user I will enter required details for registration
      | FirstName | LastName | Email                | Telephone | Pwd    | Pwd2   |
      | Test05    | Test05   | Testing001@gmail.com | Test05    | Test05 | Test05 |
    Then As a user validate registration is successful

  Scenario: Registration with an existing email
    When the user provides and existing email address with requried details
      | FirstName | LastName | Email            | Telephone | Pwd    | Pwd2   |
      | Test05    | Test05   | Test05@gmail.com | Test05    | Test05 | Test05 |
    Then they should see an error message indicating the email is already in use

  Scenario: Registration with empty fields
    When the user click's on submit with empty fields
    Then they should see an error messages for empty fields

  Scenario: Registration without privacy policy checkin
    When the user provides an new email address with requried details
      | FirstName | LastName | Email               | Telephone | Pwd    | Pwd2   |
      | Test05    | Test05   | Testing01@gmail.com | Test05    | Test05 | Test05 |
    Then they should see an error message indicating you must agree to privacy policy

  Scenario: Registration with missing fields
    When the user provides and existing email address with missing phone detail
      | FirstName | LastName | Email            | Pwd    | Pwd2   |
      | Test05    | Test05   | Happy1@gmail.com | Test05 | Test05 |
    Then they should see an error message phone number must be present

  Scenario: Registratoin with incorrect re-confirm password
    When the user provides an existing email address with incorrect re-confirm password
      | FirstName | LastName | Email            | Telephone | Pwd    | Pwd2   |
      | Test05    | Test05   | Happy1@gmail.com | Test05    | Test05 | Test06 |
    Then they should see an error message password does not match
