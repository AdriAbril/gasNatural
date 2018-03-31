package PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hogar {

	// Variables
	WebDriver driver;
	
	// Localizadores
	
		// navSections
		private By fNavSections = By.id("navSections");
		private By cLogoGNF = By.xpath("//img[contains(@alt,'Logo GNF')]");
	
	// Constructor
	public Hogar(WebDriver driver) {
		this.driver = driver;
	}
	
	// Métodos
	
	public boolean checkPageLoad() { // Comprueba que la página Hogar se ha cargado.
		return(this.driver.getCurrentUrl().equals("https://www.gasnaturalfenosa.es/hogar"));
	}
	
	public boolean checkElementVisible(String option) { // Se comprueba si un elemento está visible.
		boolean res = false;
		
		switch (option) {
		case "LogoGNF":
			res = this.driver.findElement(fNavSections).findElement(cLogoGNF).isDisplayed();
			break;
		default:
			break;
		}
		
		return res;
	}
	
}
