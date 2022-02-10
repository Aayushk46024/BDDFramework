Feature: Checking the search add user functionality in the application
  Scenario: Check the search add user functionality with required detail
    Given user is on Login page
    When user is logging successfully and goto homepage page
    And user is click on Admin button
    And user enters Username in the Username text field for search
    And user selects the user as per the enter name
    And user clicks on the Delete button
    Then user is successfully Deleted
