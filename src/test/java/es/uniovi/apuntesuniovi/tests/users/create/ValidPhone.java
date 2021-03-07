package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import es.uniovi.apuntesuniovi.util.RandomMethods;
import io.cucumber.java.en.When;

public class ValidPhone extends AbstractTest {
  @When("add a valid phone")
  public void add_a_valid_phone() {
    testUtil.insertDataInput("phone", "" + RandomMethods.randomInteger(600_000_000, 699_999_999));
  }
}
