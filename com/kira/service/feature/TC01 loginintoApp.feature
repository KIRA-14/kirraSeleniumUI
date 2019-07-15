Feature: login in to application.

Scenario: login in to application with browser 

		Given open the browser and launch application
		|Broser|UTL|
		|Chrome|https://www.redbus.in/|
		Then give user name and password
		|Username|passwoerd|
		|demouser|Demopasswored|