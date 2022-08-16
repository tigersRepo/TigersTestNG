package testNG.concepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersConcept {
	
	
	
	@Test
	@Parameters({"valueA", "valueB"})
	public void test(int a , int b) {
		
		int sum = a+b;
		System.out.println(sum);
		
	}
	

}
