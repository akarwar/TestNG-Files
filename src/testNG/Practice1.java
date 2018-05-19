package testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;



public class Practice1 {
	
	// annotation
	
	@Test(priority=1)
	public void bProgram( ) {
		System.out.println("This is a B method");
	}
	
	@Test(priority=2)
	public void aprogram() {
		System.out.println("This is an A method");
	}
	
	@Test(priority=3)
	public void cprogram() {
		System.out.println("This is a C method");
		
		Assert.assertEquals(12,13);
		
	

	}
	

}
