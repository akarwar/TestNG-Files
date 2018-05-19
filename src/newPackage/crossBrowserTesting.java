package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	
	@Test
	@Parameters("browser")
	public void verifyPage(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ahsan\\Documents\\Drivers\\geckodriver-v0.20.1-win32\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://opensource.demo.orangehrmlive.com/");
		} else {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe\\");
			WebDriver driver=new ChromeDriver();
			driver.get("http://opensource.demo.orangehrmlive.com/");
			
			
			driver.findElement(By.id("txtUsername")).sendKeys("admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin");
			driver.findElement(By.name("Submit")).click();
		}
	}
	
}
