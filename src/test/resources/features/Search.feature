@search @us009 @B29G22-242
Feature: File, Contact, or Photo Search from Dashboard

  Background: User is logged in
    Given I am a user logged in on the "Dashboard"

  @B29G22-240
  Scenario: Searching and viewing details of a search item
    Given I have a "Search_input" with a known name
    When I click on the magnifying glass icon inside any Module
    And I enter the known name into the search field
    Then I should see a list of search results matching the known name
    And I press the Enter key
    Then the details side page of the "Search_input" should appear when clicked on it

  @B29G22-241
  Scenario: Navigating back to the Dashboard
    Given I am viewing a search item's details
    When I click the App icon at the top left corner on the page
    Then I should be redirected to the Dashboard

  @B29G22-243
  Scenario: Viewing photos under the Photos Module
    When I navigate to the Photos Module
    Then I should be able to see the photos under the Photos Module



#TODO 1. Create map of web Element with Key, loop through them and verify key is equals/contains
  #TODO TODO 1.1 Create variable for storing element in DashboardPage
  #TODO 1.2 Add needed elements
  #TODO 1.3 In Search StepDef add logic to loop, idk how yet

  #TODO 2. ADD Scenario for Name input and check it
  #TODO 3. Add Explicit wait where needed
  #TODO 4. Sort webElements from SearchPage