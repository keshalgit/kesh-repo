Feature: InsurePro Full Name page feature

  Scenario: Verify the elements on the Full Name page
    Given user is on insurepro full name page
    When user gets the title of the insurepro fullname page
    When insurepro fullname title should be "InsurePro - Name"
    And insurepro fullname page should contain "Continue" button

  Scenario: Verify the Continue button the Full Name page
    Given user is on insurepro full name page
    Then enter the full name "Ross Galler"
    And click on the Continue button button
    Then user should navigate to the zipcode page and title should be "InsurePro - Zip code"