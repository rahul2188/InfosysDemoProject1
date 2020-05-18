Feature: Ordering product online

Scenario: Order online product and then signout at shipping stage

Given user is on homepage
When user logs in using valid credentials and makes an order
And user summarize the order till shipping section
Then user signout and close the browser