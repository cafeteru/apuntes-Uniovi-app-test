Feature: User list

  Scenario: Successful load users
    Given User is identified as admin
    When tries to see the list of users
    Then the application will show them