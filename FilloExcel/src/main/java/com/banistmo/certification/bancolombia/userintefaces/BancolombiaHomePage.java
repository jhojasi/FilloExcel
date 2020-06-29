package com.banistmo.certification.bancolombia.userintefaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BancolombiaHomePage {
	
	public static final Target ENTER_SVP_BUTTON = Target.the("Button to enter the SVP")
			.located(By.id("btn-transaccional"));
	
	public static final Target APPLY_FOR_PRODUCT_BUTTON = Target.the("Button to apply for a bancolombia product")
			.located(By.id("header-solicitud-productos"));

	private BancolombiaHomePage(){}
}
