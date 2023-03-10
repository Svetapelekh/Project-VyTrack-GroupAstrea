@B28G8-144
Feature: Default

	Background:
		#@PRG17-130
		Given the user is on the login page
		

	#User should see the number "1" by default in the Repeat Every input. 
	@B28G8-142
	Scenario: US08AC01TC01 user should see the number "1" by default in the Repeat Every input. 
		Given the user logged in as "driver"
		    When User hovers over dropdown Activities and clicks button Calendar Events
		    And User clicks button Create Calendar Event
		    And User clicks checkbox Repeat
		    Then User should see the number 1 by default in the Repeat Every input.