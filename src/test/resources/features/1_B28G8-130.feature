Feature: Default

	Background:
		#@B28G8-130
		Given the user is on the login page
		
		

	#{color:#de350b}*User Story :*{color} As a user, I should be accessing all the main modules of the app.
	#
	#{color:#de350b}AC #2: {color}drivers should view 4 module names
	#Expected module names: Fleet, Customers, Activities, System
	@B28G8-131
	Scenario: US1AC2TC1 Verify Menu Options for Drivers
		Given the user logged in with username as "user1" and password as "UserUser123"
		      Then drivers sees below modules:
		        |Fleet|
		        |Customers|
		        |Activities|
		        |System|