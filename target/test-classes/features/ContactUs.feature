@Test
Feature: Submit the Contact us Form

  @SubmitContactForm
  Scenario Outline: SubmitContactForm
    Given Navigate to Contact us page
    Then Enter the "<name>" in name field 
    And Fill the "<Email>" in the Email field
    Then Enter the "<PhoneNumber>" in the phoneNumber field
    And Fill the "<CompanyName>" in the Company field
    Then Enter the "<Message>" in the Message field
    And Click the submit button
   # Then Close the Browser
    
    Examples: 
      | name  | Email        |PhoneNumber|CompanyName|Message     |
      | Test1  |Test12@gmail.com|78452154871 |UBTIINC12    |Test Mes12sage|
      
     @IncorrectDataValidation
  Scenario Outline: SubmitContactForm
    Given Navigate to Contact us page
    Then Enter the "<name>" in name field 
    And Fill the "<Email>" in the Email field
    Then Enter the "<PhoneNumber>" in the phoneNumber field
    And Fill the "<CompanyName>" in the Company field
    #Then Enter the "<Message>" in the Message field
    And Click the submit button
    But Verify the error Message
    Then Close the Browser
    
    Examples: 
      | name  | Email        |PhoneNumber|CompanyName|Message     |
      | Test1  |Test12|DES |UBTIINC12    |Test Mes12sage|