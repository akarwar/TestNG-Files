package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectInClass.pageClassEx;

public class pomHW9TestCase {
	
	@Test
	
	public void OHRMLogin() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		pomHW9 login = new pomHW9(driver);
		
		login.username();
		login.password();
		login.loginbutton();
		login.pimbutton();
		login.addbutton();
		login.firstname();
		login.middlename();
		login.lastname();
		login.EmpID();
		login.savebutton();
		
		
		
		
		
		
		
		
		
	}
	


}
