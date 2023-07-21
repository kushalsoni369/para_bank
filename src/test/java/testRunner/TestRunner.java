package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                //features = {".//features/login.feature"},
                //features = {".//features/register.feature"},
                //features = {".//features/openacc.feature"},
                features = {".//features/transfer.feature"},
                glue = "stepDefinitions",
                dryRun = false

        )
        public class TestRunner
        {

        }
