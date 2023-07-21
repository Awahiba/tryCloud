@US008
Feature: As a user I should be able to create a new group and add any contact into a group under Contacts module

  Background: user is on the contacts page
    Given the user logged in as "user3"
    When the user is on the home page
    Then user click contacts icon


  #@AC1
  Scenario: User can create a new group under Contacts Module
    And  user clicks icon plus on the left side
    And user type the new group name "Test1" and click enter button
    And user click add contacts
    And user add all contacts and press button add to group
    Then user is able to see group's name "Test1" under Contacts Module


  #@AC2
  Scenario: User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu
    When user click the group’s dropdown menu existing in the contact’s own info menu
    Then user can see all the available groups name

  #@AC3
  Scenario: User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu
    When user click Add new property dropdown menu
    And user choose Anniversary
    Then User can see a new property as Anniversary