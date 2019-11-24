package com.consumerPayments.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.consumerPayments.pageObjects.LoginPage;

@Test
public class TC_LoginTest_0001 extends BaseClass
{

	@Test
	public void logintest() throws IOException
	{
		
		logger.info("URL is Entered");
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(Username);
		logger.info("Username is Entered");
		lp.setPassword(Password);
		logger.info("Password is Entered");
		lp.clickSubmit();
		captureScreen(driver,"TC_LoginTest_0001");
		/*lp.clickLogout();
		captureScreen(driver,"TC_LoginTest_0001");
		*/
		
	}
	
	
	
	
}
