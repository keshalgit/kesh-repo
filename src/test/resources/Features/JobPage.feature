Feature: InsurePro Zip Code page features

  Scenario: Verify the elements on the Jobs page
    Given user is on insurepro job page
    When user gets the title of the insurepro job page
    When insurepro job title should be "InsurePro - Job"
    And insurepro job page should contain "Continue" button

  Scenario: Verify the Continue button in the a Job type
    Given user is on insurepro job page
    Then select the job type "House Cleaning"
    And click on the Continue button on job page
    Then user should navigate to the jobs per month page and title should be "InsurePro - Jobs Per Month"