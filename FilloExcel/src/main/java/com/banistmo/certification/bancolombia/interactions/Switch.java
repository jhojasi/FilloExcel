package com.banistmo.certification.bancolombia.interactions;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Switch implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		WebDriver driver = BrowseTheWeb.as(actor).getDriver();
		Set<String> listapantalla = driver.getWindowHandles();
		for (String pantalla : listapantalla) {
			driver.switchTo().window(pantalla);
		}
	}
	
	public static Switch toNewWindow() {
		return Tasks.instrumented(Switch.class);
	}
}
