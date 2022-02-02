Feature: Datarock page feature

  @Smoke
  Scenario: Verify the elements on the datarock page-xxxxxxx
    Given user is on datarock page
    When user gets the title of the insurepro datarock page
    When datarock page title should be "DataRock"
    And datarock page should contain "Identity information" field
    And datarock page should contain "Grant Access" button
    Then datarock page should contain "Deny access" link