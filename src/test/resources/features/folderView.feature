Feature: Folder view Feature
  Agile story: As a user, I should be able to change folder view order by using Name/Size/Modified buttons
  Accounts are: user, employee

  Background: For all scenarios user is in the home page
    Given the user logged in as "User1"
    Then the user is on the home page
    Given the user clicks on the Files Module
    Then the user is on the Files page

   @Wip010
  Scenario: Folder view order by Name
    #the list has text documents and folders types, Favorited folders are placed first
    When user clicks on Name button
    Then user sees the list in descending or ascending alphabetical order

  @Wip010
  Scenario: Folder view order by Size
    When user clicks on Size button
    Then user sees the list in order based on the sizes

  @Wip010
  Scenario: Folder view order by Modified
    When the user clicks on Modified button
    Then the user sees the list in order based on modified dates
@Wip010
  Scenario:  “select all” checkbox at the left top corner of the list
    When the user clicks on the select all checkbox
    Then the user sees all the files selected at once
    And  the user sees the total values of all files in the first line