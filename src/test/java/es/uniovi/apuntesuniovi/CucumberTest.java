package es.uniovi.apuntesuniovi;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * To run cucumber test.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "es.uniovi.apuntesuniovi.tests",
        monochrome = true,
        plugin = {"pretty"}
)
public class CucumberTest {
}