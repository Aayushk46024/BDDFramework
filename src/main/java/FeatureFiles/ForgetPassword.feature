Feature: Check the ForgetPassword functionality of the application
  Scenario: Checking the ForgetPassword functionality click on the link
    Given user is on Login page
    When user clicks on the forget password link
    Then user is redirecting to the ForgetPassword page
