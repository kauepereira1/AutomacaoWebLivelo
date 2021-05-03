package br.ce.livelo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\cadastroProdutoCarrinho.feature",
        glue = "br.ce.livelo.steps",
         tags = "@test",
        plugin = {"pretty", "html:target\\report-html\\report-html"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        strict = true
)
public class Runner {
}
