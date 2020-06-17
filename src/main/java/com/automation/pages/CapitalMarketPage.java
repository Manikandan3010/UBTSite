package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.ConfigUtils;

public class CapitalMarketPage {
	
	public CapitalMarketPage(){
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(linkText="Capital Markets")
	private WebElement CapitalMarketLink;
	
	@FindBy(xpath="//h1[contains(text(),'Capital Markets Software Solutions')]")
	private WebElement CapitalHeaderText;
	
	@FindBy(xpath="//a[contains(text(),'learn more.')]")
	private WebElement learnmorelink;
	
	
	public void SelectCapitalmarket()
	{
		CapitalMarketLink.click();
	}
	
	public void clickLearmore()
	{
		learnmorelink.click();
		getDriver().switchTo().frame("Contact Us");
	}
	
	 public void verifyHeader() throws IOException
	 {
		 String Actual=CapitalHeaderText.getText();
		 String Expected="Capital Markets Software Solutions";
		 Assert.assertEquals("Condition true", Actual, Expected);
		 ConfigUtils.takeScreenshot();
				 
	 }
}
