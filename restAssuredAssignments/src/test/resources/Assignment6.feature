Feature: Assignment6 Rates API testing

  Scenario: Assignment6_Specific Date  exchange Rates
    Given Assignment6_Specific Date exchange rates URI
    When Assignment6_the API is available with future date url
    Then Assignment6_assert the response for the prsence of current date
