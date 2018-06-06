Feature: Free CRM Login Feature

#@test
#Without examples keyword 
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and User enters "test@123"
#Then user clicks on login button
#Then user is on homepage


#With Examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and User enters "<password>"
Then user clicks on login button
Then user is on homepage

Examples:

      | username | password | 
      | naveenk  | test@123 | 
      | tom      | test456  |
