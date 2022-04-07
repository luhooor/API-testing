Feature: login

  @positive
  Scenario: POST login successfully
    When POST login request is sent with body of email and password
    Then Status response code should be 200
    And Response body should be matched with "success-login.json"

  @negative
  Scenario Outline: POST login unsuccessfully
    When POST login request is sent with body of email: "<email>" and password: "<password>"
    Then Status response code should be 400
    And Response body should be matched with "failed-login.json"

    Examples:
      | email              | password        | note                       |
      | eve.holt@reqres.in |                 | email and no password      |
      | eve.holt@reqres.in | invalidpassword | email and invalid password |
      | luhur@reqres.in    | wkwkwkwkw       | invalid email and password |