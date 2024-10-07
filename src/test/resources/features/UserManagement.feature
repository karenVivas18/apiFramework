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

  Scenario Outline: Retrieve an existing user
    Given the user with ID <userId> exists
    When I retrieve the user's information
    Then the user's information should be correct with name "<name>", job "<job>", and status code "<statusCode>"

    Examples:
      | userId | name      | job         | statusCode |
      | 2      | Morpheus  | Leader      | 200        |
      | 3      | Trinity   | Operator    | 200        |

  Scenario Outline: Update a user
    Given the user with ID <userId> exists
    When I update the user's name to "<newName>" and job to "<newJob>"
    Then the user should be successfully updated with name "<newName>", job "<newJob>", and status code "<statusCode>"

    Examples:
      | userId | newName  | newJob      | statusCode |
      | 2      | Neo      | The One     | 200        |
      | 3      | Trinity  | Hacker      | 200        |

  Scenario Outline: Delete a user
    Given the user with ID <userId> exists
    When I delete the user
    Then the user should be successfully deleted with status code "<statusCode>"

    Examples:
      | userId | statusCode |
      | 2      | 204        |
      | 3      | 204        |