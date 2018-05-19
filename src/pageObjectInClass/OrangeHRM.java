package pageObjectInClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM {
	
	WebDriver driver;
	By usernameField = By.id("txtUsername");
	By passwordField = By.id("txtPassword");
	By loginButton = By.name("Submit");

	
	

	this.driver = driver;
		
	
	public void username() {
		
		driver.findElement(usernameField).sendKeys("admin");
		
	}
	
	public void password() {
		driver.findElement(passwordField).sendKeys("admin");
		
	}
	
	public void clickLogin() {
		
		driver.findElement(loginButton).click();
		
	}
		

}
