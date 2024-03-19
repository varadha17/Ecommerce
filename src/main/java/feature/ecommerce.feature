Feature: Validate Login Page

@smoke
Scenario: Validate username entered or not
Given user landed into amazon website and clicks signIn
Then user enters username for amazon
Then user opens new tab and navigate to flipkart website and clicks signIn
Then user enters username for flipkart
Then user opens new tab and navigate to google website
And user enters text in search box
And user validates username for flipkart tab