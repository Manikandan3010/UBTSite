package com.automation.pages;

import static com.automation.utils.DriverUtils.getDriver;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	public ContactPage() {
        PageFactory.initElements(getDriver(), this);
    }
	@FindBy(xpath="//ul[@id='menu-main_menu']//a[contains(text(),'Contact')]")
	private WebElement Contactbutton;
	
	@FindBy(xpath="//input[@id='form-name']")
	private WebElement NameTextBox;
	
	@FindBy(id="form-email")
	private WebElement EmailTextBox;
	
	@FindBy(name="form-phone")
	private WebElement PhoneTextBox;
	
	@FindBy(xpath="//input[@id='form-company']")
	private WebElement CompanyTextBox;
	
	@FindBy(xpath="//textarea[@id='form-message']")
	private WebElement MessageTextBox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Submitbutton;
	
	@FindBy(xpath="//span[contains(text(),'Email address seems invalid.')]")
	private WebElement EmailerrorMsg;
	
	@FindBy(className="wpcf7-not-valid-tip")
	private WebElement errormsg;
	
	@FindBy(xpath="//span[contains(text(),'Telephone number seems invalid.')]")
	private WebElement TelephoneInvalid;
	
	public void clickoncontactButton(){
		Contactbutton.click();
	}
	
	public void enternameValue(String name){
		NameTextBox.sendKeys(name);
		
	}
	public void enteremailValue(String Email){
		EmailTextBox.sendKeys(Email);
	}
	
	public void enterPhoneNumberValue(String PhoneNumber){
		PhoneTextBox.sendKeys(PhoneNumber);
	}
	public void enterCompanyName(String CompanyName){
		CompanyTextBox.sendKeys(CompanyName);
	}
	public void enterMessage(String Message){
		MessageTextBox.sendKeys(Message);
	}
	
	public void ClicksubmitButton(){
		Submitbutton.click();
		
	}
	
	public void GetEmailErroMsg(){
		String actual=errormsg.getText();
		System.out.println(actual);
		String expectedText = "Email address seems invalid.";
		System.out.println(expectedText);
		Assert.assertEquals(actual,expectedText);
		
	}
	public void GetTelephoneErrorMsg(){
		String actual=TelephoneInvalid.getText();
		String expectedText = "Telephone number seems invalid.";
		Assert.assertEquals(actual,expectedText);
		
	}
	
	

}
