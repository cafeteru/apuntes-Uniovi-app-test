package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UsernameAlreadyRegister extends AbstractTest {
  @When("tries add a user with the same username")
  public void tries_add_a_user_with_the_same_username() {
    testUtil.insertDataInput("username", values.get("uo"));
    testUtil.insertDataInput("password", values.get("uo"));
    testUtil.insertDataInput("name", values.get("uo"));
    testUtil.insertDataInput("surname", values.get("uo"));
    testUtil.matSelectInput("role", "TEACHER");
  }

  @Then("the server of the application won´t let him add it")
  public void the_server_of_the_application_won_t_let_him_add_it() {
    this.closeAndGetSweetAlert();
    assertEquals("Error al guardar los cambios", this.sweetAlert.getTitle());
    assertTrue(this.sweetAlert.getContent().contains(
        "Se ha producido el siguiente error en el servidor:"));
  }

  @Then("will show the already register error of username")
  public void will_show_the_already_register_error_of_username() {
    assertTrue(this.sweetAlert.getContent().contains(
        "Nombre de usuario ya registrado"));
  }
}
