
@Test2
Feature: Capital Markets Page
  
  
  Scenario Outline: Verify the Capital Markets Page
    Given navigate to home page of application
    And verify the Home page Title
    Then Click on the Industries dropdown
    And Select the CapitalMarket Page
    Then Verify the Header Text of the page
    And Click learnmore link
    Then Enter the "<name>" in name field 
    And Fill the "<Email>" in the Email field
    Then Enter the "<PhoneNumber>" in the phoneNumber field
    And Fill the "<CompanyName>" in the Company field
    Then Enter the "<Message>" in the Message field
    And Click the submit button
    Then Close the Browser
    
    Examples: 
      | name  | Email        |PhoneNumber|CompanyName|Message     |
      | Test11  |Test12@gmail.com|7845215487 |UBTIINC1    |Test Message1|
  