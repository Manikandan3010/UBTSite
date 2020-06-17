package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.ConfigUtils;

public class Otherindustriespage {
	public Otherindustriespage(){
		        PageFactory.initElements(getDriver(), this);
	    }
	@FindBy(xpath="//a[contains(text(),'Other Industries')]")
	private WebElement Otherindustrieslink;
	
	@FindBy(xpath="//h1[contains(text(),'Other Industries')]")
	private WebElement OtherIndustriesHeaderText;

	public void clickotherindustriesink()
	{
		Otherindustrieslink.click();
	}
	
	public void verifyOtherindustriesTitle() throws IOException
    {
	 
    	String actualTitle = getDriver().getTitle();
		String expectedTitle = "Software Technology for Government, Education, Insurance | UBTI";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		ConfigUtils.takeScreenshot();

    }
	public void verifyHeader() throws IOException{
		String Actual=OtherIndustriesHeaderText.getText();
		 String Expected="Other Industries";
		 Assert.assertEquals("Condition true", Actual, Expected);
		 ConfigUtils.takeScreenshot();
				 
	}
	

}
