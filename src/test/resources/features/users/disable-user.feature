Feature: Disable user

  Scenario: Inactive a active user
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And add a user with all data
    And tries to save data
    And open filter menu
    And insert username filter
    And apply filters
    And click disable button
    Then clean username filter
    And the user disappeared in the list of users

  Scenario: Inactive a inactive user
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And add a user with all data
    And tries to save data
    And open filter menu
    And insert username filter
    And apply filters
    And click disable button
    And insert active filter
    And apply filters
    Then disable button doesn´t exists
    And the user appeared in the list of users

  Scenario: Active a inactive user
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And add a user with all data
    And tries to save data
    And open filter menu
    And insert username filter
    And apply filters
    And click disable button
    And insert active filter
    And apply filters
    And click enable button
    Then the user disappeared in the list of users

  Scenario: Active a active user
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And add a user with all data
    And tries to save data
    And open filter menu
    And insert username filter
    And apply filters
    Then enable button doesn´t exists
    And the user appeared in the list of users