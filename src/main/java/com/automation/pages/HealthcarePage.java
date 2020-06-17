package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.ConfigUtils;

public class HealthcarePage {
	public HealthcarePage(){
		        PageFactory.initElements(getDriver(), this);
	    }
	@FindBy(xpath="//ul[@id='menu-main_menu']//ul//li//a[contains(text(),'Healthcare')]")
	private WebElement Healthcarelink;
	
	@FindBy(xpath="//title[contains(text(),'Healthcare Software Integration')]")
	private WebElement HealthcarepageTitle;
	
	@FindBy(xpath="//h1[contains(text(),'Healthcare Technology Solutions')]")
	private WebElement HeaderText;

	public void clickHealthcareLink()
	{
		Healthcarelink.click();
	}
	
	public void verifyhealthpageTitle() throws IOException
    {
	 
    	String actualTitle = getDriver().getTitle();
		String expectedTitle = "Healthcare Software Integration – IT Services | UBTI";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		ConfigUtils.takeScreenshot();

    }
	public void verifyHeader() throws IOException{
		String Actual=HeaderText.getText();
		 String Expected="Healthcare Technology Solutions";
		 Assert.assertEquals("Condition true", Actual, Expected);
		 ConfigUtils.takeScreenshot();
				 
	}
	

}
