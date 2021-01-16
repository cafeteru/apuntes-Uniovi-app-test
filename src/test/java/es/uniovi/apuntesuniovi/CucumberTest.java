package es.uniovi.apuntesuniovi;

import es.uniovi.apuntesuniovi.util.TestDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

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
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = TestDriver.getDriver();
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}