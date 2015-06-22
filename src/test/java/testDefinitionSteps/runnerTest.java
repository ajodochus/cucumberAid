package testDefinitionSteps;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;
@RunWith(Cucumber.class)
@Cucumber.Options(
		format = {"pretty", "html:target/"},
		features = {"src/test/features/"}
		
		)
public class runnerTest {
}
