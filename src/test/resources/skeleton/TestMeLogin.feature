Feature: My validations of test me app
#Scenario Outline: Registration validations for multiple users in testme app
#Given Testme is launched by the user
#When user clicks on signon the Registration form is displayed
#Then user enters the username "<username>"
#Then user enters the firstname "<fname>"
#Then user enters the lastname "<lname>"
#Then user enters the password "<password>"
#Then user confirms the password "<confirmpassword>"
#Then user selects the gender
#Then user enters the email "<email>"
#Then user enters the mobilenumber "<mob>"
#Then user enters date of birth "<birth>"
#Then user enters address "<address>"
#Then user selects security question
#Then user answers the security question
#Then user clicks on submit button
#Examples:
#|username|fname|lname|password|confirmpassword|email|mob|birth|address|
#|Priya1|priyaa|Roy|@@abcd1234|@@abcd1234|sseee@gmail.com|8421879634|20/10/2010|nalasupara|
#|Lily11|ritu|KOy|@@abcd4567|@@abcd4567|ddeee@yahoo.com|81493704578|12/11/2011|mulukall|

@Smoke
Scenario Outline: Login for testme App
Given Test me app is launched
Then user clicks on log in button
Then user enters valid username "<uname>"
Then user enters pssword "<pswrd>"
Examples:
		|uname|pswrd|
		|Lalitha|Password123|

@Smoke
Scenario: Search Validation in test me appp
Given user logged in into test me app
Then user search the products
Then user selects the product
Then add the product to cart
Then user purchases the product
@Smoke
Scenario:  when where user moves to cart without adding any item in it
Given user sign in into testme app
Then user tries to search the particular product like headphone
And try to proceed to payment without adding any item to cart
Then test me app does not display cart icon


 
 
