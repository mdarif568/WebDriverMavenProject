package day41;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//location of properties file
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\config.properties");
		
		// Loading properties file
		Properties prop = new Properties();
		prop.load(fis);
		
		// Reading data from properties file
		String url = prop.getProperty("appurl");
		String email = prop.getProperty("emailId");
		String password = prop.getProperty("password");
		
		System.out.println(url + "\n" + email + "\n" + password);
		
		// Reading all the keys from properties file (Only keys)
//		Set<String> keys = prop.stringPropertyNames();
//		System.out.println(keys); //[password, emailId, appurl]
		
		Set<Object> keys = prop.keySet();
		System.out.println(keys); //[password, emailId, appurl]
		
		
		// Reading all the values from properties file (Only values)
		Collection<Object> values = prop.values();
		System.out.println(values);
		
		fis.close();
		

	}

}
