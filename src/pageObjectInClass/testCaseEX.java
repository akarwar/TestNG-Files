package pageObjectInClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCaseEX {
	@Test
	
	public void testLogin() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		pageClassEx loginEx = new pageClassEx(driver);
		
		loginEx.username();
		loginEx.password();
		loginEx.clickLogin();
		loginEx.Recruitment();
		loginEx.addButton();
		loginEx.firstnameField();
		loginEx.middlenameField();
		loginEx.lastnameField();
		loginEx.emailField();
		loginEx.contactNo();
		loginEx.saveButton();
		
		
		
//		logout();
//		
//		loginEx.username("editor");
//		loginEx.password("Welcome1");
//		loginEx.clickLogin();
//		
		
		
		
		
	}

}
