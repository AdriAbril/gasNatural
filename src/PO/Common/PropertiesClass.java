package PO.Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	// Variables
	Properties prop;
	File file;
	
	// Constructor
	public PropertiesClass() {
		this.prop = new Properties();
	}
	
	// M�todos
	
	public Properties loadPropertieFile(String option) {
		
		switch (option) { // Seg�n la opci�n pasada por par�metro, se cargar� el archivo propertie indicado.
		case "urls":
			this.file = new File("C:/Users/sobremesa/Desktop/Testing/Properties/urls.properties");
			break;
		default:
			break;
		}
		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(this.file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}	
}
