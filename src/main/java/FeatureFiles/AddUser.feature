Feature: Checking the Add user functionality in the application
  Scenario: Check Add user functionality with required detail
    Given user is on Login page
    When user is logging successfully and goto homepage page
    And user is click on Admin button
    And user is click on Add button
    And user selects the User Role
    And user selects the Employee Name
    And user enters username in the username text field
    And user selects the Status
    And user enters Password in the password text field
    And user enters Confirm Password in the confirm password text field
    And user clicks on the SAVE button
    Then user successfully added the user