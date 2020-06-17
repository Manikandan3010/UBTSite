package com.automation.steps;

import java.io.IOException;

import com.automation.pages.HealthcarePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class HealthCarePageSteps {
	HealthcarePage healthcare=new HealthcarePage();

	
	@And("^select the Healthcare link$")
	public void Selecthealthcarepagelink(){
		healthcare.clickHealthcareLink();
	}
	@Then("^Verify the Title of healthcare page$")
	public void navigatetohealthcarepage() throws IOException{
		healthcare.verifyhealthpageTitle();
	}
	@And("^Verify the Header text of the page$")
	public void verifytheheadertext() throws IOException{
		healthcare.verifyHeader();
	}
	
}
