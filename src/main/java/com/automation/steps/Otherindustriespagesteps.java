package com.automation.steps;

import java.io.IOException;

import com.automation.pages.Otherindustriespage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Otherindustriespagesteps {
	Otherindustriespage Otherindustry =new Otherindustriespage();

	
	@And("^select the otherindustries link$")
	public void Selectotherindustriespagelink(){
		Otherindustry.clickotherindustriesink();
	}
	@Then("^Verify the Title of otherindustries page$")
	public void verifyOtherindustriesTitle() throws IOException {
		Otherindustry.verifyOtherindustriesTitle();
	}
	@And("^Verify the Header text of the other industries page$")
	public void verifytheotherindustriesheadertext() throws IOException{
		Otherindustry.verifyHeader();
	}
	
}
