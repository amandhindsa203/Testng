package test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import DriverManager.DriverManager;
import Utils.Readpropertyfile;

public class Base {
	WebDriver driver;
	DriverManager dm = new DriverManager();
  Readpropertyfile prop;
  Properties property;
  
 /* @BeforeClass(alwaysRun = true)
  public void beforeSuite() {
	  //this is going to run pre req before running suite like launch
	 prop = new Readpropertyfile();
	 
 property = prop.readProperties();
	  dm.setup( property.getProperty("browser"), property.getProperty("url"));
	  
	  driver = DriverManager.getdriver();
	  }*/
  @Parameters({"browser","url"})
  @BeforeClass(alwaysRun = true)
  public void beforeSuite(String browser ,String url) {
	  //this is going to run pre req before running suite like launch
	;
	  dm.setup(browser ,url);
	  
	  driver = DriverManager.getdriver();
	  }
  
  @AfterClass
  public void afterSuite() {
	  dm.teardown();
	  }
     @BeforeMethod
     public void beforeMethod() {
    	 System.out.println("this will be excuted before any method by default");
     }
      
}
