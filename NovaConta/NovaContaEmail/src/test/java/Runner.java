

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@CucumberOptions(
		features = "src/test/resources/CriarConta.feature",
		glue = "br.ce.email",	
		plugin = {"pretty", "html:src/test/java/br/ce/email/report/report-html", "json:src/test/java/br/ce/email/report/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
	 	)


@RunWith(Cucumber.class)
public class Runner {

}
