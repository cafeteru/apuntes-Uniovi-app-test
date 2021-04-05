package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import es.uniovi.apuntesuniovi.util.RandomMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class NumberIdentificationAlreadyRegister extends AbstractTest {
  @When("tries add a user with the same number of identification")
  public void tries_add_a_user_with_the_same_number_of_identification() {
    String uo = RandomMethods.randomUsername();
    values.put("uo", uo);
    testUtil.insertDataInput("username", uo);
    testUtil.insertDataInput("password", uo);
    testUtil.insertDataInput("name", uo);
    testUtil.insertDataInput("surname", uo);
    testUtil.matSelectInput("role", "ADMIN");
    testUtil.matSelectInput("identificationType", "DNI");
    testUtil.insertDataInput("numberIdentification", values.get("dni"));
  }

  @Then("will show the already register error of number of identification")
  public void will_show_the_already_register_error_of_number_of_identification() {
    assertTrue(this.sweetAlert.getContent().contains(
        "Número de identificación ya registrado"));
  }
}
