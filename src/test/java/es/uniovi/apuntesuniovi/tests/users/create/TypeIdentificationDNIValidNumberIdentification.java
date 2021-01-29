package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import es.uniovi.apuntesuniovi.util.RandomMethods;
import io.cucumber.java.en.When;

public class TypeIdentificationDNIValidNumberIdentification extends AbstractTest {
  @When("add valid DNI number of identification")
  public void add_valid_dni_number_of_identification() {
    String dni = RandomMethods.dni();
    values.put("dni", dni);
    testUtil.insertDataInput("numberIdentification", dni);
  }
}
