/**
 * 
 */
package org.Utility;
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void getProperties() {
		//Properties data=new Properties();
		try {
			Properties data=new Properties();
			InputStream input=new FileInputStream("src/test/resources/TestData/data.properties");
			try {
				data.load(input);
				System.out.println(data.getProperty("browser"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		} 
	}
	
}
