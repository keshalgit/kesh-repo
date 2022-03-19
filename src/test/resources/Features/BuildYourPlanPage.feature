Feature: Build Your Plan page feature

  @Smoke
  Scenario: Verify the elements on the Build Your Plan page
    Given user is on Build Your Plan page
    When Build Your Plan page title should be "Build Your Plan"
    And Build Your Plan page should contain "Continue" button

  Scenario: Verify the functionality of the Continue button
    Given user is on Build Your Plan page
    When Click on the Continue button
    Then user should navigate to the next page from Build Your Plan page and title should be "General Liability"