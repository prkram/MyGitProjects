package com.myBanking.pageobjects;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myBanking.utilities.BasePage;

public class LogOutPage extends BasePage{
	
	WebDriver lgdriver;
	
	public LogOutPage(WebDriver wdriver) {
		
		super(wdriver);
		lgdriver = wdriver;
		PageFactory.initElements(lgdriver, this);
	}
	

	
	// it can also be written as @FindBy(xpath = "//a[text()='Log out']" or @FindBy(xpath = "//a[contains(text(),'Log out')]"
	//@FindBy(xpath = "//a[@href = 'Logout.php']") 
	// //a[@href = "Logout.php"]
	
	@FindBy(xpath = "//a[@href = 'Logout.php']") 
	WebElement lgoutlink;
	
	
	public LogOutPage logout_click() throws Throwable {
		
		ScrollTillEleVisible(lgoutlink);
		lgoutlink.click();
	//	exWaitforAlerts();// calling explicit wait for alerts
		alertHandlerAccept(lgdriver);
		//Thread.sleep(3000);
		alertHandlerDismiss(lgdriver);
		return null;
	}

}
