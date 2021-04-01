Feature: Update subject

  Scenario: Update with valid data
    Given User is identified as admin
    When tries to see the list of subjects
    And open the subject modal
    And tries to add a subject with required data
    And tries to save data
    And open subject filter menu
    And insert name filter
    And apply filters
    And open subject details
    And open the subject update modal
    And change subject`s name
    And tries to save data
    Then subject´s data had changed
