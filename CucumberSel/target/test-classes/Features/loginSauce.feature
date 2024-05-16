Feature: To check Login Functionality
@smoke
Scenario: Check login is successful with valid credentials

Given user is on login page
When user enters username and password
And click on Login button
Then user should navigate home page

@regression
Scenario: Check login is successful with invalid credentials

Given user is on login page
When user enters username and password
And click on Login button
Then user should navigate home page

@regression @smoke
Scenario: Check login credentials

Given user is on login page
When user enters username and password
And click on Login button
Then user should navigate home page
#Examples:
#|username|password|
#|standard_user|secret_sauce|
#|problem_user|secret_sauce|