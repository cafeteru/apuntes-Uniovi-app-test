Feature: Create user

  Scenario: Empty inputs
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And add a user without data
    And tries to save data
    Then the application won´t let him add it
    And will show the errors of the required fields

  Scenario: Required inputs
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And tries to save data
    Then open filter menu
    And insert username filter
    And apply filters
    And the application will let him add it

  Scenario: Undefined role
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And does not specify the role
    And tries to save data
    Then the application won´t let him add it
    And will show the errors of role fields

  Scenario: Type of identification without number of identification
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add DNI within the type of identification
    And tries to save data
    Then the application will show the required error of number of identification field

  Scenario: Type of identification with invalid number of identification
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add DNI within the type of identification
    And add invalid number of identification
    Then the application will show the invalid error of number of identification field

  Scenario: Type of identification DNI with valid number of identification
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add DNI within the type of identification
    And add valid DNI number of identification
    And tries to save data
    Then open filter menu
    And insert username filter
    And apply filters
    And the application will let him add it

  Scenario: Type of identification DNI with invalid letter number of identification
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add DNI within the type of identification
    And add number of identification with invalid letter
    And tries to save data
    Then the application will show the wrong letter of number of identification field

  Scenario: Type of identification NIE with valid number of identification
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add NIE within the type of identification
    And add valid NIE number of identification
    And tries to save data
    Then open filter menu
    And insert username filter
    And apply filters
    And the application will let him add it

  Scenario: Type of identification with valid number of identification but with another type
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add NIE within the type of identification
    And add valid DNI number of identification
    And tries to save data
    Then the application won´t let him add it
    Then the application will show the invalid error of number of identification field

  Scenario: Image within limits
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add a valid image
    And tries to save data
    Then open filter menu
    And insert username filter
    And apply filters
    And the application will let him add it

  Scenario: Valid phone
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add a valid phone
    And tries to save data
    Then open filter menu
    And insert username filter
    And apply filters
    And the application will let him add it

  Scenario: Invalid phone
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add a invalid phone
    And tries to save data
    Then the application won´t let him add it
    And will show the invalid error of phone field

  Scenario: Username already register
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And tries to save data
    And open the user modal
    And tries add a user with the same username
    And tries to save data
    Then the server of the application won´t let him add it
    And will show the already register error of username

  Scenario: Number of identification already register
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add DNI within the type of identification
    And add valid DNI number of identification
    And tries to save data
    And open the user modal
    And tries add a user with the same number of identification
    And tries to save data
    Then the server of the application won´t let him add it
    And will show the already register error of number of identification
