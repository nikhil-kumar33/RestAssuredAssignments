Feature: Assignment3 Rates API testing

  Scenario: Assignment3_Latest exchange Rates
    Given Assignment3_Latest Foreign exchange rates
    When Assignment3_Incorrect URL is provided
    Then Assignment3_assert the response
