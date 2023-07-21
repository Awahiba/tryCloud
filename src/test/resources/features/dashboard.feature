@B29G22-208
Feature: Dashboard functionality
  User Story: As a user I should be able to modify Dashboard page

  Background: user is on the dashboard page

  @B29G22-205
  Scenario Outline: After login user can can see all modules and username
   # Given user is on the dashboard page
    Given the user logged in with "<username>" and "<password>"
    And the user is on the home page

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

    Examples:
      | username   | password    |
      | User1      | Userpass123 |
      | Employee82 | Employee123 |

  @B29G22-206
  Scenario Outline: User can click on Customize button and select any of the Widgets
   # Given user is on the dashboard page
    Given the user logged in with "<username>" and "<password>"
    And the user is on the home page

    Then user clicks on Customize button
    Then user can select and unselect on Status widget
    Then user can select and unselect on Weather widget
    Then user can select and unselect on Upcoming events widget
    Then user can select and unselect on Upcoming cards widget
    Then user can select and unselect on Important mail widget
    Then user can select and unselect on Unread mail widget
    Then user can select and unselect on Recommended files widget
    Then user can select and unselect on Talk mentions widget
    Then user can select and unselect on Recent statuses widget

    Examples:
      | username   | password    |
      | User1      | Userpass123 |
      | Employee82 | Employee123 |

  @B29G22-207
  Scenario Outline: User can click on Set Status button and select any of the Status options
   # Given user is on the dashboard page
    Given the user logged in with "<username>" and "<password>"
    And the user is on the home page

    Then user selects customize button to click Status widget and closes page to land on dashboard page
    Then user clicks on Status button
    And user can select the following options
      | Online         |
      | Away           |
      | Do not disturb |
      | Invisible      |

    Examples:
      | username   | password    |
      | User1      | Userpass123 |
      | Employee82 | Employee123 |






