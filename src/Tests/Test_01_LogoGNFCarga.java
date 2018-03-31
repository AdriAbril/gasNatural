package Tests;

import org.openqa.selenium.WebDriver;

import PO.Hogar;
import PO.Common.BaseTest;

public class Test_01_LogoGNFCarga {

	// Variables
	private static BaseTest base;
	private static WebDriver driver;
	private static String url = "HOGAR";
	private static Hogar hogar;
	private static String LogoGNF = "LogoGNF";
	
	public static void main(String[] args) {
		
		base = new BaseTest();
		driver = base.setUpFirefox();
		base.openUrl(url);
		hogar = new Hogar(driver);
		
		try {
			
			// Se comprueba que la página ha cargado
			if(hogar.checkPageLoad())
				System.out.println("Se ha navegado a la página Home (principal) de Gas Natural");
			else
				System.out.println("No se ha podido navegar a la página Home (principal) de Gas Natural");
			
			// Se comprueba que el logo Gas Natural Fenosa está visible.
			if(hogar.checkElementVisible(LogoGNF))
				System.out.println("El logo 'Gas Natural Fenosa' está visible");
			else
				System.out.println("El logo 'Gas Natural Fenosa' no está visible");
			
		} 
		catch (Exception e) {
			System.out.println("Ha surgido un error:");
			e.printStackTrace();
		} 
		finally {
			try {
				System.out.println("El navegador se ha cerrado con éxito.");
				base.tearDown();
			} catch (Exception e2) {
				System.out.println("El navegador no se ha podido cerrar.");
			}
		}
		
	}

}
