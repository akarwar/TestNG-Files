package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pomHW9 {
	
	WebDriver driver;
	
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By loginbutton = By.id("btnLogin");
	By pimbutton = By.id("menu_pim_viewPimModule");
	By addbutton = By.id("btnAdd");
	By firstname = By.id("firstName");
	By middlename = By.id("middleName");
	By lastname = By.id("lastName");
	By empid = By.id("employeeId");
	By savebuttton = By.id("btnSave");
	
	public pomHW9 (WebDriver driver) {
		this.driver = driver;
				
	}
	
	public void username() {
		driver.findElement(username).sendKeys("admin");
		
	}
	
	public void password() {
		driver.findElement(password).sendKeys("admin");
		
	}
	
	public void loginbutton() {
		driver.findElement(loginbutton).click();
		
	}
	
	public void pimbutton() {
		driver.findElement(pimbutton).click();
		
	}
	
	public void addbutton() {
		driver.findElement(addbutton).click();
		
	}
	
	public void firstname() {
		driver.findElement(firstname).sendKeys("Ahmad");
		
	}
	
	public void middlename() {
		driver.findElement(middlename).sendKeys("Roman");
		
	}
		
	public void lastname() {
		driver.findElement(lastname).sendKeys("Rahmani");
		
	}
	
	public void EmpID() {
		driver.findElement(empid).sendKeys("1234");
	}
	
	public void savebutton() {
		driver.findElement(savebuttton).click();
	}

}
