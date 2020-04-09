package com.myBanking.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	//ArrayList<WebElement> menu = new ArrayList<WebElement>();

	
	public LoginPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this); 
	}
	
	/*
	 * @FindBy (xpath = "//ul[@class = 'menusubnav']/li") ArrayList<WebElement>
	 * menu;
	 */
	
//	WebElement a = ldriver.findElement(By.xpath(""));
//	List<WebElement> b = ldriver.findElements(By.xpath(""));
	
	@FindBy (name = "uid")
	WebElement userName;
	
	@FindBy (name = "password")
	WebElement passWord;
	
	@FindBy (name = "btnLogin")
	WebElement loginBtn;
	
	public void setUserName (String uName) {
		userName.sendKeys(uName);
	}
	
	public void setPassword (String pwd) {
		passWord.sendKeys(pwd); 
	}
	
	/*
	 * public LogOutPage clickLoginBtn () { loginBtn.click(); return new LogOutPage
	 * (ldriver); }
	 */
	
	public HomePage clickLoginBtn () {
		loginBtn.click(); 
		return new HomePage (ldriver);
	}
	
	
}
