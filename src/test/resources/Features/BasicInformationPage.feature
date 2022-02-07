Feature: Basic Information page feature

  @Smoke
  Scenario: Verify the elements on the Basic Information page-xxxxxxx
    Given user is on Basic Information page
    When Basic Information page title should be "Basic Information"
    And Basic Information page should contain back button
    And Basic Information page should contain QandA button
    And Basic Information page should contain Full Legal Name field
    And Basic Information page should contain Email field
    And Basic Information page should contain Phone Number field
    And Basic Information page should contain dob Year field
    And Basic Information page should contain dob Month field
    And Basic Information page should contain dob Date field
    And Basic Information page should contain Social Security Number field
    And Basic Information page should contain gender Male button
    And Basic Information page should contain gender female button
    And Basic Information page should contain address field
    And Basic Information page should contain address AptNo field
    And Basic Information page should contain address StateCode field
    And Basic Information page should contain address Zip field
    Then Basic Information page should contain Continue To Company Info button

  Scenario: Verify the functionality of the Back button on the Basic Information page-xxxxxxx
    Given user is on Basic Information page
    Then Click on the Back button on Basic Information page
    Then user should navigate to the next page from Basic Information page and title should be "General Liability"