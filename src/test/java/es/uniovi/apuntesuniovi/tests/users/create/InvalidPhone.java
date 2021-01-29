package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidPhone extends AbstractTest {
    @When("add a invalid phone")
    public void add_a_invalid_phone() {
        testUtil.insertDataInput("phone", "145789123");
    }

    @Then("will show the invalid error of phone field")
    public void will_show_the_invalid_error_of_phone_field() {
        testUtil.textPresent("El teléfono es inválido", true);
    }
}
