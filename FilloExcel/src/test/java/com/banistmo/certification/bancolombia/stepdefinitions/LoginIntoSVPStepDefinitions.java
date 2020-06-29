package com.banistmo.certification.bancolombia.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import com.banistmo.certification.bancolombia.questions.LoginError;
import com.banistmo.certification.bancolombia.tasks.LoginToSVP;
import com.banistmo.certification.bancolombia.utils.drivers.Chrome;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginIntoSVPStepDefinitions {
	
	@Before
	public void setTheStage() {
		OnStage.setTheStage(Cast.ofStandardActors());
		OnStage.theActorCalled("User");
	}
	
	@Given("^User is in Bancolombia home page$")
	public void userIsInBancolombiaHomePage() {
		theActorInTheSpotlight().can(BrowseTheWeb.with
				(Chrome.onTheWebPage("https://www.grupobancolombia.com/personas")));
	}

	@When("^User log into the SVP$")
	public void userLogIntoTheSVP() {
		theActorInTheSpotlight().attemptsTo(LoginToSVP.withBancolombia());
	}

	@Then("^User sees the failed login message$")
	public void userSeesTheFailedLoginMessage() {
		theActorInTheSpotlight().should(seeThat(LoginError.header(), is("Error")));
	}

}
