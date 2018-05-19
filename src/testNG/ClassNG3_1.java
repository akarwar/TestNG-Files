package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassNG3_1 {
	
	public static WebDriver driver;
	
	//annotation
	@BeforeMethod
	public void ClassNGmethod() {
		
		System.setProperty("webdriver.chome.driver", "C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
				
	}
	
	@Test
	public void testGoogle() {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("synax technologies....");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();

	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}

}
