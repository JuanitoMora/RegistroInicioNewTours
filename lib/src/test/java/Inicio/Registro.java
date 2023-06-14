package Inicio;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registro extends Inicio.TestSuite {

	public static String username = "juanchete";
	public static String passw = "juan12345";

	@SuppressWarnings("unused")
	@Test
	public void registro() {
		WebDriver bender = Inicio.TestSuite.bender;

		bender.findElement(By.linkText("REGISTER")).click();
		if (bender.findElement(By.xpath("//img[@src=\"images/mast_register.gif\"]")).isDisplayed()) {
			bender.findElement(By.name("firstName")).sendKeys("Juan");
			bender.findElement(By.name("lastName")).sendKeys("Mora");
			bender.findElement(By.name("phone")).sendKeys("7725689");
			bender.findElement(By.name("userName")).sendKeys("juanito@yahoo.es");
			bender.findElement(By.name("address1")).sendKeys("Cll 72#8-20");
			bender.findElement(By.name("city")).sendKeys("Bogota");
			bender.findElement(By.name("state")).sendKeys("Cundinamarca");
			bender.findElement(By.name("postalCode")).sendKeys("571");
			Select listaCountry = new Select(bender.findElement(By.name("country")));
			listaCountry.selectByValue("COLOMBIA");
			bender.findElement(By.name("email")).sendKeys(username);
			bender.findElement(By.name("password")).sendKeys(passw);
			bender.findElement(By.name("confirmPassword")).sendKeys(passw);
			bender.findElement(By.name("submit")).click();
		} else {
			System.out.println("Campo primer nombre no fue encontrado");
		}

		List<WebElement> fonts = bender.findElements(By.tagName("font"));
		assertEquals("Note: Your user name is juanchete.", fonts.get(5).getText());
		
		if (fonts != null)
			System.out.println("Registro Exitoso");
		else
			System.out.println("El Registro NO fue Exitoso");
	}
}
