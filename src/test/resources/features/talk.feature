@wip
Feature:Talk functionality
  Agile story: As a user, I should be able to create a new conversation,
  add participant, start and leave call under the Talk module


  Background: user is on Login page of TryCloud
    Given user enters User1 as username and Userpass123 a password


  Scenario: Talk button verification
    When user clicks on the talk button



    When user clicks on plus sign
    Then user clicks on Conversation name input box
    And user types conversation name as My Conversation 5
    Then user marks checkbox named Allow guests to join via link
    Then user clicks Add participants button
    Then user clicks to any participant from the list
    And user clicks the Create conversation button
    Then user clicks on Close button
    Then user should see newly conversation in the list



      When user clicks on the hamburger menu next to the conversation name
      And user clicks on Delete conversation
      And user clicks on yes








