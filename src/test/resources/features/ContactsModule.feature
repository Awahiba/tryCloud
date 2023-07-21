@Contacts
Feature: Contacts Module Functionality

  Background:
    Given the user logged in as "user3"
    Then the user is on the home page
    And user click on Contacts view option button
   #Then the user should be on the Contact module

  @US-003_AC-1
  Scenario: US-003 AC-1 User can create a new contact
    And user click on New contact button
    And user clear the contact input box
    Then user enter the full name "Jimmy Jones" of the new contact
    And new contact "Jimmy Jones" should appear in the All contacts list

  @US-003_AC-2
  Scenario:US-003 AC-2 User can see all the contacts as a list inside the
  middle column and total number of the contacts near the “All Contacts” tab
    Then user can see list of contacts and total amount of this list

  @US-003_AC-3
  Scenario:US-003 AC-3 User can change the profile picture of any contact with a previously
  uploaded picture by using “Choose from files” option
    When user click on any contact picture icon
    And click on Choose from files button
    Then user can pick up an avatar
    And click Chose button

  Scenario: US-003 AC-4 User can delete any selected contact
    When user click on any contact in the list
    Then user sees a contact profile
    And user click on hamburger menu
    Then user sees a Delete button
    And user click on delete button







