package pageObjectInClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageClassEx {
	WebDriver driver;

	By usernameField = By.id("txtUsername");
	By passwordField = By.id("txtPassword");
	By loginButton = By.name("Submit");
	By recruitment = By.id("menu_recruitment_viewRecruitmentModule");
	By addButton = By.id("btnAdd");
	By firstnameField = By.id("addCandidate_firstName");
	By middlenameField = By.id("addCandidate_middleName");
	By lastnameField = By.id("addCandidate_lastName");
	By emailField = By.id("addCandidate_email");
	By contactNo = By.id("addCandidate_contactNo");
	By saveButton = By.id("btnSave");

	/*
	 * the below pice of code is constructor constructor does not return a value it
	 * has the same as the class name
	 */

	public pageClassEx(WebDriver driver) {
		this.driver = driver;
	}

	public void username() {
		driver.findElement(usernameField).sendKeys("admin");
	}

	public void password() {
		driver.findElement(passwordField).sendKeys("admin");
	}

	public void clickLogin() {

		driver.findElement(loginButton).click();
	}

	public void Recruitment() {
		driver.findElement(recruitment).click();
	}

	public void addButton() {
		driver.findElement(addButton).click();
	}

	public void firstnameField() {
		driver.findElement(firstnameField).sendKeys("James");
	}

	public void middlenameField() {
		driver.findElement(middlenameField).sendKeys("Kean");
	}

	public void lastnameField() {
		driver.findElement(lastnameField).sendKeys("Weeks");
	}

	public void emailField() {
		driver.findElement(emailField).sendKeys("james.k.week@gmail.com");
	}

	public void contactNo() {
		driver.findElement(contactNo).sendKeys("571000-1200");
	}

	public void saveButton() {
		driver.findElement(saveButton).click();
	}
}
