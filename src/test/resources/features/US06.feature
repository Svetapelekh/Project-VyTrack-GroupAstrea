
@Melda
Feature: As a user, I want to see edit car info icons from the Vehicle page.


  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: verify that user see “view, edit, delete” when hovering the mouse over the 3 dots “…”
    Given the user logged in with username as "storemanager100" and password as "UserUser123"
    When  The user hover over Fleet module and seeing the dropdown list
    And   The user hover the mouse over the three dots “…”
    Then  The user see following icons
      | View   |
      | Edit   |
      | Delete |

  Scenario: verify that user see “view, edit, delete” when hovering the mouse over the 3 dots “…”
    Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    When  The user hover over Fleet module and seeing the dropdown list
    And   The user hover the mouse over the three dots “…”
    Then  The user see following icons
      | View   |
      | Edit   |
      | Delete |
