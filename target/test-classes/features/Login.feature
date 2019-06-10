Feature: Application Login


Scenario: Home page default login
Given User in on landing page
When User log into application with username "abcde" and password "12345"
Then Home page is populated
And Cards "are" displayed

Scenario: Home page default login
Given User in on landing page
When User log into application with username "edcba" and password "54321"
Then Home page is populated
And Cards "are not" displayed