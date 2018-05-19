package testNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class helloOne {

	@BeforeSuite
	public void beforeSuiteAnnotaion() {

		System.out.println("This is a Before Suite Annotation");
	}

	@AfterSuite
	public void afterSuiteAnnotation() {
		System.out.println("This is an After Suite Annotation");

	}

	@BeforeClass

	public void beforeClassAnnotaion() {
		System.out.println("This is a Before Class Annotation");

	}

	@AfterClass
	public void afterClassAnnotation() {
		System.out.println("This is an After Class Annotation");

	}

	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("This is a Before Method Annotation");
	}

	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("This is an After Method Annotation");
	}

	@Test

	public void TestAnnotation() {
		System.out.println("This is test Annotation");
	}

}
