@tag
Feature: Appy for credit card

  @ApplyForCreditCard
  Scenario: Successfully Apply for Crdit Card
    Given User is in the Bancolombia home page
    When User gives the needed data
    Then User should see the terms and conditions

