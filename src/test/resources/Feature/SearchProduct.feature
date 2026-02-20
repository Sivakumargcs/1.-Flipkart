Feature: Flipkart Product Search

Scenario: User searching mobiles on Homepage

Given User is on Flipkart home page
When User enters "Mobile" on Search box 
And User clicks the Search button
Then User should see results for "Mobile"
#Then Select minmum and maximum value
#Then Select Brand
#Then Select Ram
#Then Select battary
#Then Hover Kids
#Then CLick board Games

#Scenario Outline: TO vaidate multiple search entries

#Given Enter the "<Searchtext>" in the searchbox
#When click search box


#Examples:
#|Searchtext|
#|Watch|
#|Tv|


#Scenario: To validate upto add cart functionality

Given User can move to login link
When user clicks the flipkartplus zone
And hover the mouse on Furniture
And user clicks the Bedsheets
And Scroll down and selcte one particular result
And user enters the pincode and check the pincode
And user clicks the buy now



