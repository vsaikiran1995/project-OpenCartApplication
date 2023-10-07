Feature: Verify New User Registration Test Scenario
  
  Scenario: Test New User Registration
    Given As a user I will Navigate to Registration URL "https://naveenautomationlabs.com/opencart/"
    When As a user I will enter required details for registration
      | FirstName | LastName | Email            | Telephone | Pwd    | Pwd2   |
      | Test05    | Test05   | Test05@gmail.com | Test05    | Test05 | Test05 |
    Then As a user validate registration is successful

