@Test
Feature: Verify the UBTI Website

  @VerifyNavigationtoAerospacePage
  Scenario: Verify industries_Aerospace Page
    Given navigate to home page of application
    And verify the Home page Title
    Then Click on the Industries dropdown
    When Navigate to Aerospace page
    And Verify the Header Text
    #Then Close the Browser

 