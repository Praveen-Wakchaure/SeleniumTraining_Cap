@register
Feature: To check registration



@positive
Scenario: Positive registration scenario
Given user is on registration page
When user enters details
|username|rincy|
|password|rincy|
|cpassword|rincy|
|mob|123456789|
|comp|cg|
And user clicks on submit btn
Then user is successfully registered
    
 