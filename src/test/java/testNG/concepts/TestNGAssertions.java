package testNG.concepts;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {
	
	
	/**
	 * In TestNG we have to two types of assertions 
	 * Assertion: is a process of validating expected vs actual value. 
	 * - Hard Assertion:
	 * Syntax: Assert.AssertType(actual value, Expected Value);
	 * IF actual and expected does not match, the execution will stop and it will not 
	 * execute next line of code. 
	 * - Soft Assertion
	 * Syntax: SoftAssert <nameOfObject> = new SoftAssert();
	 * 		nameOfObject.methods()
	 * If actual and expected does not match, the execution will continue till end of block of code
	 * but at the end the test case will mark failed. 
	 */
	
	@Test
	@Ignore
	public void hardAssertion() {
		System.out.println("this is before assertion");
		Assert.assertEquals(1,2);
		System.out.println("this is after assertion");
	}
	
	@Test
	public void softAssertion() {
		SoftAssert assertions = new SoftAssert();
		assertions.assertTrue(false);
		System.out.println("this is after first assertion");
		assertions.assertEquals(1, 5);
		System.out.println("this is after second assertion");
		assertions.assertEquals(true, false);
		System.out.println("this is after 3rd assertion");
		assertions.assertAll();
		
	}
	

}
