Feature: testing classes

Scenario: testing water marbling class
	Given user is on the home page
	When user hovers over classes menu on top navigation bar
	Then user hovers over art
	And clicks on Ebru – Water Marbling Classes
	Then clicks on select a date
	Then user selects random date
	Then user clicks on Ticket button
	And user selects 3 regular tickets
	And user should see total price as "USD $210.00"