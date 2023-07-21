@search @prelogin
Feature: File, Contact, or Photo Search from Dashboard

  Scenario Outline: Searching and viewing details of a search item
    Given I am a user logged in on the "Dashboard"
    And I have a <search_item> with a known name
    When I click on the magnifying glass icon inside any Module
    And I enter the known name into the search field
    And I press the Enter key
    Then I should see a list of search results matching the known name
    And the details side page of the <search_item> should appear when clicked on it

    Examples:
      | search_item  |
      | file         |
      | contact      |
      | photo        |

  Scenario: Navigating back to the Dashboard
    Given I am a user logged in and viewing a search item's details
    When I click the App icon at the top left corner on the page
    Then I should be redirected to the Dashboard

  Scenario: Viewing photos under the Photos Module
    Given I am a user logged in on the "Dashboard"
    When I navigate to the Photos Module
    Then I should be able to see the photos under the Photos Module
