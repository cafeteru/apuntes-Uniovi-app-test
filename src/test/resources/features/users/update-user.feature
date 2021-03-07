Feature: Update user

  Scenario: Update without username and number of identification
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And add a user with all data
    And tries to save data
    And apply username filter
    And view her data
    And open the user update modal
    And change user`s name
    And change user`s surname
    And tries to save data
    Then user´s data had changed