
class ScenarioBuilder {

	private List<Scenario> scenarios;
	
	public ScenarioBuilder(){
		scenarios = new ArrayList<Scenario>()
	}
	
	ScenarioBuilder addScenario() {
		scenarios.add(new Scenario());
		this
	}
	
	ScenarioBuilder description(def description) {
		scenarios.last().description = description 
		this
	}
	
	ScenarioBuilder given(def given){
		scenarios.last().given = given
		this
	}
	
	ScenarioBuilder when(def when){
		scenarios.last().when = when
		this
	}
	
	ScenarioBuilder then(def then){
		scenarios.last().then = then
		this
	}
	
	ScenarioBuilder and(def and){
		scenarios.last().and = and
		this
	}
	
	def build() {
		scenarios
	}
}
