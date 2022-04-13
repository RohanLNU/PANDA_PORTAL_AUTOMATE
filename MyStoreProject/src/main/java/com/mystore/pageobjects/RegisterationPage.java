package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class RegisterationPage extends BaseClass {

	Action action=new Action();
	@FindBy(xpath="//h1[text()='Welcome to Panda Plus']")
	WebElement welcomemsge;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement email;
	
	@FindBy(xpath="//span[text()='Yes to email']//parent::div//input[@type='checkbox']")
	WebElement emailbox;
	
	@FindBy(xpath="//span[contains(text(),'Please accept')]//parent::div//input[@type='checkbox']")
	WebElement acptc;
	
	@FindBy(xpath="//button[@type='submit']//parent::div")
	WebElement submitbtn;
	
	public RegisterationPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public boolean validateWelcomeMessage()
	{
		return action.isDisplayed(getDriver(),welcomemsge);
	}
	
	public String validateregPageTitle()
	{
		String regtitle=getDriver().getTitle();
		return regtitle;
	}
	
	public String getCurrentURL()
	{
		String registerationurl=getDriver().getCurrentUrl();
		return registerationurl;
	}
	
	public ProfilePage doRegisterCustomer(String fname,String lname,String mailid) throws InterruptedException
	{
		
		action.type(firstname, fname);
		Thread.sleep(3000);
		action.type(lastname, lname);
		Thread.sleep(3000);
		action.type(email, mailid);
		action.click(getDriver(), acptc);
		Thread.sleep(3000);
		action.click(getDriver(),submitbtn);
		
		return new ProfilePage();
		
	}
	/*
	public void performRegisteration(String fname, String lname, String email)
	{
		
		
	}
	*/
}























/*
package com.hyperpandatest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPage extends BasePage

{
	
	public RegisterationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	By firstname= By.xpath("//input[@placeholder='First Name']");
	By lastname= By.xpath("//input[@placeholder='Last Name']");
	By email= By.xpath("//input[@placeholder='Email']");
	By emailcheckbox=By.xpath("//span[text()='Yes to email']//parent::div//input[@type='checkbox']");
	By accpttc=By.xpath("//span[contains(text(),'Please accept')]//parent::div//input[@type='checkbox']");
	
	By submit= By.xpath("//button[@type='submit']//parent::div");
	
	public WebElement getFirstname() {
		return getElement(firstname);
	}

	

	public WebElement getLastname() {
		return getElement(lastname);
	}

	
	public WebElement getEmail() {
		return getElement(email);
	}

	

	public WebElement getEmailcheckbox() {
		return getElement(emailcheckbox);
	}

	
	public WebElement getAccpttc() {
		return getElement(accpttc);
	}

	
	public WebElement getSubmit() {
		return getElement(submit);
	}
	
	
	
	public ProfilePage doSubmit(String fname,String lname, String mail)
	{
		getFirstname().sendKeys(fname);
		getLastname().sendKeys(lname);
		getEmail().sendKeys(mail);
		getEmailcheckbox().click();
		getAccpttc().click();
		getSubmit().click();
		
		//return getInstance(ProfilePage.class);
		
			
	}
	
	public Object[][] getTestData(String scenario, String firstname,String lastname, String email)
	{
		
		return new Object[][] 
		{
			
			{"namingerror","&^^&$7","kumar","rohan@test.com"},
			{"positive","sasa"},
		};
	}

	
	
	
	
	
	
	
	

}
*/
