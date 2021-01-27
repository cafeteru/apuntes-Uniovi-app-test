package es.uniovi.apuntesuniovi.tests.login;

import es.uniovi.apuntesuniovi.pageObjects.login.POLogin;
import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Check the login page with wrong password
 */
public class WrongPassword extends AbstractTest {

    @When("tries to identify with wrong password")
    public void tries_to_identify_with_wrong_password() {
        POLogin login = new POLogin(driver, testUtil, "admin", "WrongPassword");
        login.run();
    }

    @Then("the application will not let him in")
    public void the_application_will_not_let_him_in() {
        closeAndGetSweetAlert();
        assertEquals(sweetAlert.getTitle(), "Error al identificarse");
        assertEquals(sweetAlert.getContent(), "Por favor compruebe sus credenciales");
        testUtil.textPresent("Identificarse", true);
        testUtil.textPresent("Cerrar sesión", false);
    }
}
