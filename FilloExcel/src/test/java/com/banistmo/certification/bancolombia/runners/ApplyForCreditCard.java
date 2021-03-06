package com.banistmo.certification.bancolombia.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "com.banistmo.certification.bancolombia.stepdefinitions",
features = "src/test/resources/features/apply_for_credit_card.feature",
snippets = SnippetType.CAMELCASE)
public class ApplyForCreditCard {

}
