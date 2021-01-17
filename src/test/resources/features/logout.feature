Feature: Logout

  Scenario: Successful logout
    Given User is identified
    When tries to logout
    Then the application will let out him

  Scenario: Try to log out when the user isn´t logged in
    Given User is not identified
    When tries to logout
    Then The application won´t show him the possibility to logout