
@iframe
Feature:As a user, I want to write the “Description” when I create a calendar event.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US10AC1TC1 Verify that user should able to write massage in the description field.
    Given the user logged in as "store manager"
    When  the user navigate to the "Activities" tab and click on the "Calender Events"
    Then the user click on the "Create Calender Event" button
    And  the user check the "Repeat" box
    Then the user should be able to type message inside the "Description" box
    And the message should be displayed "Scrum daily meeting"