package testNG;

import org.testng.annotations.Test;

public class testNGpractice {
	
	//annotaton

	@Test
	
	public void sum() {
		int a = 10;
		int b = 5;
		int c = a+b;
		System.out.println("Sum of a plus b is: " + c);
		
		
	}

	@Test
	public void subtruct() {
		
		int a = 10;
		
		int b = 5;
		int c = a-b;
		System.out.println("Sum of a - b is: " + c);
	}
}
