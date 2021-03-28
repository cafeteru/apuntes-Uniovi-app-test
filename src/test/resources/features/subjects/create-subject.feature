Feature: Create subject

  Scenario: Empty inputs
    Given User is identified as admin
    When tries to see the list of subjects
    And open the subject modal
    And add a subject without data
    And tries to save data
    Then the application won´t let him add it
    And will show the errors of the required subject fields

  Scenario: Required inputs
    Given User is identified as admin
    When tries to see the list of subjects
    And open the subject modal
    And tries to add a subject with required data
    And tries to save data
    Then open subject filter menu
    And insert name filter
    And apply filters
    And the subject will be in the list
