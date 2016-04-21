
class ScenarioParser {

	static def build(def userStory){
		def scenarios, actions
		ScenarioBuilder builder = new ScenarioBuilder()
		if (userStory && userStory.contains('Scenario')) {
			scenarios = userStory.split('Scenario:')
			scenarios.each {
				actions = it.split("\\r?\\n")*.trim()
				if (actions && !actions[0].startsWith("Feature:")){
					builder.addScenario().description(actions[0].trim())
					actions.each {
						if (it.startsWith("Given ")){
							builder.given(it - "Given ")
						} else if (it.startsWith("When")) {
							builder.when(it - "When ")
						} else if (it.startsWith("Then")) {
							builder.then(it - "Then ")
						}
					}
				}
			}
		}
		builder.build()
	}

	static main(String[] args) {
		String scenario = '''Scenario: Create a new patient
						Given I am an authenticated NMT
						When I enter all the required information for a patient
						Then a patient should be created'''
		println build(scenario)
	}
}
