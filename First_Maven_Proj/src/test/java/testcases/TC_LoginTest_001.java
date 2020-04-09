package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myBanking.pageobjects.LoginPage;
//import com.myBanking.pageObjects.LoginPage;
import com.myBanking.utilities.Basetest;

public class TC_LoginTest_001 extends Basetest{

	
	@Test
	public void loginTest() throws InterruptedException {
		
		driver.get(baseURL);
		
		//logger.info("URL is opened");
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.setUserName(userName);
		//logger.info("UserName is entered");
		
		loginPage.setPassword(passWord);
		//logger.info("Password is entered");
		
		loginPage.clickLoginBtn();
		//logger.info("Login Button is clicked");
		Thread.sleep(100);
		
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			System.out.println("Login Test passed");
		}
		
		else
		{
			Assert.assertTrue(false);
			System.out.println("Login Test failed");
		}
			 
	}
}
