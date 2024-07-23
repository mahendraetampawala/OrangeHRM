/**
 * 
 */
package Utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author mahen
 *
 */
public class propertyFileHandler {
	static propertyFileHandler propertyHandler;
	static Properties prop=new Properties();
	
	private propertyFileHandler() {
		
	}
	
	//This method is to return the propertyFileHandler object
	
	public static propertyFileHandler getpropertyFile() {
		if(propertyHandler==null) {
			propertyHandler=new propertyFileHandler();
			
		}
		return propertyHandler;
	}
	
	//This method is to load the property file
	
	public static void loadPropertyFile(String path) throws FileNotFoundException, IOException {
		System.out.println("Property file loaded");
		prop.load(new FileInputStream(path));
		
	}
	
	//This method is to read the property file
	
	public static String readProperty(String key) {
		return prop.getProperty(key);
	}
	
	//This method is used to write the property file.
	
	public static void writeProperty(String key, String value) {
		prop.setProperty(key, value);
		
	}
}
