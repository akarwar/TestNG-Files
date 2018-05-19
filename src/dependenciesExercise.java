import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependenciesExercise {
	
	WebDriver driver;
	
	public void startBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/assele4ka/Desktop/Selenium/Drivers/chromedriver");
		driver=new ChromeDriver();
		driver.get("http:");
		
		
	}

}
