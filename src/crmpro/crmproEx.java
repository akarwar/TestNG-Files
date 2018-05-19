package crmpro;

import java.awt.Taskbar.Feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class crmproEx {
			
		WebDriver driver;
				
		@CacheLookup
		@FindBy(xpath="html/body/div[2]/div/div[1]/a/img") WebElement Logo;
		@CacheLookup
		@FindBy(name="username") WebElement Username;
		@CacheLookup
		@FindBy(name="password") WebElement Password;
		@CacheLookup
		@FindBy(xpath=".//*[@id='loginForm']/div/div/input") WebElement Login;
		@CacheLookup
		@FindBy(xpath="html/body/div[2]/div/a[1]/small") WebElement Forgotpassword;
		@CacheLookup
		@FindBy(xpath="html/body/div[2]/div/a[2]/button") WebElement SignUp;
		@FindBy(xpath=".//*[@id='navbar-collapse']/ul/li[1]/a") WebElement Features;
		@FindBy(xpath=".//*[@id='navbar-collapse']/ul/li[3]/a") WebElement Pricing;
		@FindBy(xpath=".//*[@id='navbar-collapse']/ul/li[4]/a") WebElement Customers;
		@FindBy(xpath=".//*[@id='navbar-collapse']/ul/li[5]/a") WebElement Contact;
		@FindBy(xpath=".//*[@id='navbar-collapse']") WebElement Header;
		@FindBy(xpath=".//*[@id='footer']") WebElement Footer;
		
		public crmproEx (WebDriver driver) {
			
			this.driver=driver;
		}
		
		public void logo() {
			if(Logo.isDisplayed()) {
				
				System.out.println("The Logo is Present");
			}else {
				System.out.println("The Logo is not Present");
				
			}
		}
		
		public void username(String uname) {
			if(Username.isDisplayed()) {
				System.out.println("The Username Field is Present");
			}else {
				System.out.println("The Username Field is not Present");
				
			}
			Username.sendKeys(uname);
		}
		
		public void passworid(String pwd) {
			if(Password.isDisplayed()) {
				System.out.println("The Password is Correct");
			}else {
				System.out.println("The Password is not Correct");
			}
			Password.sendKeys(pwd);
			
		}
		
		public void login() {
			if(Login.isDisplayed()) {
				System.out.println("The Login button is Present");
			}else {
				System.out.println("The login button is not Present");
			}
			
			Login.click();
			
		}
		
		
		
		public void forgotpassword() {
			if(Forgotpassword.isDisplayed()) {
				System.out.println("The forgot password link is displayed");
			}else {
				System.out.println("The forgot passowrd link is not displayed");
			}
		}
		
		public void signup() {
			if(SignUp.isDisplayed()) {
				System.out.println("The SignUp Button is Present");
			}else {
				System.out.println("The SignUp Button is not Present");
			}
		}
		
		public void features() {
			if(Features.isDisplayed()) {
				System.out.println("The Features Button is present");
			}else {
				System.out.println("The Features Button is not Present");
			}
		}
		
		public void pricing() {
			if(Pricing.isDisplayed()) {
				System.out.println("The Pricing Button is Present");
			}else {
				System.out.println("The Pricing Button is not Present");
			}
		}
		
		public void customer() {
			if(Customers.isDisplayed()) {
				System.out.println("The Customers Button is Present");
			}else {
				System.out.println("Thre Customers Button is not Present");
			}
		}
		
		public void contact() {
			if(Contact.isDisplayed()) {
				System.out.println("The Contact Button is Present");
			}else {
				System.out.println("The Contact Button is not Present");
			}
		}
		
		public void header() {
			if(Header.isDisplayed()) {
				System.out.println("The Header is Present");
			}else {
				System.out.println("The Header is not Present");
			}
		}
		
		public void footer() {
			if(Footer.isDisplayed()) {
				System.out.println("The Footer is Display");
			}else {
				System.out.println("The Footer is not Display");
			}
		}
			
			
		
				
		
		
		
		
		
		
	
		
	}
	
	


