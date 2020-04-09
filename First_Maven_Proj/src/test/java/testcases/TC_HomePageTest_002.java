package testcases;

import org.openqa.selenium.ElementClickInterceptedException;
//import org.testng.Assert;
import org.testng.annotations.Test;

import com.myBanking.pageobjects.HomePage;
import com.myBanking.pageobjects.LoginPage;
import com.myBanking.utilities.Basetest;

public class TC_HomePageTest_002 extends Basetest
{
	
	@Test
	public void homePagetest() throws Throwable 
	{
		driver.get(baseURL);
		
		//logger.info("URL is opened");
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.setUserName(userName);
		//logger.info("UserName is entered");
		
		loginPage.setPassword(passWord);
		//logger.info("Password is entered");
		
		//logger.info("Login Button is clicked");
		Thread.sleep(100);
		
		HomePage homepage = loginPage.clickLoginBtn();
		Thread.sleep(2000);
		
	// below code is to test the home page is landed correctly and hence testing the username of the login	
		String hp_head = homepage.hp_headerchk(); 
		System.out.println(hp_head);
		if (hp_head.equals("Manger Id : " + userName))
		{
			System.out.println("Home Page landed correctly");
		}
		else 
			System.out.println("Home Customer Page not landed correctly");
		
	// below code is to click the new customer link 
		
		homepage.hpNewCustclick();
		
	// below code is to test the new customer page is landed correctly and hence testing some static text in the New Customer page
		
		String newcust_head = homepage.newcust_headerchk(); 
		System.out.println(newcust_head);
		if (newcust_head.equals("Add New Customer"))
		{
			System.out.println("New Customer Page landed correctly");
		}
		else
			System.out.println("New Customer Page not landed correctly");
		
	// below code is to test [-ve test] if there is any alert and throw exception if there isn't any
		
		//homepage.alertHandlerAccept();
		}
	
}
