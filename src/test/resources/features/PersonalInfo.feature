@PersonalInfoPageTests @B29G22-212
Feature: Functionality of Personal Info page
  User Story:
  As a user, I should be able to change profile info settings under the Profile module.

  Background:
		#@B29G22-211
    Given the user is on the login page

    @B29G22-204
  Scenario Outline: US013-AC1-TC1 user sees Full name, Email, Phone Number titles on Personal Info page
    When the user logged in as "<username>"
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


  @B29G22-209
  Scenario Outline: US013-AC1-TC2 Verify name of the user should be matched with user Full name on Personal Info page
    When the user logged in as "<username>"
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


  @B29G22-210
  Scenario Outline: US013-AC1-TC3 Verify Phone number inputbox does not accept any letters or characters on Personal Info page
    When the user logged in as "<username>"
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

