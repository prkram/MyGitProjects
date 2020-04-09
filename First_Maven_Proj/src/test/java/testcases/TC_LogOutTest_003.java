package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.myBanking.pageobjects.HomePage;
import com.myBanking.pageobjects.LogOutPage;
import com.myBanking.pageobjects.LoginPage;
import com.myBanking.utilities.Basetest;

public class TC_LogOutTest_003 extends Basetest {
	
	@Test
	
	public void lgoutpagetest() throws Throwable {
		
		driver.get(baseURL);
	// Login tests	
		LoginPage loginpage = new LoginPage(driver); 
		loginpage.setUserName(userName); //enter username
		loginpage.setPassword(passWord); //enter password
		
		//Thread.sleep(2000); //set wait time to 2 seconds
	
		HomePage homepage = loginpage.clickLoginBtn(); // click submit button in login page
		LogOutPage logoutpage = homepage.fnlogout();  // pass driver control from HomePage to LogOut Page
		logoutpage.logout_click(); // click logout button
		//Thread.sleep(2000);
	}

}
