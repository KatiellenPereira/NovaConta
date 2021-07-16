

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@CucumberOptions(
		features = "src/test/resources/CriarConta.feature",
		glue = "br.ce.email",	
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
	 	)


@RunWith(Cucumber.class)
public class Runner {

}
