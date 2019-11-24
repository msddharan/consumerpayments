package com.consumerPayments.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.consumerPayments.pageObjects.AcceptPayment;
import com.consumerPayments.pageObjects.ElectronicPayment;
import com.consumerPayments.pageObjects.LoginPage;

@Test
public class TC005_AccountSearch_CreditCard_Discover_Pay extends BaseClass

{
	
	@Test
	public void DiscoverCard_Pay() throws IOException, InterruptedException
	{
		logger.info("URL is Entered");
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(Username);
		logger.info("Username is Entered");
		lp.setPassword(Password);
		logger.info("Password is Entered");
		lp.clickSubmit();
		captureScreen(driver,"TC_AcceptPaymentSearch_0005_Screen1");
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
		captureScreen(driver,"TC_AcceptPaymentSearch_0005_Screen2");
		Thread.sleep(500);
		ap.cardReaderCheckBoxSelect();
		Thread.sleep(1000);
		ap.setPaymentAmount("1.00");
		logger.info("Payment Amount is Entered");
		ap.EnterComments("Test Payments");
		captureScreen(driver,"TC_AcceptPaymentSearch_0005_Screen3");
		Thread.sleep(500);
		ap.electronicPaymentButtonClick();
		captureScreen(driver,"TC_AcceptPaymentSearch_0005_Screen4");
		logger.info("Redirects to Electronic Payment Page");
		ElectronicPayment epay = new ElectronicPayment(driver);
		Thread.sleep(10000);
		logger.info("selecting Cardtype");
		epay.SelectDiscoverCard();
		epay.EnterCardNumber("6011111111111117");
		logger.info("Card Number is entered");
		epay.SelectExpYear();
		logger.info("Expiration Year is selected");
		captureScreen(driver,"TC_AcceptPaymentSearch_0005_Screen5");
		epay.EnterCVV("124");
		logger.info("CVV Value is entered");
		epay.EnterAddressLine2();
		logger.info("Address Line2 is entered");
		epay.EnterPhoneNumber();
		logger.info("Phone Number is entered");
		captureScreen(driver,"TC_AcceptPaymentSearch_0005_Screen6");
		epay.ClickReviewPaymentButton();
		Thread.sleep(3000);
		logger.info("Review Payemnt Button is clicked");
		epay.ClickSubmitPaymentButton();
		Thread.sleep(3000);
		logger.info("Submit Payemnt button is clicked");
		logger.info("End of Master Card Payment Scenario");
		captureScreen(driver,"Discover Payemnt_Receipt Page");
	
	}

}
