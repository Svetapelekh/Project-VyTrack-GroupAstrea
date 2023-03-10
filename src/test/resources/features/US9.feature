@wip
Feature: As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.

  Background: User is already in the log in page
    Given the user is on the login page


  #Scenario: Verify login with different user types
    #Given the user logged in as "<userType>"
   # Given the user logged in with username as "user1" and password as "UserUser123"

  Scenario: US9AC1TC1 Verify users see error messages if entering invalid integers that less than 1.
    Given the user logged in as "sales manager"
    When  the user navigate to "Activities" tab and click on the "Calender Events"
    Then the user click on the "Create Calender Event"
    And  the user click at "RepeatCheckBox"
    Then  the user enter "134" inside the box
    And  the user see error message1 "The value have not to be more than 99."


  Scenario: US9AC1TC2 Verify users see error messages if entering invalid integers that more  than 99.
    Given the user logged in with username as "user1" and password as "UserUser123"
    When  the user navigate to "Activities" tab and click on the "Calender Events"
    Then  the user click on the "Create Calender Event"
    And  the user click at "RepeatCheckBox"
    Then  the user enter "-2" inside the box
    And  the user see error message2 "The value have not to be less than 1."