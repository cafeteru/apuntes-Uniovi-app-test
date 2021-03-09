package es.uniovi.apuntesuniovi.tests.users.create;

import static org.junit.Assert.assertEquals;

import es.uniovi.apuntesuniovi.pageObjects.users.POOpenModalUser;
import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmptyInputs extends AbstractTest {
  @When("open the user modal")
  public void open_the_user_modal() {
    new POOpenModalUser(driver, testUtil).run();
  }

  @When("add a user without data")
  public void tries_to_add_a_user_without_data() {
    testUtil.insertDataInput("username", "");
    testUtil.insertDataInput("password", "");
  }

  @When("tries to save data")
  public void tries_to_save_data() {
    testUtil.click("add");
    testUtil.waitChangeWeb();
  }

  @Then("the application won´t let him add it")
  public void the_application_won_t_let_him_add_it() {
    this.closeAndGetSweetAlert();
    assertEquals("Error en el formulario", this.sweetAlert.getTitle());
    assertEquals("Se han encontrado errores. Por favor, revíselo",
        this.sweetAlert.getContent());
  }

  @Then("will show the errors of the required fields")
  public void will_show_the_errors_of_the_required_fields() {
    testUtil.textPresent("El nombre de usuario es requerido", true);
    testUtil.textPresent("La contraseña es requerida", true);
    testUtil.textPresent("El rol es requerido", true);
  }

}
