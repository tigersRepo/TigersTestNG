package testNG.concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class DataProviderConcept {

	@Test(dataProvider = "signInData")
	public void test(String email, String password, String state, String time, String month) {
		System.out.println("This is Email " + email);
		System.out.println("This is Password "+ password);
		System.out.println("This is state "+ state);
		System.out.println("This is time "+ time);
		System.out.println("This is month "+ month);

	}

	@DataProvider(name = "signInData")
	public Object[][] data() {

		Object[][] getData = ExcelUtility.getExcelData("info");
		return getData;

	}

}
