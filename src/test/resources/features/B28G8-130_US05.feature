@B28G8-140
Feature: Default

	Background:
		#@B28G8-130
		Given the user is on the login page
		
		

	#{color:#de350b}{*}User Story{*}:  {color}As a user, I want to view columns on the Vehicle models page. (web-table)
	#
	# 
	#
	#{color:#de350b}*AC #1:* ** {color}The store manager and sales *manager* should *see* 10 columns on the Vehicle Model page.
	#
	#*_Expected Column names:_*
	#
	#   **   MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (/MONTH), COST (DEPRECIATED), TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS
	#
	#{color:#de350b}{color:#0747a6}*AC #2:*{color} {color}Drivers should not able to access the Vehicle Model page, users should see “You do not have permission to perform this action.” 
	@B28G8-138
	Scenario: US5AC1TC1 The store manager and sales manager should see 10 columns on the Vehicle Model page.
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

	#{color:#de350b}{*}User Story{*}:  {color}As a user, I want to view columns on the Vehicle models page. (web-table)
	#
	# 
	#
	#{color:#de350b}{color:#0747a6}*AC #1:* **{color} {color}The store manager and sales *manager* should *see* 10 columns on the Vehicle Model page.
	#
	#*_Expected Column names:_*
	#
	#   **   MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (/MONTH), COST (DEPRECIATED), TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS
	#
	#{color:#de350b}*AC #2:* {color}Drivers should not able to access the Vehicle Model page, users should see “You do not have permission to perform this action.” 
	@B28G8-139
	Scenario: US5AC2TC2 Drivers should not able to access the Vehicle Model page,   users should see "You do not have permission to perform this action."
		Given the user logged in with username as "user1" and password as "UserUser123"
		    When user navigate to "Vehicles Model"
		    Then user see "You do not have permission to perform this action." message