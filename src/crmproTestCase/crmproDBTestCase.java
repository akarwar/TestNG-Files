package crmproTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import crmpro.crmproDashboard;
import crmpro.crmproEx;

public class crmproDBTestCase {
	
WebDriver driver;
	
	public void crmproDashboard() {
		
	}
		
		@Test
		public void testLogin( ) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ahsan\\Documents\\Drivers\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		crmproDashboard loginPF = PageFactory.initElements(driver, crmproDashboard.class);
	
		loginPF.username("arahim");
		loginPF.passworid("arahim");
		Thread.sleep(4000);
		loginPF.login();
		loginPF.newcom();
		loginPF.home();
		loginPF.calendernewevent();
		loginPF.eventTitle();
		
		
		
		
		}

}
