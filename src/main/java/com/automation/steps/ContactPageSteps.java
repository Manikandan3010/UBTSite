package com.automation.steps;

import com.automation.pages.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactPageSteps {
	ContactPage contactpage = new ContactPage();
	
	@Given("^Navigate to Contact us page$")
	public void ClickonContactbutton(){
		contactpage.clickoncontactButton();
	}
	
	@Then("^Enter the \"([^\"]*)\" in name field$")
	public void EnterNameValue(String name){
		contactpage.enternameValue(name);
	}
	@And("^Fill the \"([^\"]*)\" in the Email field$")
	public void EnterEmailValu(String Email){
		contactpage.enteremailValue(Email);
		
	}
	@Then("^Enter the \"([^\"]*)\" in the phoneNumber field$")
	public void enterPhoneNumber(String PhoneNumber){
		contactpage.enterPhoneNumberValue(PhoneNumber);
	}
	
	@And("^Fill the \"([^\"]*)\" in the Company field$")
	public void EnterCompanyname(String CompanyName){
		contactpage.enterCompanyName(CompanyName);
		
	}
	@Then("Enter the \"([^\"]*)\" in the Message field$")
	public void EnterMessage(String Message){
		contactpage.enterMessage(Message);
	}
	
	@And("^Click the submit button$")
	public void ClickSubmitButton(){
		contactpage.ClicksubmitButton();
		
	}
	@But("^Verify the error Message$")
	public void verifytheerrormessage(){
		contactpage.GetEmailErroMsg();
		contactpage.GetTelephoneErrorMsg();
	}

}
