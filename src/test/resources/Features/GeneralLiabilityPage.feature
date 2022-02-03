Feature: General Liability page feature

  @Smoke
  Scenario: Verify the elements on the General Liability page-xxxxxxx
    Given user is on General Liability page
    When General Liability page title should be "General Liability"
    And General Liability page should contain below insurance types
      | Per Job                       |
      | Monthly                       |
      | Annually                      |
      | I Already Have this Insurance |
    And General Liability page should contain "Continue" button

  Scenario: Verify the functionality of the Back button on the General Liability page-xxxxxxx
    Given user is on General Liability page
    Then Click on the Back button
    Then user should navigate to the next page from General Liability page and title should be "Build Your Plan"

  Scenario: Verify the functionality of the Continue button on the General Liability page if any Insurance plan not selected-xxxxxxx
    Given user is on General Liability page
    Then click on the Continue button
    When continue button should stay disabled

  Scenario: Verify the Per Job insurance plan selection-xxxxxxx
    Given user is on General Liability page
    Then select the insurance plan Per Job option
    When click on the Continue button
    Then user should navigate to the next page from General Liability page and title should be "Basic information"

  Scenario: Verify the Monthly insurance plan selection-xxxxxxx
    Given user is on General Liability page
    Then select the insurance plan Monthly option
    When click on the Continue button
    Then user should navigate to the next page from General Liability page and title should be "Basic information"

  Scenario: Verify the Annually insurance plan selection-xxxxxxx
    Given user is on General Liability page
    Then select the insurance plan Annually option
    When click on the Continue button
    Then user should navigate to the next page from General Liability page and title should be "Basic information"

  Scenario: Verify the I Already Have this Insurance selection-xxxxxxx
    Given user is on General Liability page
    Then select the insurance plan I Already Have this Insurance option
    When click on the Continue button
    Then user should navigate to the next page from General Liability page and title should be "Insurance Verification"