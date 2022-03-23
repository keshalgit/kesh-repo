Feature: InsurePro Coverage Type page features

  Scenario: Verify the elements on the Jobs per month page
    Given user is on insurepro Coverage Type page
    When user gets the title of the insurepro Coverage Type page
    When insurepro Coverage Type title should be "InsurePro - Coverage Types"
    And insurepro Coverage Type page should contain "Continue" button

  Scenario: Verify the Continue button in the a Coverage Type page
    Given user is on insurepro Coverage Type page
    Then select the Coverage Type "General Liability"
    And click on the Continue button on the Coverage Type page
    Then user should navigate to the email page and title should be "InsurePro - Contact Information"