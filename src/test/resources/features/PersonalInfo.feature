@PersonalInfoPageTests
Feature: Functionality of Personal Info page
  User Story:
  As a user, I should be able to change profile info settings under the Profile module.

  Background:
    Given the user is on the login page

  Scenario Outline: US-013 AC-1 user sees Full name, Email, Phone Number titles on Personal Info page
    And the user logged in as "<username>"
    And the user is on the home page
    And user clicks on Icon of profile
    And user clicks on Settings option of dropdown menu
    Then user is on the Personal Info page
    Then user see titles Full name, Email, Phone Number on the Page
    Examples:
      | username  |
      | user1     |
      | user2     |
      | user3     |
      | employee1 |
      | employee2 |
      | employee3 |

  Scenario Outline: US-013 AC-2 name of the user should be matched with user Full name
    And the user logged in as "<username>"
    And the user is on the home page
    And user clicks on Icon of profile
    And user clicks on Settings option of dropdown menu
    Then user is on the Personal Info page
    Then User checks names at Full name field and at dropdown menu under Icon op profile
    Examples:
      | username  |
      | user1     |
      | user2     |
      | user3     |
      | employee1 |
      | employee2 |
      | employee3 |

  Scenario Outline: US-013 AC-3 user cannot pass any characters except numbers into the "Phone Number" input box
    And the user logged in as "<username>"
    And the user is on the home page
    And user clicks on Icon of profile
    And user clicks on Settings option of dropdown menu
    Then user is on the Personal Info page
    And user clear and enter "letters" into the Phone number inputbox
    Then Phone number inputbox does not accept any letters or characters
    And user clear and enter "special symbols" into the Phone number inputbox
    Then Phone number inputbox does not accept any letters or characters
    Examples:
      | username  |
      | user1     |
      | user2     |
      | user3     |
      | employee1 |
      | employee2 |
      | employee3 |

