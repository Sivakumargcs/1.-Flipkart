Feature: Flipkart Product Search

Scenario: User searching mobiles on Homepage

Given User is on Flipkart home page
When User enters "Mobile" on Search box 
And User clicks the Search button
Then User should see results for "Mobile"
Then Select minmum and maximum value
Then Select Brand
Then Select Ram
Then Select battary
Then Hover Kids
Then CLick board Games


