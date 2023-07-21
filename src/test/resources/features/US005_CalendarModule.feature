@calendar
Feature: Calendar Module Functionality
  User Story:
  US-005 As a user, I should be able to see Daily-Weekly-Monthly calendar view and create a new event under the Calendar module
  1.User can display daily calendar view
  2.User can display weekly calendar view
  3.User can display monthly calendar view
  4.User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view

  Background: For all scenarios user is on calender page of the application
    Given the user logged in as "user1"
    Then the user is on the home page
    Given the user should be on the Calendar module


  Scenario: US-005 AC-1 User can display daily calendar view
    When the user click on Calendar views option button
    And the user click on Day option
    Then the user sees the daily calendar view
      | 12am |
      | 1am  |
      | 2am  |
      | 3am  |
      | 4am  |
      | 5am  |
      | 6am  |
      | 7am  |
      | 8am  |
      | 9am  |
      | 10am |
      | 11am |
      | 12pm |
      | 1pm  |
      | 2pm  |
      | 3pm  |
      | 4pm  |
      | 5pm  |
      | 6pm  |
      | 7pm  |
      | 8pm  |
      | 9pm  |
      | 10pm |
      | 11pm |


  Scenario: US-005 AC-2 User can display weekly calendar view
    When the user click on Calendar views option button
    And the user click on Week option
    Then the user sees the weekly calendar view
      | Sun 7/16/2023 |
      | Mon 7/17/2023 |
      | Tue 7/18/2023 |
      | Wed 7/19/2023 |
      | Thu 7/20/2023 |
      | Fri 7/21/2023 |
      | Sat 7/22/2023 |


  Scenario: US-005 AC-3 User can display monthly calendar view
    When the user click on Calendar views option button
    And the user click on Month option
    Then the user sees the monthly calendar view
      | Sun |
      | Mon |
      | Tue |
      | Wed |
      | Thu |
      | Fri |
      | Sat |


  Scenario: US-005 AC-4 User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
    When the user clicks on New event
    And the user filled in the Event title field
    And the user filled in the from date at time field
    And the user filled in the to date at time field
    Then the user clicks on the Save button
    And the user sees event on calendar






