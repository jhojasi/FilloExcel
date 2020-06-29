package com.banistmo.certification.bancolombia.questions;

import static com.banistmo.certification.bancolombia.userintefaces.SVPLoginPage.ERROR_HEADER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginError implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(ERROR_HEADER).viewedBy(actor).asString();
	}

	public static LoginError header() {
		return new LoginError();
	}
}
