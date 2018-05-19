package crmproTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import crmpro.crmproEx;
import pageFactory.pfTestCase;

public class crmproTestCaseEx {
	WebDriver driver;
	
	public void crmproTC() {
		
	}
		
		@Test
		public void testLogin( ) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ahsan\\Documents\\Drivers\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		crmproEx loginPF = PageFactory.initElements(driver, crmproEx.class);
		
		loginPF.logo();
		loginPF.username("arahim");
		loginPF.passworid("arahim");
		loginPF.login();
		loginPF.forgotpassword();
		loginPF.signup();
		loginPF.features();
		loginPF.pricing();
		loginPF.customer();
		loginPF.contact();
		loginPF.header();
		loginPF.footer();
		
		
	}
	

		

}
