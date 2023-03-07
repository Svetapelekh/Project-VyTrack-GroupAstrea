@wip
Feature: As a user, I want to learn how to use the pinbar.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify login with different user types
    #Given the user logged in as "<userType>"
    Given the user logged in with username as "user1" and password as "UserUser123"


  Scenario: US3AC1TC1 Verify that user could use the pinbar.
    Given the user logged in with username as "user1" and password as "UserUser123"
    When the user click on "Learn how to use this space" on the homepage
    Then the user should see header "How To Use Pinbar"
    And  the user should see "Use the pin icon on the right top corner of the page to create fast access link in the pinbar."

  Scenario: US3 AC2TC1 Verify that user see an image on the page
    Given the user logged in with username as "user1" and password as "UserUser123"
    When the user click on "Learn how to use this space" on the homepage
    Then the user should see image "bundles/oronavigation/images/pinbar-location.jpg"