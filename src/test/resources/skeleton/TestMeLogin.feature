Feature: My validations of test me app



Scenario Outline: Login for testme App
Given Test me app is launched
Then user clicks on log in button
Then user enters valid username "<uname>"
Then user enters pssword "<pswrd>"
Examples:
		|uname|pswrd|
		|Lalitha|Password123|


Scenario: Search Validation in test me appp
Given user logged in into test me app
Then user search the products
Then user selects the product
Then add the product to cart
Then user purchases the product

Scenario:  when where user moves to cart without adding any item in it
Given user sign in into testme app
Then user tries to search the particular product like headphone
And try to proceed to payment without adding any item to cart
Then test me app does not display cart icon


 
 
