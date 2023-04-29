Feature: To validate the entire sauce demo application 

Scenario: To move the product to add to cart 

	Given The user should be in required url 
	And The user should login the application 
	When User move a product to cart 
	
	
Scenario: User view cart page and move the product to checkout 

	When User to enter cart 
	When The user proceeds to checkout 
	
	
Scenario: User to provide general datas for checkout 

	When The user should give first name 
	And The user should give last name 
	And The user should give postal code 
	And The user click continue 
	
	
Scenario: To finalise the purchase 

	When The user click the finish button 
	Then The user recieves the success message 
	
