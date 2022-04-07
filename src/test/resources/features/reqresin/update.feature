Feature: update

  @positive
  Scenario Outline: PUT update user successfully
    When PUT request with body of name: "<name>" and job: "<job>" is sent to update user data with id: <id>
    Then Status response code should be 200
    And Response body should be matched with "success-update.json"

    Examples:
      | id | name     | job           |
      | 2  | morpheus | Zion resident |
      | 1  | joe      | jobless       |

  @negative
  Scenario Outline: PUT update user unsuccessfully
    When PUT request with body of name: "<name>" and job: "<job>" is sent to update user data with invalid id: <id>
    Then Status response code should be 400
    And Response body should be matched with "failed-update.json"

    Examples:
      | id | name     | job           | note        |
      | 0  | morpheus | zion resident | zero        |
      | -1 | morpheus | zion resident | negative id |
      | 13 | morpheus | zion resident | invalid id  |