package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pageFactoryInClass {
	
	@Test
	public void testLogin( ) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	
	pfTestCase loginPF = PageFactory.initElements(driver, pfTestCase.class);
	
	loginPF.usernameField("admin");
	loginPF.passwordField("admin");
	loginPF.login();
	
	}
}
