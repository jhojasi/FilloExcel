package com.banistmo.certification.bancolombia.userintefaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class BancolombiaProductsPage {
	
	public static final Target MASTERCARD_IDEAL_BUTTON = Target.the("Button to aply for a Mastercard Ideal card")
			.located(By.id("master-solicita-tarjeta-1"));
	
	private BancolombiaProductsPage() {}

}
