@wip
Feature: As a user, I want to access to Vehicle contracts page
  Accounts: store manager, sales manager

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: US4AC1TC1 Verify that Sales managers access the Vehicle contracts page.
    Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    Then the user hovers over "<Fleet>" module and clicks on "<Vehicle Contracts>"
    Then the sales manager should be able to see expected URL
    Then the user should be able to see expected title

  Scenario: US4AC1TC2 Verify that Store managers access the Vehicle contracts page.
    Given the user logged in with username as "storemanager51" and password as "UserUser123"
    Then the user hovers over "<Fleet>" module and clicks on "<Vehicle Contracts>"
    Then the store manager should be able to see expected URL
    Then the user should be able to see expected title

  Scenario: US4AC2TC1 Verify that Drivers should NOT able to access the Vehicle contracts page,
  the app should display “You do not have permission to perform this action.”
    Given the user logged in with username as "user1" and password as "UserUser123"
    Then the user hovers over "<Fleet>" module and clicks on "<Vehicle Contracts>"
    Then the user should see “You do not have permission to perform this action.”






