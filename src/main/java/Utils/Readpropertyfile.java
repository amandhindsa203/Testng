package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readpropertyfile {
// read property file , where it is saved
//global variable private in nature so that under classes cannnot access it
	String filename ="C:\\Automation\\WorkSpace\\Testng\\config.properties";
	
	private Properties prop;

public Properties readProperties() {
	prop = new Properties();
	//finding file
	try {
		FileInputStream file = new FileInputStream(filename);
	prop.load(file);// loading file
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return prop;
}


}
