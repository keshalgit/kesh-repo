@IM-601
Feature: Test Execution - Sample

  @TEST_IM-598 @TestCase
  Scenario: Verify the elements on the InsurePro landing page
    Given user is on insurepro landing page
    When user gets the title of the insurepro landing page
    When insurepro landing page title should be "Propdata"



  @TEST_IM-599 @TestCase
    Scenario: User should be able to login with valid credentials
      Given user is on insurepro landing page
      When the user enters a valid credentials username"resprop" password"resprop"
      When click on the login button
      When user should navigate to the next page and title should be "Properties"

  @TEST_IM-600 @TestCase
     Scenario: User should not be able to login with invalid credentials
     Given  user is on insurepro landing page
     When the user enters a valid credentials username"name" password"name"
     When click on the login button
     When user gets title of the validation message
     Then login failed validation text should be "Unauthorized"
