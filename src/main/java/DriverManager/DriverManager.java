package DriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	//driver , browser,method of handling webdriver
	
	public static WebDriver driver;
		// Import webdriver from selenium which provide interface to write test cases
		//interface to automate all actions that we do manually	
			// we are using this interface by creating its object
			//driver is assistant , we can call driver to do all actions
			//Copy drivers from automation folder to driver folder in project help .exe files 
		// to commute with local browser(machine)
	
	public void setup(String browser , String url) {

			String path = System.getProperty("user.dir");
			System.out.println(path);
			 //to get the path
		// help me to get directory of exe files in (driver folder)
				  //then tell the driver to launch the browser
			//browser is a string value
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", path+"\\driver\\chromedriver.exe");
				 // here we set path as chrome driver
				 
				 driver= new ChromeDriver();
				 System.out.println("This is chrome driver " +   browser);
				 // telling my assistant driver to call chrome driver
				 //here chromedriver is class in selenium
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", path+"\\driver\\geckodriver.exe");
				 
				 driver= new FirefoxDriver();
	              System.out.println("this is firefox driver" + browser);
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", path+"\\driver\\msedgedriver.exe");
				 
				 driver= new EdgeDriver();
				  System.out.println("this is edge driver" +  browser);
			} else {
				System.out.println("not expected browser"  +  browser);

			}
			//Maximize 
					driver.manage().window().maximize();
					
			if (url!="") {
				driver.get(url);
				System.out.println("this is launched url>>"+  url);
			} else {
	          driver.get("about:blank");
			}
			//implicitwait-global level or explicit wait-element level
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
			
		
	}
		 public void teardown() {
			 //driver.close();
			 driver.quit();
			 
		 }
		public static WebDriver getdriver() {
			
			
		return driver;	
		}
		
}
