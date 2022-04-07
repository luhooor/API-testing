Feature: create_user

  @positive
  Scenario: POST create user successfully
    When POST create request is sent with body of name and job
    Then Status response code should be 201
    And Response body should be matched with "success-createuser.json"

  @negative
  Scenario Outline: POST create user unsuccessfully
    When POST create user is sent with body of "<name>" and "<job>"
    Then Status response code should be 400
    And Response body should be matched with "failed-createuser.json"

    Examples:
      | name     | job    | note         |
      | morpheus |        | without job  |
      |          | leader | without name |
