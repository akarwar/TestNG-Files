import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allAnnotationPrac {
	
	@ BeforeSuite
	public void beforeSuiteAnnotaion() {
		System.out.println("This is a before suite annotation");	
	}
	
	@AfterSuite
	public void afterSuiteAnnotation() {
		System.out.println("This is an after suite annotation");
	}
	
	@BeforeTest
	public void beforeTestAnnotation() {
		System.out.println("This is a before test annotation");
	}
	
	@AfterTest
	public void afterTestAnnotation() {
		System.out.println("This is an after test annotation");
	}
	
	@BeforeClass
	public void beforecClassAnnotation() {
		System.out.println("This is a before class annotation");
	}
	
	@AfterClass
	public void afterClassAnnotation() {
		System.out.println("This is an after class annotation");
	}
	
	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("This is a before method annotation");
	}
	
	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("This is an after method annotation");
	}
	
	@Test
	public void testAnnotation() {
		System.out.println("This is a test annotation");
	}
	
	@Test
	public void testAnnotation2() {
		System.out.println("This is a test annotation");
	}
	
	

}
