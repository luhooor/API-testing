Feature: delete

  @positive
  Scenario: DELETE user data successfully
    When DELETE request is sent to delete user data with id: 1
    Then Status response code should be 204

  @negative
  Scenario Outline: DELETE user data unsuccessfully
    When DELETE request is sent to delete user data with invalid id: <id>
    Then Status response code should be 404

    Examples:
      | id | note        |
      | 0  | zero        |
      | -1 | negative id |
      | 13 | invalid id  |