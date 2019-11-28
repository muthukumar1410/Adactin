Feature: Testing the Automation practice website functionality 

Scenario: Accessing the website and verifying the order 

	Given User enter the url 
	When User enters the username 
	Then User enters the password 
	And User click on login page 
	And User logouts from website 
	And User quit the browser 
	
	
Scenario: Accessing the website and verifying the order with data

	Given  User enter the url 
	When User enters the username "muthu@gmail.com" 
	Then User enter password "123456789" 
	And User click on login page 
	And User logouts from website 
	And User quit the browser 
	
Scenario Outline: : Accessing the website and verifying the order with example 

	Given User enter thr url 
	When User enters the username "<username>" in the field 
	Then User enters the password "<password>" in the field 
	And User click on login page 
	And User logouts from website 
	And User quit the browser 
	
	Examples: 
		|username                        |password|
		|xFrkvfh@gmail.com               |Da@15   |
		|Sriniautomation@gmail.com       |987654321|
		
		
		
		
