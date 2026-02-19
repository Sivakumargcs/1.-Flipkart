Feature: Flipkart Product Search

Scenario: User searching mobiles on Homepage

Given User is on Flipkart home page
When User enters "Mobile" on Search box 
And User clicks the Search button
Then User should see results for "Mobile"
When User fliters the Apple in Brand
Then User clicks the Apple iphone 
Then User Clciks the Buy now
Then User enters mobile number
Then User Clciks the Continue
Then User Clciks the Verify


