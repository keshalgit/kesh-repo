Feature: InsurePro Jobs per month page features

  Scenario: Verify the elements on the Jobs per month page
    Given user is on insurepro jobs per month page
    When user gets the title of the insurepro jobs per month page
    When insurepro jobs per month title should be "InsurePro - Jobs Per Month"
    And insurepro jobs per month page should contain "Continue" button

  Scenario: Verify the Continue button in the a jobs per month
    Given user is on insurepro jobs per month page
    Then select the job rate "Less than 10"
    And click on the Continue button on the jobs per month page
    Then user should navigate to the coverage select page and title should be "InsurePro - Coverage Types"