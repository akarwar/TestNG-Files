package testBase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginApp extends base{
	
	@Test
public void login() {
		driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("editor");
	}

}
