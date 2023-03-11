Feature: Default

	#User Story :  As a user, I want to access to Vehicle contracts page
	#
	#AC1: Store managers and Sales managers access the Vehicle contracts page.
	#
	#Expected URL: ** http://qa.xfleetsolutions.com/entity/Extend_Entity_VehicleContract
	#
	#Expected title: All - Vehicle Contract - Entities - System - Car - Entities - System
	#
	#AC2: ** Drivers should NOT able to access the Vehicle contracts page, the app should display “You do not have permission to perform this action.”
	@B28G8-156
	Scenario: US4AC1TC1 Verify that Sales managers access the Vehicle contracts page.
		Given the user logged in with username as "salesmanager101" and password as "UserUser123"
		    Then the user hovers over "<Fleet>" module and clicks on "<Vehicle Contracts>"
		    Then the sales manager should be able to see expected URL
		    Then the user should be able to see expected title