import groovy.text.GStringTemplateEngine
import groovy.text.TemplateEngine;


class SpockTestCreator {

	private static GStringTemplateEngine templateEngine = new GStringTemplateEngine()

	def static create(scenarios){
		def file = new File(this.getClass().getResource("/test.template").toURI())
		def template = templateEngine.createTemplate(file).make([scenarios: scenarios, className:'Test'])
		def testFile = new File("test/groovy/generated/TestSpec.groovy")
		testFile.createNewFile()
		testFile.write(template.toString()) 
	}
}
