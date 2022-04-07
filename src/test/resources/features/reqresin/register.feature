Feature: register

  @positive
  Scenario: POST register successfully using email and password
    When POST register request is sent with body of email and password
    Then Status response code should be 200
    And Response body should be matched with "success-register.json"

  @negative
  Scenario: POST login unsuccessfully without using password
    When POST register request is sent with body of email without password
    Then Status response code should be 400
    And Response body should be matched with "failed-register.json"