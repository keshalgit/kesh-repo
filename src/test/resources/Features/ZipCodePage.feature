Feature: InsurePro Zip Code page features

  Scenario: Verify the elements on the Zip Code page
    Given user is on insurepro zipcode page
    When user gets the title of the insurepro zipcode page
    When insurepro zipcode title should be "InsurePro - Zip code"
    And insurepro zipcode page should contain "Continue" button

  Scenario: Verify the Continue button the with a Texas Zipcode
    Given user is on insurepro zipcode page
    Then enter the zipcode "78732"
    And click on the Continue button on zipcode page
    Then user should navigate to the job page and title should be "InsurePro - Job"

  Scenario: Verify the Continue button the with a Florida Zipcode
    Given user is on insurepro zipcode page
    Then enter the zipcode "33213"
    And click on the Continue button on zipcode page
    Then user should navigate to the job page and title should be "InsurePro - Job"

  Scenario: Verify the Continue button the with a invalid Zipcode
    Given user is on insurepro zipcode page
    Then enter the zipcode "12345"
    And click on the Continue button on zipcode page
    Then user should navigate to the working on it page and title should be "InsurePro - We are working on it"