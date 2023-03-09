@US08
Feature: As a user, I want to create a recurring(repetitive) calendar event.

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in as "driver"

  Scenario: US08AC01TC01 User should see the number “1” by default in the Repeat Every input.
    Given User hovers over dropdown Activities and clicks button Calendar Events
    When User clicks button Create Calendar Event
    And User clicks checkbox Repeat
    Then User should see the number 1 by default in the Repeat Every input.

  Scenario: US08AC02TC02 user should see an error message “This value should not be blank.”
  when the Calendar event repeat field is cleared(delete the number 1).
    Given User hovers over dropdown Activities and clicks button Calendar Events
    When User clicks button Create Calendar Event
    And User clicks checkbox Repeat
    And User clears the field day(s)
    Then User sees an error message "This value should not be blank."