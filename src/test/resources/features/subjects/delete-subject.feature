Feature: Delete subject

  Scenario: Confirm delete a subject
    Given User is identified as admin
    When tries to see the list of subjects
    And open the subject modal
    And tries to add a subject with required data
    And tries to save data
    Then open subject filter menu
    And insert name filter
    And apply filters
    And click delete button
    And confirm sweet alert
    Then the subject disappeared in the list of subjects

  Scenario: Cancel delete a subject
    Given User is identified as admin
    When tries to see the list of subjects
    And open the subject modal
    And tries to add a subject with required data
    And tries to save data
    Then open subject filter menu
    And insert name filter
    And apply filters
    And click delete button
    And cancel sweet alert
    Then the subject will be in the list