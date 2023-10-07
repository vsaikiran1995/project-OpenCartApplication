Feature: Verify login functionality  
  @Sanity
  Scenario: Login Test with Registered User
    Given As a user I will Navigate to Registration URL "https://naveenautomationlabs.com/opencart/"
    When As a user I will enter UserName as "Test05@gmail.com" and Password as "Test05"
    Then As a user validate login is successfull
  
  Scenario: Login Test with invalid credentials
  Given As a user I will Navigate to Registration URL "https://naveenautomationlabs.com/opencart/"
    When As a user I will enter UserName as "test" and Password as "test"
    Then As a user validate login is unsuccessfull