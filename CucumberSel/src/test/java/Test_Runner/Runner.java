package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\Features\\loginSauce.feature",
		glue= {"Step_definition"},
		//tags="@smoke or @regression"
		plugin= {"pretty", "html:target/SwagReports.html",
		 "json:target/JSONReports/SwagReports.json",
		 "junit:target/JunitReports/SwagReports.xml"}
		)





public class Runner {

}
