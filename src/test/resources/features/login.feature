@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

@wip
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







