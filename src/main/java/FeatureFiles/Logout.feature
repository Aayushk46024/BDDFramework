Feature: Checking Logout functionality of the application
  Scenario: Checking the Logout functionality
    Given user is on Login page
    And user enters username in the username textfield
    And user enters password in the password textfield
    And user clicks on the Login button
    And user is click on Welcome user button
    Then user clicks on the Logout button
