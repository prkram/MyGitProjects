package com.myBanking.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Helpers{

	WebDriver commondriver;
	WebElement commonelement;

	
	public BasePage(WebDriver wdriver) {
		// TODO Auto-generated constructor stub
		super (wdriver);
		commondriver = wdriver;
	}
	
	public void ScrollTillEleVisible(WebElement celement) 
	{
		
		commonelement = celement;
		
		  JavascriptExecutor js = (JavascriptExecutor) commondriver;
		 // js.executeScript("scroll(0, 250);");
		 
		 js.executeScript("arguments[0].scrollIntoView(true);", celement);
		 //js.executeScript("arguments[0].click();", celement);
		
		 System.out.println("Message: Successfully implemented scroll till element visibility");
		 
		
	}
	
public void FindWebElement(WebElement celement) 
	{
		
		commonelement = celement;
		
		  JavascriptExecutor js = (JavascriptExecutor) commondriver;
		 js.executeScript("window.scrollBy(0,250)","");
		 
		 //js.executeScript("arguments[0].scrollIntoView(true);", celement);
		 //js.executeScript("arguments[0].click();", celement);
		
		 System.out.println("Message: Clicked successfully ");
		
	}
	
	

}
