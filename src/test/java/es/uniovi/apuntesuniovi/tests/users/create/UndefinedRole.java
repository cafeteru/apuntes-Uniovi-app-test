package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UndefinedRole extends AbstractTest {
  @When("does not specify the role")
  public void does_not_specify_the_role() {
    testUtil.matSelectInput("role", "undefinedRole");
  }

  @Then("will show the errors of role fields")
  public void will_show_the_errors_of_role_fields() {
    testUtil.textPresent("El rol es requerido", true);
  }
}
