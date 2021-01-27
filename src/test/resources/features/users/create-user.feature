Feature: Create user

  Scenario: Empty inputs
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user without data
    Then the application won´t let him add it
    And will show the errors of the required fields

  Scenario: Required inputs
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    Then the application will let him add it

  Scenario: Undefined role
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And does not specify the role
    Then the application won´t let him add it
    And will show the errors of role fields

  Scenario: Type of identification without number of identification
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add DNI within the type of identification
    Then the application won´t let him add it
    And will show the required error of number of identification field

  Scenario: Type of identification with invalid number of identification
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add DNI within the type of identification
    And add invalid number of identification
    Then the application won´t let him add it
    And will show the invalid error of number of identification field

  Scenario: Type of identification DNI with valid number of identification
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add DNI within the type of identification
    And add valid number of identification
    Then the application will let him add it

  Scenario: Type of identification NIE with valid number of identification
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add NIE within the type of identification
    And add valid number of identification
    Then the application will let him add it

  Scenario: Type of identification with valid number of identification but with another type
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add NIE within the type of identification
    And add valid number of identification
    Then the application won´t let him add it
    And will show the invalid error of number of identification field

  Scenario: Image within limits
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add a valid image
    Then the application will let him add it

  Scenario: Image without limits
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add a invalid image
    Then the application won´t let him add it
    And will show the invalid error of image field

  Scenario: Valid phone
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add a valid phone
    Then the application will let him add it

  Scenario: Invalid phone
    Given User is identified as admin
    When tries to see the list of users
    And open the user modal
    And tries to add a user with required data
    And add a invalid phone
    Then the application won´t let him add it
    And will show the invalid error of phone field