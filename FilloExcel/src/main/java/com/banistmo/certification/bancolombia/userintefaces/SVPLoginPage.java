package com.banistmo.certification.bancolombia.userintefaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SVPLoginPage {
	
	public static final Target SVP_LOGIN_TXT = Target.the("Username Textbox for SVP login")
			.located(By.id("username"));
	
	public static final Target CONTINUE_BUTTON = Target.the("Button to continue login")
			.located(By.id("btnGo"));
	
	public static final Target NUMBER_BUTTON = Target.the("Buttons for the pin password")
			.locatedBy("//div[text()='{0}']");
	
	public static final Target HEADER = Target.the("Header with text")
			.located(By.id("header"));
	
	public static final Target ERROR_HEADER = Target.the("Header with error text")
			.located(By.className("errorTitulo"));
	
	private SVPLoginPage() {}

}
