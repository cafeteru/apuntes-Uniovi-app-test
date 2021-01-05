package es.uniovi.apuntesuniovi.tests.login;

import es.uniovi.apuntesuniovi.pageObjects.POLogin;
import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.When;

/**
 * Check the login page with wrong user
 */
public class WrongUser extends AbstractTest {

    @When("tries to identify with wrong user")
    public void tries_to_identify_with_wrong_user() {
        POLogin login = new POLogin(driver, testUtil, "admin3", "admin");
        login.run();
    }
}
