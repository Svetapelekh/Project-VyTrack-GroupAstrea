@B28G8-150
Feature: Default

	Background:
		#@PRG17-130
		Given the user is on the login page
		

	#As a user, I want to filter customers' info on the Account page.  
	@B28G8-149
	Scenario: US12AC01TC01 As a user, I want to filter customers' info on the Account page.  
		Given the user logged in as "sales manager"
		    When the user hovers over Customers dropdown and clicks Accounts button
		    And the user turns on Filters
		    Then the user sees Expected filter names
		      #| Account name  |
		      #| Contact name  |
		      #| Contact email |
		      #| Contact phone |
		      #| Owner         |
		      #| Business Unit |
		      #| Created At    |
		      #| Updated At    |