package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	//going to hold fancy methods
	WebDriver driver;
	//for making Webdriver = driver Manager Drive , creating constructor
	// adding parameter- constructor overloading
	public CommonMethods(WebDriver driver) {
		this.driver = driver;
		}
	//adding more utilities
	public void waitforElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(ele));
		}
	public void jsScroll(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
	}

	public void highlightElement(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='2px solid red'", ele);
		
	}
	public void jsclick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
		
	}
}
