Feature: Assignment1 Rates API testing

  Scenario: Assignment1_Latest exchange Rates
    Given Assignment1_Latest Foreign exchange rates
    When Assignment1_API is available
    Then Assignment1_I validate the outcomes
