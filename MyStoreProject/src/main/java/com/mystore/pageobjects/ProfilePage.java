package com.mystore.pageobjects;

import com.mystore.base.BaseClass;

public class ProfilePage extends BaseClass {
	
	
	public String getCurrentURL()
	{
		String prfpageurl=getDriver().getCurrentUrl();
		return prfpageurl;
	}

}
