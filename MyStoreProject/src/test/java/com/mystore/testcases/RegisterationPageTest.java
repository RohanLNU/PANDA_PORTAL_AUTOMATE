package com.mystore.testcases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import com.mystore.dataprovider.DataProviders;
import com.mystore.pageobjects.MobSumitPage;
import com.mystore.pageobjects.ProfilePage;
import com.mystore.pageobjects.RegisterationPage;

public class RegisterationPageTest extends BaseClass {
	
	Action action=new Action();
	private MobSumitPage mbp;
	private RegisterationPage rgp;
	private ProfilePage pfg;
	
	@BeforeMethod
	public void setup() {
		launchApp(); 
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(dataProvider="RegisterationSubmit",dataProviderClass=DataProviders.class)
	public void verifyRegisterationTest(HashMap<String,String> hashMapValue) throws InterruptedException
	{
		mbp=new MobSumitPage();
		//rgp=new RegisterationPage();
		//pfg=new ProfilePage();
		
		rgp=mbp.performLogin(hashMapValue.get("Mobile_Number"));
		pfg=rgp.doRegisterCustomer(
				hashMapValue.get("First Name"),
				hashMapValue.get("Last Name"),
				hashMapValue.get("Email"));
		
		//validtion steps
		String actualurl=pfg.getCurrentURL();
		String expurl="https://panda.com.sa/loyalty-staging-new/en/admin/dashboard";
		
		Assert.assertEquals(actualurl, expurl);
	
		
		
	}
	
	

}
