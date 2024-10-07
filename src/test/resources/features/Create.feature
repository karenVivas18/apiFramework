Feature: User Management

  Scenario Outline: Successfully create a user
    Given I have the user details with name "<name>" and job "<job>"
    When I create a new user
    Then the user should be successfully created with name "<name>", job "<job>", and status code "<statusCode>"

    Examples:
      | name      | job         | statusCode |
      | Morpheus  | Leader      | 201        |
      | Trinity   | Operator    | 201        |
      | Neo       | The One     | 201        |