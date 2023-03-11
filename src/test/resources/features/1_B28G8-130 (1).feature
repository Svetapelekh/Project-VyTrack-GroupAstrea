Feature: Default

	Background:
		#@B28G8-130
		Given the user is on the login page
		
		

	#{color:#de350b}*User Story :*{color} As a user, I should be accessing all the main modules of the app.
	#
	#{color:#de350b}AC #1: {color}Store and sales managers should view 8 module names.
	#Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System
	@B28G8-137
	Scenario: US1AC1TC2 Verify menu options for sales managers 
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