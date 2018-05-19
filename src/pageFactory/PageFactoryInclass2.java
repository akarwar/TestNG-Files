package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageFactoryInclass2 {
	
	@Test
	public void OHRMLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		pfTestCase loginPF = PageFactory.initElements(driver, pfTestCase.class);
		
		loginPF.username.sendKeys("admin");
		loginPF.password.sendKeys("admin");
		loginPF.login.click();
		
		
		
		
		
		
	}

}
