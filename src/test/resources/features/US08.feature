@US08
Feature: As a user, I want to create a recurring(repetitive) calendar event.

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in as "driver"

  Scenario: US08TC01 User should see the number “1” by default in the Repeat Every input.
    Given User hovers over dropdown Activities and clicks button Calendar Events
    When User clicks button Create Calendar Event
    And User clicks checkbox Repeat
    Then User should see the number 1 by default in the Repeat Every input.