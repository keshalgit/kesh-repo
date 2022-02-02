Feature: Datarock page feature

  @Smoke
  Scenario: Verify the elements on the datarock page-xxxxxxx
    Given user is on datarock page
    When datarock page title should be "DataRock"
    And datarock page should contain "Grant Access" button
    Then datarock page should contain "Deny access" link

  Scenario: Verify the functionality of the Grant Access button-xxxxxxxxxxxxx
    Given user is on datarock page
    When Click on the Grant Access button
    Then user should navigate to the next page from datarock page and title should be "Build Your Plan"

  Scenario: Verify the functionality of the Deny access link-xxxxxxxxxxx
    Given user is on datarock page
    When Click on the Deny access link
    Then user should navigate to the next page from datarock page and title should be "InsurePro"
