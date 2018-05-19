package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DateProviderExercise {
	
	
	
	@Test(dataProvider="credentials")
	public void practice(String username, String password, int age) {
		System.out.println("The username is:" +username);
		System.out.println("The password is:" +password);
		System.out.println("The age is:" +age);
	}
	
	@DataProvider(name="credentials")
	public Object[][] enterData(){
		
		Object[][] data = new Object[2][3];
		data[0][0] = "editor";
		data[0][1] = "Welcome1";
		data[0][2]= 20;
		
		data[1][0] = "admin";
		data[1][1] = "admin";
		data[1][2]= 32;
		
		
		return data;
	}
	
	
	}


