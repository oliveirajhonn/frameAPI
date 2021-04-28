package runner;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features =
{ "resources//features//" }, glue =
{ "steps", "utility" }, plugin =
{ "pretty", "html:target/cucumber" }, tags =
{ "@icarros" })

public class RunTest
{

}
