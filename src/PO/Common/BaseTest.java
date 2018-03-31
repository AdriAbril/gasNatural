package PO.Common;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	// Variables
	WebDriver driver;
	PropertiesClass prop;
	
	// Constructor
	public BaseTest() {
	}
	
	// Métodos
	
	public WebDriver setUpFirefox() { // Se encarga de abrir el navegador firefox y devuelve el driver ya definido.
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sobremesa\\Desktop\\Testing\\Drivers\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		return this.driver;
	}
	
	public void openUrl(String url) { // Se navega a la url indicada
		PropertiesClass propClass = new PropertiesClass();
		Properties prop = propClass.loadPropertieFile("urls");
		this.driver.get(prop.getProperty(url));
	}
	
	public void tearDown() {
		this.driver.quit();
	}
	
}
