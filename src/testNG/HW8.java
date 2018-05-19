package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HW8 {

	public static WebDriver driver;

	// annotation

	@Test
	public void amazon() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://amazon.com");

	}

	
	
	@Test
	public void Amazonsearch() throws InterruptedException {
		
		String tt = driver.getTitle();
		String Text = "amazon.com: online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		Assert.assertEquals(tt, Text);
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotapsearchtextbox")).sendKeys("ipad");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		Thread.sleep(4000);
		
	}
		
	@Test
	public void DropDown() throws InterruptedException {
		
		Select drpsort = new Select(driver.findElement(By.id("sort")));
		drpsort.selectByVisibleText("Newest Arrivals");
		Thread.sleep(3000);
		
	}
		
	@Test
	public void Quiter() throws InterruptedException {
			driver.quit();
		
		
	}	
		
	}


