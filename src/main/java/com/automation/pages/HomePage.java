package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.ConfigUtils;

public class HomePage {
	public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }
	@FindBy(xpath = "//title[contains(text(),'Intelligent Software Solutions | UBTI | Empowering')]")
    private  WebElement Title;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement Homelink;
	
	@FindBy(xpath="//a[@class='dropdown-toggle'][contains(text(),'Industries')]")
	private WebElement IndustriesMenu;
	
	@FindBy(xpath="//ul[@id='menu-main_menu']//ul//li//a[contains(text(),'Aerospace')]")
	private WebElement Aerospacelink;
	
	@FindBy(xpath="//h1[contains(text(),'Aerospace Software Solutions')]")
	private WebElement verifyHeaderText;
	
	
	public void clickHomelink()
	{
		Homelink.click();
	}
	
	 public void verifyHomepageTitle() throws IOException
	    {
		 
	    	//String actualTitle = getDriver().getTitle();
	    	String actualTitle = getDriver().getTitle();
			String expectedTitle = "Intelligent Software Solutions | UBTI | Empowering Your Enterprise";
			Assert.assertEquals("Condition true", actualTitle, expectedTitle);
			ConfigUtils.takeScreenshot();

	    }
	 
	 public void clickonindustriesDropdown() throws IOException
	 {
		 IndustriesMenu.click();
		 ConfigUtils.takeScreenshot();
	 }
	 
	 public void clickonAerospacelink() throws IOException
	 {
		 Aerospacelink.click();
		 ConfigUtils.takeScreenshot();
	 }
	 
	 public void VerifyHeaderText() throws IOException
	 {
		 String Actual=verifyHeaderText.getText();
		 String Expected="Aerospace Software Solutions";
		 Assert.assertEquals("Condition true", Actual, Expected);
		 ConfigUtils.takeScreenshot();
				 
	 }
	 
	 public void closeBrowser()
	 {
		 getDriver().close();
	 }
}
