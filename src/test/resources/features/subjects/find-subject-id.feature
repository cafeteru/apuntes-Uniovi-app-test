Feature: Find subject by id

  Scenario: Find subject by id valid
    Given User is identified as admin
    When tries to see the list of subjects
    And open the subject modal
    And tries to add a subject with required data
    And tries to save data
    And open subject filter menu
    And insert name filter
    And apply filters
    And open subject details
    Then the application show subject´s data
