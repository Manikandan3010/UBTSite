package com.automation.steps;

import java.io.IOException;

import com.automation.pages.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {

	    HomePage homepage = new HomePage();

@Given("^navigate to home page of application$")
public void verifyuserisonHomepageofapplication(){
	homepage.clickHomelink();
}

@And("^verify the Home page Title$")
public void VerifyHomepageTitle() throws IOException{
homepage.verifyHomepageTitle();
}

@Then("^Click on the Industries dropdown$")
public void ClickonIndustries() throws IOException{
	homepage.clickonindustriesDropdown();
	
}

@When("^Navigate to Aerospace page$")
public void clickonAerospacelink() throws IOException{
	homepage.clickonAerospacelink();
	
}

@And("^Verify the Header Text$")
public void verifyheadertext() throws IOException
{
	homepage.VerifyHeaderText();
}
@Then("^Close the Browser$")
public void closethebrowser(){
	homepage.closeBrowser();
}
		
}
