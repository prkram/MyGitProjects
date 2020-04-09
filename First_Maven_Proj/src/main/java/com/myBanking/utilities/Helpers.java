package com.myBanking.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {
	
	//Include Alerts, wait, screenshot related methods here

	WebDriver hdriver;
	//WebElement helement;
	
	public Helpers (WebDriver wdriver) 
	{
		hdriver = wdriver;
		
	}
	
	public void alertHandlerAccept (WebDriver hdriver) throws Throwable {
		
		// separate method to be written for alert dismiss and other actions of alert like gettext(), etc.,

		//alert handling method to click OK button
		try {
			Alert a = new WebDriverWait(hdriver,20).until(ExpectedConditions.alertIsPresent());
			System.out.println("Before IF");
			if(a!=null) {
				Alert alert = hdriver.switchTo().alert();
				String alertMsg = alert.getText(); // get the alert message
				System.out.println("Alert message is: " + alertMsg);
				alert.accept();
				System.out.println("Alert accepted successfully");
			}
			else {
				throw new Throwable();
			}
			
		}
		
		catch (NoAlertPresentException na) {
			//System.out.println(na);
			System.out.println("Alert Not present");
		}
		catch (Throwable e) {
			System.err.println("No Alert present");
		}
	}


	public void alertHandlerDismiss (WebDriver hdriver) throws Throwable {

		//alert handling method to click Cancel button or No button or to come out of the alert pop-up
		
		try {
			Alert a = new WebDriverWait(hdriver,20).until(ExpectedConditions.alertIsPresent());
			System.out.println("Before IF");
			if (a!=null) {
				Alert alert = hdriver.switchTo().alert();
				String alertMsg = alert.getText(); // get the alert message
				System.out.println("Alert message is: " + alertMsg);
				alert.dismiss();
				System.out.println("Alert dismissed successfully");
			}
			else 
			{
				throw new Throwable();
			}
			
		}
		
		catch (NoAlertPresentException na1) {
			//System.out.println(na);
			System.out.println("Alert Not present");
		}
		catch (Throwable e1) {
			//System.out.println(na);
			System.out.println("Alert Not present");
		}
		
	}
	
	public void explicitWait (String wElement) {
		
		WebDriverWait wait = new WebDriverWait(hdriver, 20);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated();
		//wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wElement)));

	}

	public void exWaitforAlerts () {
		
		WebDriverWait wait = new WebDriverWait(hdriver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}

}
