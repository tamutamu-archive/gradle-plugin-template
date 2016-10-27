import org.gradle.testkit.runner.GradleRunner
import spock.lang.Specification
import spock.lang.Unroll

class AcceptanceSpec extends Specification {

	@Unroll
	def 'acceptance test should pass on Gradle #gradleVersion'() {

		given:
		def runner = GradleRunner.create()
				.withProjectDir(new File(fixture))
				.withArguments('hello')
				.withPluginClasspath()

		when:
		def result = runner.build()

		then:
		result.output.contains(expected1)
		if(expected2 != '') {
			result.output.contains(expected2)
		}

		where:
		fixture|expected1|expected2
		'fixture/test1'|'hello-test'|''
		'fixture/test2'|'Test Param 1'|'Test Param 2'
		'fixture/test3'|'Test ClosureList: 1'|'Test ClosureList: 2'
	}
}