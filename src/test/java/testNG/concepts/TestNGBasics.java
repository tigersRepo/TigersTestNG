package testNG.concepts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("this block of code executes only before first test case.");
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("this block of code executes only after last test case. ");
	}
	
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this block of code runs before each test case");
	}
	
	
	@Test  (groups = {"smokeTest"})
	public void test() {
		Assert.assertTrue(true);
		System.out.println("this is test");
	}
	
	@Test(dependsOnMethods = "test")
	public void testTwo() {
		System.out.println("this is test two");
	}
	
	@Test(priority = 4, enabled = false)
	public void testThree() {
		System.out.println("this is test Three");
	}
	
	@Test 
	@Ignore
	public void testFour() {
		System.out.println("this is test Four");
	}
	
	@Test (groups = {"smokeTest"})
	public void testFive() {
		System.out.println("this is test Five");
	}
	
	@AfterMethod()
	public void afterMethod() {
		System.out.println("this block of code runs after each test case");
	}

}
