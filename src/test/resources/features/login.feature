Feature: Login
  Scenario: Successful login
    Given User is not identified
    When tries to identify with correct params
    Then the application will let him in

  Scenario: Wrong password
    Given User is not identified
    When tries to identify with wrong password
    Then the application will not let him in

  Scenario: Wrong user
    Given User is not identified
    When tries to identify with wrong user
    Then the application will not let him in