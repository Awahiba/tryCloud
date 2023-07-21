Feature: File Module Functionality
  Agile Story: As a user, I should be able to upload a file,
  move or delete any selected file under the files module
@Sayyam
  Scenario: User can upload a file
    Given User is on the dashboard page
    Then User is on the file page
    Then User clicks the plus icon
    Then User clicks Upload file
    Then User uploads the "file" and file name is displayed on files page
    #cant figure out how to uplaod a file
@sayyam
  Scenario: User can create new folder
    Given User is on the dashboard page
    Then User is on the file page
    Then User clicks the plus icon
    Then User clicks new folder
    Then User enter "name" of the folder
    Then user clicks the arrow icon
    #success!
@sayyam
  Scenario: User can delete any selected item from its three dots menu
    Given User is on the dashboard page
    Then User is on the file page
    Then User clicks three dot Icon
    Then User clicks Delete icon
    #cant figure how to select

@sayyam
  Scenario: User can see the total number of files and folders under the files list table
    Given User is on the dashboard page
    Then User is on the file page
    Then User scrolls under the list table
    And User sees the number of folders and files under the list table
    #2 out of 4 aint bad right Festine? right!?