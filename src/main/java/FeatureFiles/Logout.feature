Feature: Checking Logout functionality of the application
  Scenario: Checking the Logout functionality
    Given user is on Login page
    When user is logging successfully and goto homepage page
    And user is click on Welcome user button
    Then user clicks on the Logout button
