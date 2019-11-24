package com.consumerPayments.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.consumerPayments.pageObjects.LoginPage;
import com.consumerPayments.utilities.XLUtils;

public class TC_LoginDD_0002 extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void LoginDDT(String User,String pwd) throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(User);
		lp.setPassword(pwd);
		lp.clickSubmit();
		Thread.sleep(3000);
	}
	
	@DataProvider(name="LoginData")
	
	String [ ][ ] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/consumerPayments/testData/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path,"Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[ ][ ]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);//1 0
			}
				
		}
		return logindata;
	}

}
 