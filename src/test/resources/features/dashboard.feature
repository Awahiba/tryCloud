@dashboard
Feature: Dashboard functionality
  User Story: As a user I should be able to modify Dashboard page


  Scenario: After login user can can see all modules and username
    Given user is on the dashboard page
    Then user sees Dashboard Module
    And user sees Files Module
    And user sees Photos Module
    And user sees Activity Module
    And user sees Talk Module
    And user sees Mail Module
    And user sees Contact Module
    And user sees Circles Module
    And user sees Calender Module
    And user sees Deck Module
    And user sees Username displayed

  @wip
    Scenario: User can click on Customize button and select any of the Widgets
    Given user is on the dashboard page
    Then user clicks on Customize button

