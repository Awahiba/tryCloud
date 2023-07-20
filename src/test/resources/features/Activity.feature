@US011
Feature: Default


  Background: User is already in the log in page
    Given the user logged in as "employee1"



  Scenario:user can see all listed items under Activity module
    Given user click on Activity on navigation menu
    Then user should see and verify all listed item under Activity
      | By you         |
      | By others      |
      | Circles        |
      | Favorites      |
      | File changes   |
      | File shares    |
      | Calendar       |
      | Todos          |
      | Comments       |
      | Deck           |





  Scenario: user can see all items list ordered by newest to oldest
    Given user click on Activity on navigation menu
    And user click on All Activities
    Then user must verify all activities is in order from newest to oldest



  Scenario: user can see message at the end of All Activities tab
    Given user click on Activity on navigation menu
    And user click on All Activities
    Then user scroll to the end of the page and see "No more events to load"