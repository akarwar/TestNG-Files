package pageObjectInClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMLogin {
	
	@Test
	
	public void testLogin() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.syntaxlive.com/home/");
		
		pageClassEx loginEx = new pageClassEx(driver);
		
		loginEx.username();
		loginEx.password();
		loginEx.clickLogin();

}
