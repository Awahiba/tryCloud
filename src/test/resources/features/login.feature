@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify login with different user types
    Given the user logged in as "user1"
    Then the user is on the home page

  Scenario: Verify login with different user types
    Given the user logged in as "user2"
    Then the user is on the home page

  Scenario: Verify login with different user types
    Given the user logged in as "user3"


    Then the user is on the home page

  Scenario: Verify login with different user types
    Given the user logged in as "employee1"
    Then the user is on the home page

  Scenario: Verify login with different user types
    Given the user logged in as "employee2"
    Then the user is on the home page

  Scenario: Verify login with different user types
    Given the user logged in as "employee3"
    Then the user is on the home page


  Scenario Outline: Verify login with different user types
    Given the user logged in with "<username>" and "<password>"
    Then the user is on the home page
    Examples:
      | username    | password    |
      | User13      | Userpass123 |
      | User65      | Userpass123 |
      | User100     | Userpass123 |
      | Employee125 | Employee123 |
      | Employee98  | Employee123 |
      | Employee8   | Employee123 |

