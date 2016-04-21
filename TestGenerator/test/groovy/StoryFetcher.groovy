
class StoryFetcher {

	static def getStories(){
		String scenario = '''Feature: Create a Patient
As a Nuc Med Tech
I want to create a patient
So that we can track and dose the patient
Scenario: Create a new patient
Given I am an authenticated NMT
When I enter all the required information for a patient
Then a patient should be created
Scenario: Attempt to create a patient without entering all the personal information
Given I am scheduling a study
and the patient does not exist in the database 
When i try to create the patient
and not all the required information is entered
Then I will see an error message
and the missing required fields are highlighted
Scenario: Attempt to create a duplicate patient
Given I am scheduling a study
and the patient already exists
When I try to create the patient
Then we get an error'''
	}
}
