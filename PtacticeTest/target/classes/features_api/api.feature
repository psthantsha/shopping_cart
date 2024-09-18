Feature: API TESTING
  Scenario Outline: API Get Method Test
    Given Get method endpoint
    Then Verify "<status>" status code is returned
    And Verify "<firstname>" firstname is returned
    And Verify "<url>" url

    Examples:
    | firstname | url                                | status |
    | Janet     | https://reqres.in/#support-heading | 200    |