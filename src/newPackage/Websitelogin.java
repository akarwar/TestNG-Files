package newPackage;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Websitelogin {
	
	@Test
	public void startApp() {
		System.out.println("Stating app.....");
	}
	
	@SuppressWarnings("deprecation")
	@Test (dependsOnMethods="startApp")
	public void logingApp() {
	Assert.assertEquals(12, 13);
	System.out.println("loggedin.....");
	}
	
	@Test (dependsOnMethods="loginApp")
	public void logoutApp() {
		System.out.println("Logged out...");
	}
}
