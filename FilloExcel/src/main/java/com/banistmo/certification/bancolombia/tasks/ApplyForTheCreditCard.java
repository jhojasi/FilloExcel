package com.banistmo.certification.bancolombia.tasks;

import static com.banistmo.certification.bancolombia.userintefaces.BancolombiaHomePage.APPLY_FOR_PRODUCT_BUTTON;
import static com.banistmo.certification.bancolombia.userintefaces.BancolombiaProductsPage.MASTERCARD_IDEAL_BUTTON;
import static com.banistmo.certification.bancolombia.userintefaces.MastercardIdealProductPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.List;
import java.util.Map;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ApplyForTheCreditCard implements Task{
	
	private List<Map<String, String>> dataTable;
	
	public ApplyForTheCreditCard(List<Map<String, String>> dataTable) {
		this.dataTable = dataTable;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(APPLY_FOR_PRODUCT_BUTTON),
				Click.on(MASTERCARD_IDEAL_BUTTON),
				Click.on(CONTINUE_BUTTON),
				WaitUntil.the(LOADING_BANNER, isVisible()),
				WaitUntil.the(LOADING_BANNER, isNotVisible()),
				Click.on(DOCUMENT_TYPE_OPTION),
				//Click.on(DOCUMENT_TYPE.of(dataTable.get(0).get("idType"))),
				Click.on(DOCUMENT_TYPE),
				Enter.theValue(dataTable.get(0).get("idNumber")).into(DOCUMENT_NUMBER_TXT),
				Enter.theValue(dataTable.get(0).get("cellphone")).into(CELLPHONE_TXT),
				Enter.theValue(dataTable.get(0).get("email")).into(EMAIL_TXT),
				Click.on(TERMS_CHECKBOX));
	}

	public static ApplyForTheCreditCard masterCardIdeal(List<Map<String, String>> dataTable) {
		return Tasks.instrumented(ApplyForTheCreditCard.class, dataTable);
	}
}
