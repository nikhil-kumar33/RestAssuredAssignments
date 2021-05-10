Feature: Assignment2 Rates API testing

  Scenario: Assignment2_Latest exchange Rates
    Given Assignment2_Latest Foreign exchange rates
    When Assignment2_API is available
    Then Assignment2_assert the response body
