package Inicio;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends Inicio.TestSuite {

	@SuppressWarnings("unused")
	@Test
	public void login() {
		WebDriver bender=Inicio.TestSuite.bender;
		String username=Inicio.Registro.username;
		String passw=Inicio.Registro.passw;
		
		if (bender.findElement(By.xpath("//img[@src=\"images/hdr_findflight.gif\"]")).isDisplayed()) {
			bender.findElement(By.name("userName")).sendKeys(username);
			bender.findElement(By.name("password")).sendKeys(passw);
			bender.findElement(By.name("submit")).click();
		}else {
			System.out.println("Campo nombre de usuario no fue encontrado");
		}
		
		List<WebElement> fonts = bender.findElements(By.tagName("font"));
		assertEquals("Thank you for Loggin.",fonts.get(3).getText());
		
		if (fonts != null)
			System.out.println("Login Exitoso");
		else
			System.out.println("El Login NO fue Exitoso");
	}
}
