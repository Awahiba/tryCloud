@US011
Feature: Default


  Background: User is already in the log in page


  Scenario Outline: user can see all listed items under Activity module
    Given the user logged in with "<username>" and "<password>"
    And the user is on the home page


    And user click on Activity on navigation menu
    Then user should see and verify all listed item under Activity
      | By you       |
      | By others    |
      | Circles      |
      | Favorites    |
      | File changes |
      | File shares  |
      | Calendar     |
      | Todos        |
      | Comments     |
      | Deck         |
    Examples:
      | username   | password    |
      | User13     | Userpass123 |
      | Employee98 | Employee123 |


  Scenario Outline: user can see all items list ordered by newest to oldest
    Given the user logged in with "<username>" and "<password>"
    Then the user is on the home page

    And user click on Activity on navigation menu
    And user click on All Activities
    Then user must verify all activities is in order from newest to oldest
    Examples:
      | username   | password    |
      | User13     | Userpass123 |
      | Employee98 | Employee123 |


  Scenario Outline: user can see message at the end of All Activities tab
    Given the user logged in with "<username>" and "<password>"
    Then the user is on the home page
    And user click on Activity on navigation menu
    And user click on All Activities
    Then user scroll to the end of the page and see "No more events to load"
    Examples:
      | username   | password    |
      | User13     | Userpass123 |
      | Employee98 | Employee123 |