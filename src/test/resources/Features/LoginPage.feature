Feature: Login page feature

  @Smoke
  Scenario: Login page title-48671876
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Swag Labs"

  Scenario: Login with valid username and password-48671877
    Given user is on login page
    Then user enter the username as "standard_user"
    When user enter the password as "secret_sauce"
    Then user clicks on the sign in button
    When user checks the page title is "Swag Labss"
