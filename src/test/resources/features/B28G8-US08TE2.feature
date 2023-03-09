@B28G8-144
Feature: Default

	Background:
		#@PRG17-130
		Given the user is on the login page
		

	#user should see an error message “This value should not be blank.” when the Calendar event repeat field is cleared(delete the number 1). 
	@B28G8-143
	Scenario: US08AC02TC02 user should see an error message “This value should not be blank.” when the Calendar event repeat field is cleared(delete the number 1). 
		Given the user logged in as "driver"
		    When User hovers over dropdown Activities and clicks button Calendar Events
		    And User clicks button Create Calendar Event
		    And User clicks checkbox Repeat
		    And User clears the field day(s)
		    Then User sees an error message "This value should not be blank."