Feature: Checking Login functionality of the application
  Scenario: Checking Login functionality with the valid login credentials
    Given user is on Login page
    And user enters username in the username textfield
    And user enters password in the password textfield
    When user clicks on the Login button
    Then user is on Homepage