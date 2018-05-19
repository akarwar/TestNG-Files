package pageObjectInClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pfTestCase2 {
	
	WebDriver driver;
	
	@FindBy(name = "txtUsername")WebElement username;
	@FindBy(name = "txtPassword")WebElement password;
	@FindBy(id = "btnLogin")WebElement login;
	
	public pfTestCase2 (WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void username(String UID) {
		username.sendKeys(UID);
		
	}
	
	public void password(String PWD) {
		password.sendKeys(PWD);
		
	}
	
	public void login() {
		login.click();
		
	}
	
			
	
	
	
	
	

}
