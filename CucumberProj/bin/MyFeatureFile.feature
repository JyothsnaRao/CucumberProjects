Feature: Cucumber Example
In order to Automate the web-site
As a Tester
I want to Develop the automation script

Scenario Outline: Validate

Given Browser navigated to "<app>" login page
When I Entered Valid userName, Password and click login button
Then "<app>" home page should launch

Given Browser navigated to "<app>" login page
When I Entered In-Valid userName, Password and click login button
Then Should through Error Message

Examples:
 |   app    |
 | Facebook |
 | Gmail    |
 | LinkedIn |