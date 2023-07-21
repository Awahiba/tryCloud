@B29G22-230
Feature: Default

	
	@B29G22-225
	Scenario: AC-1 User can create a new contact
		And user click on New contact button
		    And user clear the contact input box
		    Then user enter the full name "Jimmy Jones" of the new contact
		    And new contact "Jimmy Jones" should appear in the All contacts list	

	
	@B29G22-226
	Scenario: AC-2 User can see all the contacts as a list inside the   middle column and total number of the contacts near the “All Contacts” tab
		Then user can see list of contacts and total amount of this list	

	
	@B29G22-227
	Scenario: AC-3 User can change the profile picture of any contact with a previously   uploaded picture by using “Choose from files” option
		When user click on any contact picture icon
		    And click on Choose from files button
		    Then user can pick up an avatar
		    And click Chose button	

	
	@B29G22-228
	Scenario: AC-4 User can delete any selected contact
		When user click on any contact in the list
		    Then user sees a contact profile
		    And user click on hamburger menu
		    Then user sees a Delete button
		    And user click on delete button