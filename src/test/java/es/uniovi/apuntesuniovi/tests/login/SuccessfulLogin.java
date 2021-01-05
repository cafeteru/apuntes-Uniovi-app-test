package es.uniovi.apuntesuniovi.tests.login;

import es.uniovi.apuntesuniovi.pageObjects.POLogin;
import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Check the login page with correct data
 */
public class SuccessfulLogin extends AbstractTest {

    @Given("User is not identified")
    public void user_is_not_identified() {
        testUtil.changeWebUrl("http://localhost:4200/");
    }

    @When("tries to identify with correct params")
    public void tries_to_identify_with_correct_params() {
        POLogin login = new POLogin(driver, testUtil, "admin", "admin");
        login.run();
    }

    @Then("the application will let him in")
    public void the_application_will_let_him_in() {
        testUtil.textPresent("Identificarse", false);
    }
}
