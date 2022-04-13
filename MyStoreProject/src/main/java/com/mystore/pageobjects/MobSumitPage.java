package com.mystore.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class MobSumitPage extends BaseClass {
	

	Action action=new Action();
	
	@FindBy(id="mobile")
	WebElement mob;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement loginbtn;
	
	@FindBy(xpath="//img[@alt='Panda Plus']")
	WebElement logo;
	
	@FindBy(xpath="//button[contains(text(),'Resend OTP')]")
	WebElement resendotp;
	
	@FindBy(xpath="//img[@alt='Panda Plus']")
	WebElement pandalogo;
	
	@FindBy(xpath="//input[@placeholder='Verification Code']")
	WebElement vercode;
	
	public MobSumitPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public RegisterationPage performLogin(String mobile) throws InterruptedException
	{
        action.type(mob, mobile);
        Thread.sleep(4000);
        action.click(getDriver(), submit);
        //action.type(vercode, vfc);
        Thread.sleep(6000);
        //action.explicitWait(getDriver(),resendotp, 120);
        action.click(getDriver(), loginbtn);
        return new RegisterationPage();   
	}
	
	public boolean validateLogo() throws Throwable {
		return action.isDisplayed(getDriver(),pandalogo);
	}
	
	public String getPageTitle()
	{
		String title= getDriver().getTitle();
		return title;
		
	}

	
	
	/*
	
public class MobSumitPage extends BaseClass {
	
	
	
	
	

	
	/*
	
	RegisterationPage lp;
	
	public MobSumitPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By mobileno=By.id("mobile");
	By subtn=By.xpath("//button[@type='submit']");
	By loginbtn=By.xpath("//button[@type='submit']");
	
	
	

	public WebElement getMobileno() 
	{
		return getElement(mobileno);
	}
	
	
	public WebElement getSubtn() 
	{
		return getElement(subtn);
	}
	
	public WebElement getLoginbtn() 
	{
           return getElement(loginbtn);
	}

	
	
	
	//action methods
	public String getTitlePage()
	{
		return getPageTitle();
	}
	
	public RegisterationPage DoSubmitMobileNo(String mobile_no)
	{
		getMobileno().sendKeys(mobile_no);
		getSubtn().click();
		
		//improvising wait until resend otp button appears
		waitForElementPresent(By.xpath("//div[@class='mt-6 text-center text-green-default text-sm']//button"));
		
		getLoginbtn().click();
		//return lp;
		
		return getInstance(RegisterationPage.class);
	}
		
		//return getInstance(LoginPage.class);		
		
    }
	
	/*
	public void DoSubmitMobileNo()
	{
		getMobileno().sendKeys();
		getSubtn().click();
		
		
		//improvising wait until resend otp button appears
		//waitForElementPresent(By.xpath("//div[@class='mt-6 text-center text-green-default text-sm']//button"));
		
		//getLoginbtn().click();
		//return lp;
		
		//return getInstance(LoginPage.class);		
		
    }
	
	public void DoSubmitMobileNo(String mob_no)
	{
		getMobileno().sendKeys();
		getSubtn().click();
		
		
		//improvising wait until resend otp button appears
		//waitForElementPresent(By.xpath("//div[@class='mt-6 text-center text-green-default text-sm']//button"));
		
		//getLoginbtn().click();
		//return lp;
		
		//return getInstance(LoginPage.class);		
		
    }
	*/
	
}	
	
	

	


