package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginValidations extends Base {
  
	@Test (priority = 1)
  public void ValidateTitle() {
	  
	  String ActualTitle = driver.getTitle();
	   String ExpectedTitle ="Facebook - log in or sign up";
	   Assert.assertTrue(ActualTitle.contains(ExpectedTitle), "Not Expected"+ ActualTitle);
	   }
	 	
	 	@Test
	   public void ValidateUrl() {
	   
	  String ActualUrl = driver.getCurrentUrl();
	   String ExpectedUrl ="https://www.facebook.com/";
	   Assert.assertTrue(ActualUrl.contains(ExpectedUrl), "Url not as launched>>"  +  ActualUrl);
	   }

}
