package com.banistmo.certification.bancolombia.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction{
	
	private int seconds;

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static Wait theSeconds(int seconds) {
		return Tasks.instrumented(Wait.class, seconds);
	}

}
