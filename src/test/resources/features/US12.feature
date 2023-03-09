@US12
Feature: As a user, I want to filter customers’ info on the Account page.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: US12AC01TC01 users should see 8 filter items on the Accounts page
    Given the user logged in as "sales manager"
    When the user hovers over Customers dropdown and clicks Accounts button
    And the user turns on Filters
    Then the user sees Expected filter names
      #| Account name  |
      #| Contact name  |
      #| Contact email |
      #| Contact phone |
      #| Owner         |
      #| Business Unit |
      #| Created At    |
      #| Updated At    |
