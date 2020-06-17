@tag
Feature: To Verify the Healthcare Page
  

  @Test4
  Scenario: Verify Navigation to Healthcare page
    Given navigate to home page of application
    Then Click on the Industries dropdown
    And select the otherindustries link
    Then Verify the Title of otherindustries page
    And Verify the Header text of the other industries page
    Then Close the Browser