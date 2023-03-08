Feature: Vehicle models page (Web-table)
  Agile story: As a user, I want to view columns on the Vehicle models page. (web-table)

  Background: User is already in the log in page
    Given the user is on the login page

#  Scenario: Verify login with different user types
#    #Given the user logged in as "<userType>"

  Scenario:  The store manager and sales manager should see 10 columns on the Vehicle Model page.

    Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    When user navigate to "Vehicles Model"


    Then user see below column names on the Vehicle Model page
      |MODEL NAME|
      |MAKE|
      |CAN BE REQUESTED|
      |CVVI|
      |CO2 FEE (/MONTH)|
      |COST (DEPRECIATED)|
      |TOTAL COST (DEPRECIATED)|
      |CO2 EMISSIONS|
      |FUEL TYPE|
      |VENDORS|

  Scenario: Drivers should not able to access the Vehicle Model page,
  users should see "You do not have permission to perform this action."
    Given the user logged in with username as "user1" and password as "UserUser123"
    When user navigate to "Vehicles Model"
    Then user see "You do not have permission to perform this action." message
