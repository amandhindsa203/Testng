package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverManager.DriverManager;
import Utils.CommonMethods;

public class LoginAction {
	//page object model
	WebDriver driver;
	 CommonMethods common = new CommonMethods(DriverManager.getdriver());



	//it will pick up locator save in cache memory
	@CacheLookup
	@FindBy(id ="email")
	public WebElement userName;

	@CacheLookup
	@FindBy(id ="pass")
	public WebElement lastName;

	@CacheLookup
	@FindBy(name ="login")
	public WebElement LoginButton;

	//constructor -

	public LoginAction(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);

	}
	//public void sendKeys() {
//		common.highlightElement(userName);
	 //     userName.clear();
//		userName.sendKeys("abcd@gmail.com");
		
	 //   common.highlightElement(lastName);
//		lastName.clear();
	  //   lastName.sendKeys("abc123");
	//} 

	//optimization of method-can be reused
	public void sendkeysfield(WebElement ele , String keys) {
	common.highlightElement(ele);
	ele.clear();
	ele.sendKeys(keys);

	}


	public void click() {
		common.highlightElement(LoginButton);
		common.waitforElement(LoginButton);
		LoginButton.click();
	}

}
