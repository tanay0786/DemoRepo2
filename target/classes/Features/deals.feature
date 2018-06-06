Feature: Deal data creation

Scenario: Free CRM Create a new deal Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and User enters password
| naveenk | test@123 |

Then user clicks on login button
Then user is on homepage
Then user move to the new deal page
Then user enters deal details
| test deal | 1000 | 50 | 10 |