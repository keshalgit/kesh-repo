
Feature: Test Execution - Forgot Password Page

@Smoke
  Scenario: User should be able to access the forgot password page
    Given user is on loginpage
    When clicks on the forgot password link
    Then user should navigate to the forgotpw page and the title should be "ForgotPassword"


  Scenario: User should be able to send the password reset code
    Given user is on loginpage
    When enter username for forget password scenario username"kgulawita"
    When clicks send verification button
    Then user should navigate to the forgot password complete page and the title should be "ForgotPasswordComplete"
