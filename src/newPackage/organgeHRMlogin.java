package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class organgeHRMlogin {
	
@Test
@Parameters ({"username","password", "firstname","lastname","email"})

public void browser (String username, String password, String firstname, String lastname, String email) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.id("addCandidate_firstName")).sendKeys(firstname);
	driver.findElement(By.id("addCandidate_lastName")).sendKeys(lastname);
	driver.findElement(By.id("addCandidate_email")).sendKeys(email);
	driver.findElement(By.id("btnSave")).click();
	
}


	


}
