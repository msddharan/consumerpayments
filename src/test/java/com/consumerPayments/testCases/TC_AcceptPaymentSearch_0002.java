package com.consumerPayments.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.consumerPayments.pageObjects.AcceptPayment;
import com.consumerPayments.pageObjects.LoginPage;

@Test
public class TC_AcceptPaymentSearch_0002 extends BaseClass 

{

	@Test
	public void acceptpaymentsearch() throws IOException, InterruptedException
	{
		
		logger.info("URL is Entered");
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(Username);
		logger.info("Username is Entered");
		lp.setPassword(Password);
		logger.info("Password is Entered");
		lp.clickSubmit();
		captureScreen(driver,"TC_AcceptPaymentSearch_0002_Screen1");
		logger.info("Login is Sucessful");
		Thread.sleep(3000);
		
		AcceptPayment ap = new AcceptPayment(driver);
		logger.info("Accept Payment Search Test");
		ap.Ecashieringhover();
		ap.ClickAcceptPaymentLink();
		logger.info("Accept Payment Link is Clicked");
		
		ap.setAcceptPaymentSearchCondition("CRAIG WHETTON");
		logger.info("Search Data is entered");
		
		ap.AcceptPaymentButtonSearch();
		logger.info("AcceptPayment Search Button is clicked");
		
		ap.AcceptPaymentSearchResultsSelection();
		logger.info("Selected an Document from Search Results");
		
		ap.PayselectedAccountButton();
		logger.info("Accept Payment Search Link is clicked");
		captureScreen(driver,"TC_AcceptPaymentSearch_0002_Screen2");
		Thread.sleep(1500);
		
		ap.cardReaderCheckBoxSelect();
		Thread.sleep(3000);
		
		ap.setPaymentAmount("1.00");
		logger.info("Payment Amount is Entered");
		captureScreen(driver,"TC_AcceptPaymentSearch_0002_Screen3");
		Thread.sleep(1000);
	
		ap.electronicPaymentButtonClick();
		Thread.sleep(3000);
		captureScreen(driver,"TC_AcceptPaymentSearch_0002_Screen4");
		logger.info("Redirects to Electronic Payment Page");
		
	}
	
	
	
}
