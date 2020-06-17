package com.automation.steps;

import java.io.IOException;

import com.automation.pages.CapitalMarketPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CapitalMarketspageSteps {
	CapitalMarketPage capitalmarket=new CapitalMarketPage();

	
	@And("^Select the CapitalMarket Page$")
	public void selectcapitalmarket(){
		capitalmarket.SelectCapitalmarket();
	}
	
	@Then("^Verify the Header Text of the page$")
	public void verifyheadertext() throws IOException{
		capitalmarket.verifyHeader();
		
	}
	@And("^Click learnmore link$")
	public void clicklearnmorebutton(){
		capitalmarket.clickLearmore();
	}
	
}
