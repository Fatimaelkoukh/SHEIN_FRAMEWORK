Feature: Testing the registration functionality

 Background: User should be able to register to make a purchase
 
    Given : user open the browser
    And : User navigates to " www.Shein.com " 
    When  : User click on Sign in/ register button
    Then : User be able to select the location
    And: User enter a valid email  in the email field
    And : User enter a valid password in the password field
    And : User confirm  the valid password in the confirm password's field
    And : User check the Style preference
    And : User check the aggreement of the registration
    And : User click on the register button 
    Then : A message displyed "Congratulations! You have successfully registered!" 
    And : User is able to sing in 
    
    
  



#Multi Select
Scenario: User can perform Multi Select

When User clicks on Monday and Tuesday selection
Then Monday and Tuesday are selected

#Check Boxes
Scenario: User can click on the checkboxes
When User clicks on Morning and Afternoon checkboxes
Then Morning and Afternoon checkboxes are selected
And Evening checkbox is not selected

#Window handling
Scenario: User can open a new tab window and switch
When User opens a new tab window
Then User switches to the new tab window and close and switch back to the old tab

    