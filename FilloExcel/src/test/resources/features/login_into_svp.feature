
@tag
Feature: Login into SVP

  @Login
  Scenario: Login to SVP
    Given User is in Bancolombia home page
    When User log into the SVP
    Then User sees the failed login message

