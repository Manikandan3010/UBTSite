
@tag
Feature: To Verify the Healthcare Page
  

  @Test3
  Scenario: Verify Navigation to Healthcare page
    Given navigate to home page of application
    Then Click on the Industries dropdown
    And select the Healthcare link
    Then Verify the Title of healthcare page
    And Verify the Header text of the page
    Then Close the Browser

    