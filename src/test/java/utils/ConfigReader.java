package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	private FileInputStream fis;

	public ConfigReader(String filePath) {

		try {
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("No file located");
		}

	}

	public String getProperty(String key) {
		String value = prop.getProperty(key);
		try {
			fis.close();
		} catch (Exception e) {
			System.out.println("No file located to close");
			e.printStackTrace();
		}
		return value;
	}

}
