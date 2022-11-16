Feature: Search items in application

Background: User can log in to Shein using the correct email and password
    Given : user open the browser
    And : User navigates to " www.Shein.com " 
    When  : User click on Sign in/ register button
    And: User enter the correct email in the email address field
    And : User enter the correct password in the password field
    And : User click on the sign in button 
    Then : User is successefully logged in and  the username is diplayed
    And : User is able to navigate in the home page including the Personal Center 

Scenario: User is able to search for an item using the search box

When User enters the keywords "grils outfit" 
And The user clicks on the Search button
And The user clicks on the item
Then The user is navigated to the "grils outfit" section

