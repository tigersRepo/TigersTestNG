package testNG.concepts;

import org.testng.annotations.Test;

public class TestNGGroups {
	
	
	
	@Test
	public void testOne() {
		System.out.println("");
	}
	
	@Test
	public void testTwo() {
		System.out.println("");
	}
	
	@Test(groups = {"creditCard"})
	public void testThree() {
		System.out.println("");
	}
	@Test
	public void testFour() {
		System.out.println("");
	}
	
	@Test(groups = {"functional"})
	public void testFive() {
		System.out.println("");
	}
	
	@Test(groups = {"functional"})
	public void testSix() {
		System.out.println("");
	}
	
	

}
