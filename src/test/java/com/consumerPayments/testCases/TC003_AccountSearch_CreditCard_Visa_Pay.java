package com.consumerPayments.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.consumerPayments.pageObjects.AcceptPayment;
import com.consumerPayments.pageObjects.ElectronicPayment;
import com.consumerPayments.pageObjects.LoginPage;

@Test
public class TC003_AccountSearch_CreditCard_Visa_Pay extends BaseClass

{
	
	@Test
	public void CreditCard_Visa_Pay() throws IOException, InterruptedException
	{
		logger.info("URL is Entered");
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(Username);
		logger.info("Username is Entered");
		lp.setPassword(Password);
		logger.info("Password is Entered");
		lp.clickSubmit();
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
		Thread.sleep(500);
		ap.cardReaderCheckBoxSelect();
		Thread.sleep(1000);
		ap.setPaymentAmount("1.00");
		logger.info("Payment Amount is Entered");
		ap.EnterComments("Test Payments");
		Thread.sleep(1000);
		ap.electronicPaymentButtonClick();
		captureScreen(driver,"TC_AcceptPaymentSearch_0003_Screen4");
		logger.info("Redirects to Electronic Payment Page");
		ElectronicPayment epay = new ElectronicPayment(driver);
		Thread.sleep(12000);
		logger.info("Entering Electronic payment page");
		epay.EnterCardNumber("4111111111111111");
		logger.info("Card Number is entered");
		epay.SelectExpYear();
		logger.info("Expiration Year is selected");
		epay.EnterCVV("123");
		logger.info("CVV Value is entered");
		epay.EnterAddressLine2();
		logger.info("Address Line2 is entered");
		epay.EnterPhoneNumber();
		logger.info("Phone Number is entered");
		epay.ClickReviewPaymentButton();
		Thread.sleep(3000);
		logger.info("Review Payemnt Button is clicked");
		epay.ClickSubmitPaymentButton();
		Thread.sleep(3000);
		logger.info("Submit Payemnt button is clicked");
		logger.info("End of Payment Scenario");
		captureScreen(driver,"Visa Payment_Receipt Page");
	
	}

}
