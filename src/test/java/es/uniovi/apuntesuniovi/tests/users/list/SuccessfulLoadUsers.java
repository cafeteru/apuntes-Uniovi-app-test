package es.uniovi.apuntesuniovi.tests.users.list;

import es.uniovi.apuntesuniovi.pageObjects.login.POLogin;
import es.uniovi.apuntesuniovi.pageObjects.users.POAdminMenuUsers;
import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Check the user list with correct data
 */
public class SuccessfulLoadUsers extends AbstractTest {

  @Given("User is identified as admin")
  public void user_is_identified_as_admin() {
    POLogin login = new POLogin(driver, testUtil, "admin", "admin");
    login.run();
  }

  @When("tries to see the list of users")
  public void tries_to_see_the_list_of_users() {
    POAdminMenuUsers adminMenuUsers = new POAdminMenuUsers(driver, testUtil);
    adminMenuUsers.run();
  }

  @Then("the application will show them")
  public void the_application_will_show_them() {
    testUtil.textPresent("Identificarse", false);
    testUtil.textPresent("Cerrar sesión", true);
    testUtil.textPresent("Nombre de usuario", true);
    testUtil.textPresent("Nombre", true);
    testUtil.textPresent("Apellidos", true);
    testUtil.textPresent("Rol", true);
  }
}
