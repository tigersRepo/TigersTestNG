package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DriverUtility  extends Base{
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void enterValue(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public static void denyAlert() {
		driver.switchTo().alert().dismiss();
	}

	public static void wait(int milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean isElementDisplayed(WebElement element) {
		if (element.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public static boolean isElementEnabled(WebElement element) {
		if (element.isEnabled()) {
			return true;
		} else
			return false;
	}

	public static void moveToElementAction(WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();

	}

	public static void scrollToElementAction(WebElement ele) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);

	}

	public static void switchToWindow() {

		Set<String> WindowsHandles = driver.getWindowHandles();
		Iterator<String> it = WindowsHandles.iterator();

		String window = it.next();
		driver.switchTo().window(window);

	}

	public static void clearTextUsingSendKeys(WebElement ele) {
		ele.sendKeys(Keys.CONTROL + "a");
		ele.sendKeys(Keys.DELETE);

	}

	public static void clearText(WebElement ele) {
		ele.clear();

	}

	public static void scrollPageDownWithJS() {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	// click on element using JSExeutor

	public static void clickElementWithJS(WebElement element) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

	// sendKeys using JSExecutor
	// we can use SendKeys with JSExecutor if WebElement has either one of ID, Name,
	// or Class attributes

	public static void sendKeysWithJS(String element, String value) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementById('" + element + "').value='" + value + "'");

	}

	// how to select calendar date using JS Executor

	public static void selectCalendarDateWithJS(String date, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + date + "');", element);

	}

	public static String getText(WebElement ele) {
		String ElementText = ele.getText();
		return ElementText;
	}

	public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement);

	}

	public static String screenShotFileName() {
		Date date = new Date();
		String screenShotName = date.toString().replace(":", "_").replace(" ", "_") + ".png";
		return screenShotName;

	}

	public static void screenShot() {

		String location = System.getProperty("user.dir") + "\\screenshot\\";
		String screenShotFileName = screenShotFileName();

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File(location + screenShotFileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in execution");
		}
	}
	

}
