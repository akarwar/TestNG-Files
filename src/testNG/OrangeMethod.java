package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeMethod {
	
	public static WebDriver driver;
	
	//annotation
	
		@BeforeMethod
	
	public void OrangeHRM1() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		
	}
	
		@Test
	public void testOrangeHRM1 () throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(9000);
		String dashboardText = driver.findElement(By.xpath("//h1[contains(.,'Dashboard')]")).getText();
		String txtDash = "Dashboard";
		
		}
		
		@AfterMethod
		
	public void Quiter() {
			
//			driver.quit();
		}
		
		
	

}
