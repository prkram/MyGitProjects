package com.myBanking.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Basetest {

	public String baseURL = "http://demo.guru99.com/v4";
	public String userName = "mngr252163";
	public String passWord = "EgeduhY";
	public static WebDriver driver;

	// public static Logger logger;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");	 
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/* ---------- Handling SSL Certificate Error in Firefox browser ---------- 
		 * 
		 * For Firefox, we need to create a new FF profile and set 2 properties setAcceptUntrustedCertificates to true &
		 * setAssumeUntrustedCertificateIssuer to false and pass this profile while instantiating the driver
		 * 
		 * ---------- Handling SSL Certificate Error in Chrome browser---------- 
		 * 
		 * DesiredCapabilities handleSSLerror = DesiredCapabilities.chrome();
		 * handleSSLerror.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true); WebDriver
		 * driver = new ChromeDriver (handleSSLerror);
		 * 
		 * ---------- Handling SSL Certificate Error in IE browser - 2 methods---------- 
		 * 
		 * **** Method 1 --> Click link - Continue to this website (not recommended) - inspect the corresponding webelement
		 *  and click the same as follows
		 *  driver.navigate ().to ("javascript:document.getElementById('overridelink').click()");
		 *  
		 * **** Method 2 --> similar to Chrome browser using Desired capabilities
		 * DesiredCapabilities handleieSSLerror = new DesiredCapabilities();
		 * handleieSSLerror.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		 * WebDriver iedriver = new InternetExplorerDriver(handleieSSLerror);
		 * 
		 */		

		// logger = Logger.getLogger("Automation Framework");
		// PropertyConfigurator.configure("log4j.properties");
	}

	
	  @AfterClass public void tearDown() { driver.quit(); }
	 

}
