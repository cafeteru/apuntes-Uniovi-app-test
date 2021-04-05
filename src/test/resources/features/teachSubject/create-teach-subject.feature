Feature: Create teach subject

  Scenario: Create a subject with a teacher
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And add a user with all data
    And assign teacher role
    And tries to save data
    When tries to see the list of subjects
    And open the subject modal
    And tries to add a subject with required data
    And add a teacher
    And tries to save data
    Then open subject filter menu
    And insert name filter
    And apply filters
    And the subject will be in the list
