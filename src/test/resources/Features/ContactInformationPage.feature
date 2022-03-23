Feature: InsurePro Contact Information page features

  Scenario: Verify the elements on the Contact Information page
    Given user is on insurepro Contact Information page
    When user gets the title of the insurepro Contact Information page
    When insurepro Contact Information title should be "InsurePro - Contact Information"
    And insurepro Contact Information page should contain "Continue" button

#  Scenario: Verify the Continue button in the a Contact Information page with valid details
#    Given user is on insurepro Contact Information page
#    Then user inserts an email address "qa@autotest.com"
#    And user inserts a phone number "0774190017"
#    And click on the Continue button on the Contact Information page
#    Then user should navigate to the general overview page and title should be "InsurePro - Let’s Build Your Plan"