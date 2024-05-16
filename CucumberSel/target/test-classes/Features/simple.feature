Feature: To add item in cart Functionality

Scenario: To check itemis added into wishlist 

Given user is on home page
When click on wishlist button on the top frame
And User should click the new customer registered account
And user enters first name and last name and Email and Telephone and Password and Confirm Password
And user select the privacy policy
And user click on continue button
And user click on success continue button
And user click on your store logo
And user select the item
And user click wishlist symbol in the item
Then user click on wishlist button again


Scenario: To check item is added into wishlist by returning customer

Given user is on home page
When click on wishlist button on the top frame
And User should click the returning customer
And user should give registered email and password
And user click continue
Then user enters first name and last name and Email and Telephone and Password and Confirm Password