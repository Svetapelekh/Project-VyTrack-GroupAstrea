@B28G8-148
Feature: Default

	Background:
		#@B28G8-130
		Given the user is on the login page
		
		

	#{color:#de350b}{*}User Story{*}:  {color}As a user, I want to manage filters on the Marketing page. 
	#
	# 
	#
	#{color:#de350b}*AC #1:* {color}Store and sales managers should see all 5 filter options are checked by default. 
	#
	# 
	#
	#{color:#0747a6}*AC #2:* {color}any amount of boxes should be unchecked. (can check only 1, or multiple)
	@B28G8-146
	Scenario: US14AC1TC1 As a user, I want to manage filters on the Marketing page. 
		Given the user logged in with username as "storemanager100" and password as "UserUser123"
		    When manager navigate to "Marketing page"
		    And manager click on Manage filters button
		    Then see all filter options are checked by default	

	#{color:#de350b}{*}User Story{*}:  {color}As a user, I want to manage filters on the Marketing page. 
	#
	# 
	#
	#{color:#0747a6}*AC #1:* {color}Store and sales managers should see all 5 filter options are checked by default. 
	#
	# 
	#
	#{color:#de350b}*AC #2:* {color}any amount of boxes should be unchecked. (can check only 1, or multiple)
	@B28G8-147
	Scenario: US14AC2TC2 As a user, I want to manage filters on the Marketing page. 
		Given the user logged in with username as "storemanager100" and password as "UserUser123"
		    When manager navigate to "Marketing page"
		    And manager click on Manage filters button
		    Then any amount of boxes can be unchecked