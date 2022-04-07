Feature: single_user

  @positive
  Scenario: GET single user data successfully
    When GET request is sent to get single user data with id: 1
    Then Status response code should be 200
    And Response body should be matched with "success-singleuser.json"

  @negative
  Scenario Outline: GET single user data unsuccessfully
    When GET request is sent to get single user data with unknown id: <id>
    Then Status response code should be 404
    And Response body should be matched with "emptydata.json"

    Examples:
      | id | note           |
      | 0  | zero id        |
      | -1 | negative value |
      | 13 | invalid id     |

  @negative
  Scenario Outline: GET single user data unsuccessfully
    When GET request is sent to get single user data with "<value>"
    Then Status response code should be 404
    And Response body should be matched with "emptydata.json"

    Examples:
      | value | note            |
      | a     | string/alphabet |
      | !@#   | special chars   |