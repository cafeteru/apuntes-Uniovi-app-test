package es.uniovi.apuntesuniovi.tests.logout;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;

/**
 * Check the logout with unlogged user
 */
public class TryToLogNotLogged extends AbstractTest {
  @Then("The application won´t show him the possibility to logout")
  public void the_application_won_t_show_him_the_possibility_to_logout() {
    testUtil.textPresent("Identificarse", true);
    testUtil.textPresent("Cerrar sesión", false);
  }
}
