package com.consumerPayments.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.consumerPayments.pageObjects.AcceptPayment;
import com.consumerPayments.pageObjects.ElectronicPayment;
import com.consumerPayments.pageObjects.LoginPage;

@Test
public class TC006_AccountSearch_CreditCard_AmericanExpress_Pay extends BaseClass

{
	
	@Test
	public void AMEXCard_Pay() throws IOException, InterruptedException
	{
		logger.info("URL is Entered");
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(Username);
		logger.info("Username is Entered");
		lp.setPassword(Password);
		logger.info("Password is Entered");
		lp.clickSubmit();
		captureScreen(driver,"TC_AcceptPaymentSearch_0006_Screen1");
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
		captureScreen(driver,"TC_AcceptPaymentSearch_0006_Screen2");
		Thread.sleep(500);
		ap.cardReaderCheckBoxSelect();
		Thread.sleep(1000);
		ap.setPaymentAmount("1.00");
		logger.info("Payment Amount is Entered");
		ap.EnterComments("Test Payments");
		captureScreen(driver,"TC_AcceptPaymentSearch_0006_Screen3");
		Thread.sleep(500);
		ap.electronicPaymentButtonClick();
		captureScreen(driver,"TC_AcceptPaymentSearch_0006_Screen4");
		logger.info("Redirects to Electronic Payment Page");
		Thread.sleep(10000);
		ElectronicPayment epay = new ElectronicPayment(driver);
		epay.SelectAmexCard();
		Thread.sleep(50);
		epay.EnterCardNumber("371449635398431");
		logger.info("Card Number is entered");
		epay.SelectExpYear();
		logger.info("Expiration Year is selected");
		epay.EnterCVV("1234");
		logger.info("CVV Value is entered");
		epay.EnterAddressLine2();
		logger.info("Address Line2 is entered");
		epay.EnterPhoneNumber();
		logger.info("Phone Number is entered");
		captureScreen(driver,"TC_AcceptPaymentSearch_0006_Screen5");
		epay.ClickReviewPaymentButton();
		Thread.sleep(3000);
		logger.info("Review Payemnt Button is clicked");
		epay.ClickSubmitPaymentButton();
		Thread.sleep(3000);
		logger.info("Submit Payemnt button is clicked");
		logger.info("End of Master Card Payment Scenario");
		captureScreen(driver,"AMEX Payment_Receipt Page");
	
	}

}
