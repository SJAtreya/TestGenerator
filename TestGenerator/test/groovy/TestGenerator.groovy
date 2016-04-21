
class TestGenerator {

	static main(String[] args) {
		SpockTestCreator.create(ScenarioParser.build(StoryFetcher.getStories()))
	}
}
