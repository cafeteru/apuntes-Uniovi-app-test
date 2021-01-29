package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TypeIdentificationWithInvalidNumberIdentification extends AbstractTest {
  @When("add invalid number of identification")
  public void add_invalid_number_of_identification() {
    testUtil.insertDataInput("numberIdentification", "X2891145");
  }

  @Then("the application will show the invalid error of number of identification field")
  public void the_application_will_show_the_invalid_error_of_number_of_identification_field() {
    testUtil.textPresent("El formato del número de identificación es inválido", true);
  }
}
