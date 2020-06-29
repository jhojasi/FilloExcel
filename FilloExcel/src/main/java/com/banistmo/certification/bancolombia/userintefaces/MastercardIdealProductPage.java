package com.banistmo.certification.bancolombia.userintefaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class MastercardIdealProductPage {
	
	public static final Target CONTINUE_BUTTON = Target.the("Button to continue the process")
			.locatedBy("//a[@class='btn button-primary']");
	
	public static final Target LOADING_BANNER = Target.the("Banner for loading the page")
			.locatedBy("//div[@class='col-12 load-resource']");
	
	public static final Target DOCUMENT_TYPE_OPTION = Target.the("Option to select the document type")
			.locatedBy("(//div[@class='mat-form-field-infix'])[1]");
	
//	public static final Target DOCUMENT_TYPE = Target.the("Selecti the document type")
//			.locatedBy("//span[text()='{0}']");
	public static final Target DOCUMENT_TYPE = Target.the("Select the document type")
			.locatedBy("(//span[@class='mat-option-text'])[1]");
	
	public static final Target DOCUMENT_NUMBER_TXT = Target.the("Textbox for the document number")
			.located(By.id("numeroDocumento"));
	
	public static final Target CELLPHONE_TXT = Target.the("Textbox for teh cellphone number")
			.located(By.id("numeroCelular"));
	
	public static final Target EMAIL_TXT = Target.the("Textbox for the email")
			.located(By.id("correoElectronico"));
	
	public static final Target TERMS_CHECKBOX = Target.the("Checkbox for the terms and conditions")
			.located(By.id("habeasData"));
	
	private MastercardIdealProductPage() {}

}
