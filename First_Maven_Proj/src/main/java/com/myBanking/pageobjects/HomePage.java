package com.myBanking.pageobjects;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myBanking.utilities.BasePage;

public class HomePage extends BasePage{

	WebDriver hdriver;
	public HomePage(WebDriver ldriver) {
		super(ldriver);
		hdriver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy (xpath = "//a[@href = 'addcustomerpage.php']")
	WebElement hpNewCusttext;
	
	@FindBy (className = "barone")
	WebElement hpclassname;
	
	@FindBy (className = "heading3")
	WebElement newcust_header;
	
	@FindBy (xpath = "//table[@class='layout'][@border='0'][@align='center']/tbody/tr/td/table/tbody/tr[3]/td")
	WebElement hpmgrID;
	
	public void hpNewCustclick() throws Throwable {
		//FindWebElement(hpNewCusttext); hpNewCusttext.click();
		try 
		{ 
		  FindWebElement(hpNewCusttext); 
		  hpNewCusttext.click();
		  alertHandlerAccept(hdriver);
		} 
		catch (ElementClickInterceptedException e) 
		{
			System.out.println(e.getMessage());
			System.out.println("Unable to Click the Element");
		}
		  catch (NullPointerException e1) 
		{
			  System.out.println(e1.getMessage()); 
			  System.out.println("Something Wrong with the code, please fix it");
		}
		
	}
	
	public String hp_headerchk() {
		String hc;
		hc = hpmgrID.getText();
		//System.out.println(hc);
		return hc;
	}
	
	public String hpguru99check() {
		String a;
		a = hpclassname.getText();
		return a;
	}
	
	public String newcust_headerchk() {
		String h;
		h = newcust_header.getText();
		return h;
	}
	
	public LogOutPage fnlogout() {
		return new LogOutPage (hdriver);
	}
	
}