package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pfTestCase {
	WebDriver driver;
	@FindBy(name = "txtUsername")WebElement username;
	@FindBy(how = How.ID,using="txtPassword")WebElement password;
	@FindBy(how = How.NAME,using="Submit")WebElement login;
	
	public pfTestCase(WebDriver driver) {
		this.driver=driver;
	}
	
	public void usernameField(String uid) {
		username.sendKeys(uid);
	}
	
	public void passwordField(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void login() {
		login.click();
		
	}
	
	
	

}
