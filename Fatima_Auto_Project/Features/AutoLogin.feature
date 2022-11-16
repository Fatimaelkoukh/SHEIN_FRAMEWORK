Feature: Testing the login functionality and verifying the username
  

  
 Background: User can log in to Shein using the correct email and password
    Given : user open the browser
    And : User navigates to " www.Shein.com " 
    When  : User click on Sign in/ register button
    And: User enter the correct email in the email address field
    And : User enter the correct password in the password field
    And : User click on the sign in button 
    Then : User is successefully logged in and  the username is diplayed
    And : User is able to navigate in the home page including the Personal Center 



    Scenario: User is able to search the products

When User clicks on the Search Box and Searches for "grils outfit"
And User clicks on the Search Button
Then User can search for the "Girls outfit" items

Scenario: User is able to add the sellected ithem to the shopping bag
When User clicks on the desire item
Then User is able to see the discription of the item
And User choose the  size of the ithem
Then User clciks on  add to bag button



Scenario: User is able to click on the cart button 
When User clicks on the cart button
Then User is navigated to the Cart Page
Then I can validate user payment

