Feature: Validate Login Page

Scenario: Validate username and password
Given user enters valid username and valid password
|standard_user|secret_sauce|
Then click on sigin button
And user should be landed into products page