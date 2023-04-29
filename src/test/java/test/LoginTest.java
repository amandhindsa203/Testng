package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.LoginAction;

public class LoginTest extends Base {
	// create object of my action class
	LoginAction login;

	@BeforeClass(alwaysRun = true)
	public void BeforeClas() {
		login = new LoginAction(driver);
		// did constructor at class level

	}

	// annotation helps us to pass data globally
	@Parameters({ "ValidUN", "ValidPW" })

	@Test(priority = 3, groups ={"Regression"})
	public void ValidateUN(String un, String pw) {
		// Validations are Assertions
		Assert.assertTrue(login.userName.isDisplayed(), "UN field is not created or enabled");
		Assert.assertTrue(login.userName.isEnabled(), "UN field is not enabled");
		login.sendkeysfield(login.userName, un);
		Assert.assertTrue(login.lastName.isDisplayed(), "LN field is not created or enabled");
		Assert.assertTrue(login.lastName.isEnabled(), "LN field is not enabled");
		login.sendkeysfield(login.lastName, pw);
}
	@Parameters({ "inValidUN", "ValidPW" })
     @Test(priority = 4)
	public void inValidateUNValidPW(String un, String pw) {
		// Validations are Assertions
		Assert.assertTrue(login.userName.isDisplayed(), "UN field is not created or enabled");
		Assert.assertTrue(login.userName.isEnabled(), "UN field is not enabled");
		login.sendkeysfield(login.userName, un);
		Assert.assertTrue(login.lastName.isDisplayed(), "LN field is not created or enabled");
		Assert.assertTrue(login.lastName.isEnabled(), "LN field is not enabled");
		login.sendkeysfield(login.lastName, pw);
		}
	@Parameters({ "inValidUN", "inValidPW" })
    @Test(priority = 5 , groups ={"Regression"})
	public void inValidateUNinValidPW(String un, String pw) {
		// Validations are Assertions
		Assert.assertTrue(login.userName.isDisplayed(), "UN field is not created or enabled");
		Assert.assertTrue(login.userName.isEnabled(), "UN field is not enabled");
		login.sendkeysfield(login.userName, un);
		Assert.assertTrue(login.lastName.isDisplayed(), "LN field is not created or enabled");
		Assert.assertTrue(login.lastName.isEnabled(), "LN field is not enabled");
		login.sendkeysfield(login.lastName, pw);
		}
	@Parameters({ "ValidUN", "inValidPW" })
    @Test(priority = 6, groups ={"Smoke"} )
	public void ValidateUNinValidPW(String un, String pw) {
		// Validations are Assertions
		Assert.assertTrue(login.userName.isDisplayed(), "UN field is not created or enabled");
		Assert.assertTrue(login.userName.isEnabled(), "UN field is not enabled");
		login.sendkeysfield(login.userName, un);
		Assert.assertTrue(login.lastName.isDisplayed(), "LN field is not created or enabled");
		Assert.assertTrue(login.lastName.isEnabled(), "LN field is not enabled");
		login.sendkeysfield(login.lastName, pw);
		}
	
	@Test(priority = 7, groups ={"Regression"})
	public void ValidateLoginButton() {
		// Validations are Assertions
		Assert.assertTrue(login.LoginButton.isDisplayed(), "loginButton is not created or enabled");
		Assert.assertTrue(login.LoginButton.isEnabled(), "loginButton is not enabled");
		// login.sendKeys();
		login.click();
	}

}
