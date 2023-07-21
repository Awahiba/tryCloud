
Feature: deleted files verification

Background:
  Given user is on dashboard
  When user on the files feature
  And user click deleted files

  Scenario: User can delete any deleted file permanently
  by using the three dots icon in the file’s line

    And user click on three dots icon
    Then user click on delete permanently button


  Scenario:User can restore any deleted file and see it again under the All Files tab
    And user click Restore button
    And user click all files
    Then user should see restored file under all files
  @kamal
    Scenario:User can order the all deleted files by newest to oldest or vice versa
      Given user click on delete button
      Then user can see all deleted files in sorted order