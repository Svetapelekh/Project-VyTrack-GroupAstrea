@B28G8-152
Feature: Default

	Background:
		#@B28G8-130
		Given the user is on the login page
		
		

	#{color:#de350b}*User Story* :{color}  As a user, I want to see edit car info icons from the Vehicle page.
	#
	# 
	#
	#{color:#de350b}*AC #1:*  {color}users should see “{*}view, edit, delete{*}” when they hover the mouse
	#over the 3 dots “…” 
	@B28G8-151
	Scenario: US06AC1TC1 Verify store manager and sales manager see edit car info icons from the Vehicle page.
		Given the user logged in with username as "storemanager100" and password as "UserUser123"
		    When  The user hover over Fleet module and seeing the dropdown list
		    And   The user hover the mouse over the three dots “…”
		    Then  The user see following icons
		      | View   |
		      | Edit   |
		      | Delete |