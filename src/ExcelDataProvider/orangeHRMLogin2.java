package ExcelDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class orangeHRMLogin2 {
	
	WebDriver driver;
	@BeforeMethod
	
	public void OrangeHRM(String URL, String VID, String PWD) {
		System.setProperty("webdriver.chrome.driver","\"C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe\"");
		driver=new ChromeDriver();
	
	
	@Test
	@Parameters({"UID", "PWD"})
	public void OHRMLogin(String PWD, String UID) {
		
	driver.get("http://opensource.demo.orangehrmlive.com/");

	driver.findElement(By.id("txtUsername")).sendKeys("UID");
	
	driver.findElement(By.id("txtPassword")).sendKeys("PWD");

	driver.findElement(By.xpath("//input[@class='button']")).click();
	
	}
	
	@AfterMethod
	public void cleanUp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}
}
