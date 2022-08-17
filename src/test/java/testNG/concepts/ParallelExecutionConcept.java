package testNG.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecutionConcept  {
	WebDriver driver;
	
	@Test
	public void testOne() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://tek-school.com/hotel/");
		System.out.println(driver.getTitle() + " This is from FF");
		
	}
	
	@Test
	public void testTwo() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tek-school.com/hotel/");
		System.out.println(driver.getTitle() + " This is from Chrome");
	}
	
	@Test
	public void testthree() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tek-school.com/hotel/");
		System.out.println(driver.getTitle() + " This is from Chrome");
	}

}
