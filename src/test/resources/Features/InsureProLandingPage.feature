Feature: InsurePro landing page feature

  Scenario: Verify the elements on the InsurePro landing page
    Given user is on insurepro landing page
    When user gets the title of the insurepro landing page
    When insurepro landing page title should be "Insurepro App"
    And insurepro landing page should contain "Continuar en español" link
    And insurepro landing page should contain "Get A Quote" button

  Scenario: Verify the Get A Quote button
    Given user is on insurepro landing page
    And click on the Get A Quote button
    Then user should navigate to the next page and title should be "First off, what's your name?"


