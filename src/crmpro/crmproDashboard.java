package crmpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class crmproDashboard {
	
	
	WebDriver driver;
	
	
	@FindBy(name="username") WebElement Username;
	@CacheLookup
	@FindBy (name="password") WebElement Password;
	@CacheLookup
	@FindBy(xpath=".//*[@id='loginForm']/div/div/input") WebElement Login;
	@CacheLookup
	@FindBy(xpath="//a[contains(.,'New Company')]") WebElement NewCompany;
	@FindBy(xpath="//a[@href='https://www.freecrm.com/system/index.cfm?action=home']")WebElement Home;
	@CacheLookup
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[2]/ul/li[1]/a") WebElement CalenderNewEvent;
	@CacheLookup
	@FindBy(xpath=".//*[@id='title']") WebElement EventTitle;
	@CacheLookup
	@FindBy(id="f_trigger_c_start") WebElement From;
	@FindBy(xpath="//div[@class='noprint']") WebElement EventStDate;
	@FindBy(id="f_trigger_c_end") WebElement To;
	@FindBy(xpath="//td[contains(@align,'center')]") WebElement EventEndDate;
	@FindBy(xpath=".//*[@id='appForm']/table/tbody/tr[6]/td[2]/select") WebElement Category;
	@FindBy(xpath="//option[@value='Important']") WebElement ImportantCat;
	@FindBy(xpath=".//*[@id='appForm']/table/tbody/tr[7]/td[2]/table/tbody/tr[1]/td[1]/select/option") WebElement AssignedTo;
	@FindBy(xpath=".//*[@id='appForm']/table/tbody/tr[7]/td[2]/table/tbody/tr[1]/td[2]/input") WebElement AddTo;
	@FindBy(xpath=".//*[@id='appForm']/table/tbody/tr[8]/td[2]/input[1]")WebElement Confirmation;
	@FindBy(xpath=".//*[@id='appForm']/table/tbody/tr[21]/td[2]/input") WebElement Save;
	
	
	
	public void crmproDB(WebDriver driver) {
		this.driver=driver;
	}
		
	public void username(String uname) {
			Username.sendKeys(uname);
		}
	
	public void passworid(String pwd) {
		Password.sendKeys(pwd);
	}
	
	public void login() {
		Login.click();
		
		}
	
	public void newcom() {
		NewCompany.click();
	}

	public void home() {
		if(Home.isDisplayed()) {
			System.out.println("The Home button is Present");
		}else {
			System.out.println("The Home button is not present");
		}
		
	}
	
	public void calendernewevent() {
		if(CalenderNewEvent.isDisplayed()) {
			System.out.println("The Calender Tab is Present");
		}else {
			System.out.println("The Calender Tab is not Present");
		
	}
		CalenderNewEvent.click();
		
	}
	
	public void eventTitle() {
		if(EventTitle.isDisplayed()) {
			System.out.println("The event title is present");
		}else {
			System.out.println("The event title is not present");
		}
	}
}



