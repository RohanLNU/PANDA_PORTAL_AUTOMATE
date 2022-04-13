package com.mystore.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import com.mystore.dataprovider.DataProviders;
import com.mystore.pageobjects.MobSumitPage;
import com.mystore.pageobjects.RegisterationPage;
import com.mystore.utility.Log;

public class MobileSubmitPageTest extends BaseClass{
	
	Action action=new Action();
	private MobSumitPage mbp;
	private RegisterationPage rgp;
	
	
	@BeforeMethod
	public void setup() {
		launchApp(); 
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	

   @Test(dataProvider="MobileSubmit", dataProviderClass=DataProviders.class)
   public void verifyLoginTest(String mob) throws Throwable 
   {
	   
	   Log.startTestCase("verifyLoginTest");
	   mbp=new MobSumitPage();
	   
	  // rgp=mbp.performLogin(prop.getProperty("mobile_no"));
	   
	   
	   rgp=mbp.performLogin(mob);
	    
	   Log.info("user is providing mobile number & landing to the Registeration Page");
	   boolean res=rgp.validateWelcomeMessage();
	   
	   Assert.assertTrue(res);
   }
   
  
	/*
	@Test(priority=1)
	public void verifyPandaPlusLogo() throws Throwable
   {
	   
	   
	   mbp=new MobSumitPage();
	   boolean logo=mbp.validateLogo();
	   Assert.assertTrue(logo);
   }
   
 
 
 
	@Test
   public void verifyMobilePageTitle()
   {
	   mbp=new MobSumitPage();
	   Log.startTestCase(" verifyMobilePageTitle");
	   String title=mbp.getPageTitle();
	   Assert.assertEquals(title,"Panda Pl");
	   Log.endTestCase(" verifyMobilePageTitle");
   }
  */
  
	
	
}
