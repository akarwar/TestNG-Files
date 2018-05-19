import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGPrac4 {
	WebDriver driver;
	
	
	@Test
	public void invokeBrowser
	
	System.setproperty (webdriver.chomedriver---------)
	driver.get(reg.ebay.com/reg/partialreg");
	driver.manage().deleteAllCookies();
	
}
	@DataProvider (name = "login")
	public Object [][] someTest () {
		Object [][] someTest = new Object[1][4];
		
		Object [][] someTest = new Object [1][4];
		someTest [0][0] = "Moldir";
		someTest [0][1] = "Myrza";
		someTest [0][2] = "mail@gmail.com";
		someTest [0][3] = "abc";
		return data;
		
		@Test (dataProvider = "login") dependsOnMethod = ""
		public void loginWithProvider (String firstname, String lastname, String email, String password) {
		driver.findElement(By.name("firstname")).sendKey("firstname");
		driver.findElement(By.name("lastname")).sendKey(lastname);
		driver.findElement(By.id("suggestion")).sendKey("email");
		iver.findElement(By.name("password")).sendKey("password");
	}

}
