package com.banistmo.certification.bancolombia.tasks;

import static com.banistmo.certification.bancolombia.userintefaces.BancolombiaHomePage.ENTER_SVP_BUTTON;
import static com.banistmo.certification.bancolombia.userintefaces.SVPLoginPage.CONTINUE_BUTTON;
import static com.banistmo.certification.bancolombia.userintefaces.SVPLoginPage.HEADER;
import static com.banistmo.certification.bancolombia.userintefaces.SVPLoginPage.NUMBER_BUTTON;
import static com.banistmo.certification.bancolombia.userintefaces.SVPLoginPage.SVP_LOGIN_TXT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.banistmo.certification.bancolombia.interactions.Switch;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoginToSVP implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(ENTER_SVP_BUTTON, isClickable())
				.forNoMoreThan(5).seconds(),
				Click.on(ENTER_SVP_BUTTON),
				Switch.toNewWindow(),
				WaitUntil.the(SVP_LOGIN_TXT, isVisible())
				.forNoMoreThan(5).seconds(),
				Enter.theValue("asdfgh").into(SVP_LOGIN_TXT),
				Click.on(CONTINUE_BUTTON),
				Click.on(NUMBER_BUTTON.of("1")),
				Click.on(HEADER),
				Click.on(NUMBER_BUTTON.of("7")),
				Click.on(HEADER),
				Click.on(NUMBER_BUTTON.of("2")),
				Click.on(HEADER),
				Click.on(NUMBER_BUTTON.of("9")),
				Click.on(CONTINUE_BUTTON));
	}
	
	public static LoginToSVP withBancolombia() {
		return Tasks.instrumented(LoginToSVP.class);
	}

}
