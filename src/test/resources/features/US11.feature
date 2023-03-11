@Melda11
Feature: As a user, I want to view car odometer info on the Vehicles Odometers page.


  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: verify that users Store and Sales managers should see an error message
    Given the user logged in with username as "storemanager100" and password as "UserUser123"
    When  the user navigates to "Fleet" - "Vehicles Odometers"
    And   when user on “Vehicle Odometer” module see "You do not have permission to perform this action."

  Scenario: verify user as Drivers should see the default page as 1.
    Given the user logged in with username as "user1" and password as "UserUser123"
    When  the user navigates to "Fleet" - "Vehicles Odometers"
    And   when user on “Vehicle Odometer” module see the default page as "1".

  Scenario: verify user as Drivers should see the View Per Page is 25 by default.
    Given the user logged in with username as "user1" and password as "UserUser123"
    When  the user navigates to "Fleet" - "Vehicles Odometers"
    And   when user on “Vehicle Odometer” module see the View Per Page is "25" by default.

