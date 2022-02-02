Feature: InsurePro landing page feature

  @Smoke
  Scenario: Verify the elements on the InsurePro landing page-xxxxxxx
    Given user is on insurepro landing page
    When user gets the title of the insurepro landing page page
    When insurepro landing page title should be "InsurePro"
    And insurepro landing page should contain "swapable" panel
    And insurepro landing page should contain "Become Complaint" button

  Scenario: Verify the Swap banner panel-xxxxxxxx
    Given user is on insurepro landing page
    Then swap the panel to left side it should display "Get Insurance Coverage"
    And swap the panel to right side it should display "Insurance Verification"

  Scenario: Verify the Become Compliant button-xxxxxxxxxx
    Given user is on insurepro landing page
    And click on the Become Compliant button
    Then user should navigate to the next page and title should be "Datarock"


