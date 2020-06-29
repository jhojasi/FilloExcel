package com.banistmo.certification.bancolombia.tasks;

import static com.banistmo.certification.bancolombia.userintefaces.BancolombiaHomePage.APPLY_FOR_PRODUCT_BUTTON;
import static com.banistmo.certification.bancolombia.userintefaces.BancolombiaProductsPage.MASTERCARD_IDEAL_BUTTON;
import static com.banistmo.certification.bancolombia.userintefaces.MastercardIdealProductPage.CELLPHONE_TXT;
import static com.banistmo.certification.bancolombia.userintefaces.MastercardIdealProductPage.CONTINUE_BUTTON;
import static com.banistmo.certification.bancolombia.userintefaces.MastercardIdealProductPage.DOCUMENT_NUMBER_TXT;
import static com.banistmo.certification.bancolombia.userintefaces.MastercardIdealProductPage.DOCUMENT_TYPE;
import static com.banistmo.certification.bancolombia.userintefaces.MastercardIdealProductPage.DOCUMENT_TYPE_OPTION;
import static com.banistmo.certification.bancolombia.userintefaces.MastercardIdealProductPage.EMAIL_TXT;
import static com.banistmo.certification.bancolombia.userintefaces.MastercardIdealProductPage.LOADING_BANNER;
import static com.banistmo.certification.bancolombia.userintefaces.MastercardIdealProductPage.TERMS_CHECKBOX;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.ArrayList;

import com.banistmo.certification.bancolombia.integrations.FilloManager;

import com.banistmo.certification.bancolombia.userintefaces.MastercardIdealProductPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.HitTarget;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyForTheCreditCardFillo implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		ArrayList<String> data = FilloManager.getData();
		actor.attemptsTo(Click.on(APPLY_FOR_PRODUCT_BUTTON),
				Click.on(MASTERCARD_IDEAL_BUTTON),
				Click.on(CONTINUE_BUTTON),
				WaitUntil.the(LOADING_BANNER, isVisible()),
				WaitUntil.the(LOADING_BANNER, isNotVisible()),
				Click.on(DOCUMENT_TYPE_OPTION),
				//Click.on(DOCUMENT_TYPE.of(dataTable.get(0).get("idType"))),
				Click.on(DOCUMENT_TYPE),
				//Enter.theValue(FilloManager.getData().get(1)).into(DOCUMENT_NUMBER_TXT),
				Enter.theValue(data.get(1)).into(DOCUMENT_NUMBER_TXT),
				Enter.theValue(data.get(2)).into(CELLPHONE_TXT),

		
		WebElement element = driver.findElement(By.id("")).sendKeys(Keys.TAB),

				Enter.theValue(data.get(3)).into(EMAIL_TXT),
				Click.on(TERMS_CHECKBOX));
	}

	public static ApplyForTheCreditCardFillo masterCardIdeal() {
		return Tasks.instrumented(ApplyForTheCreditCardFillo.class);
	}
}
