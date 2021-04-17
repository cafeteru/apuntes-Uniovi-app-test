Feature: Disable subject

  Scenario: Inactive a active subject
    Given User is identified as admin
    When tries to see the list of subjects
    And open the subject modal
    And tries to add a subject with required data
    And tries to save data
    Then open subject filter menu
    And insert name filter
    And apply filters
    And click disable button
    Then the subject disappeared in the list of subjects

  Scenario: Inactive a inactive subject
    Given User is identified as admin
    When tries to see the list of subjects
    And open the subject modal
    And tries to add a subject with required data
    And tries to save data
    Then open subject filter menu
    And insert name filter
    And apply filters
    And click disable button
    And insert name filter
    And insert active filter
    And apply filters
    Then disable button doesn´t exists
    And the subject will be in the list

  Scenario: Active a inactive subject
    Given User is identified as admin
    When tries to see the list of subjects
    And open the subject modal
    And tries to add a subject with required data
    And tries to save data
    Then open subject filter menu
    And insert name filter
    And apply filters
    And click disable button
    And insert name filter
    And insert active filter
    And apply filters
    And click enable button
    Then the subject disappeared in the list of subjects

  Scenario: Active a active subject
    Given User is identified as admin
    When tries to see the list of subjects
    And open the subject modal
    And tries to add a subject with required data
    And tries to save data
    Then open subject filter menu
    And insert name filter
    And apply filters
    Then enable button doesn´t exists
    And the subject will be in the list