Feature: Delete user

  Scenario: Confirm delete a user
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And add a user with all data
    And tries to save data
    And open filter menu
    And insert username filter
    And apply filters
    And click delete button
    And confirm sweet alert
    Then the user disappeared in the list of users

  Scenario: Cancel delete a user
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And add a user with all data
    And tries to save data
    And open filter menu
    And insert username filter
    And apply filters
    And click delete button
    And cancel sweet alert
    Then the user appeared in the list of users