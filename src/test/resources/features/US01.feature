Feature:As a user, I should be accessing all the main modules of the app

  Background: User is already in the log in page
    Given the user is on the login page

 # Scenario: Verify login with different user types
    #Given the user logged in as "<userType>"
    #Given the user logged in with username as "user1" and password as "UserUser123"

    Scenario: US1AC1TC1 Verify store managers should view 8 module names
      Given the user logged in with username as "storemanager51" and password as "UserUser123"
      Then store managers sees below modules:
      |Dashboards|
      |Fleet|
      |Customers|
      |Sales    |
      |Activities|
      |Marketing |
      |Reports & Segments|
      |System|

  Scenario: US1AC1TC2 Verify sales managers should view 8 module names
    Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    Then sales managers sees below modules:
      |Dashboards|
      |Fleet|
      |Customers|
      |Sales    |
      |Activities|
      |Marketing |
      |Reports & Segments|
      |System|

    Scenario: US1AC1TC2 Verify drivers should view 4 module names
      Given the user logged in with username as "user1" and password as "UserUser123"
      Then drivers sees below modules:
        |Fleet|
        |Customers|
        |Activities|
        |System|
