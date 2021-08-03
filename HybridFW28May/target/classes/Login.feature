Feature: Login feature
Scenario Outline: negative login feature
Given user is on login page
When user enters "<un>" & "<pw>"
And user clicks on submit
Then user is on same page
Examples:
|un|pw|
|rincy|rincy|
|admin|admin|
|Hello|hello|