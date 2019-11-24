package com.consumerPayments.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name="LoginCredentials.UserName")
	WebElement Username;
	
	@FindBy(name="LoginCredentials.Password")
	WebElement Password;
	
	@FindBy(name="btnLogin")
	WebElement Submit;
	
	@FindBy(xpath="//*[@id=\"logged-in\"]/p/a")
	WebElement Logout;
	
	public void setUsername(String uname)
	{
		Username.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		Submit.click();
	}
	
	public void clickLogout()
	{
		Logout.click();
	}
	
}
