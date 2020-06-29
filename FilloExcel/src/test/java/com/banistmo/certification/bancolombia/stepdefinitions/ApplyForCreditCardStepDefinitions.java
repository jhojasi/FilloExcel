package com.banistmo.certification.bancolombia.stepdefinitions;

import java.util.List;
import java.util.Map;

import com.banistmo.certification.bancolombia.tasks.ApplyForTheCreditCard;
import com.banistmo.certification.bancolombia.tasks.ApplyForTheCreditCardFillo;
import com.banistmo.certification.bancolombia.utils.drivers.Chrome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

public class ApplyForCreditCardStepDefinitions {
	
	@Given("^User is in the Bancolombia home page$")
	public void userIsInTheBancolombiaHomePage() {
		OnStage.theActorInTheSpotlight().can(BrowseTheWeb
				.with(Chrome.onTheWebPage("https://www.grupobancolombia.com/personas")));
	}

	@When("^User gives the needed data$")
	public void userGivesTheNeededData() {
		OnStage.theActorInTheSpotlight().attemptsTo(ApplyForTheCreditCardFillo.masterCardIdeal());
	}

	@Then("^User should see the terms and conditions$")
	public void userShouldSeeTheTermsAndConditions() {
	}


}
