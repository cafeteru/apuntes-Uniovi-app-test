package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TypeIdentificationWithoutNumberIdentification extends AbstractTest {
    @When("add DNI within the type of identification")
    public void add_dni_within_the_type_of_identification() {
        testUtil.matSelectInput("identificationType", "DNI");
    }

    @Then("the application will show the required error of number of identification field")
    public void the_application_will_show_the_required_error_of_number_of_identification_field() {
        testUtil.textPresent("El número de identificación es requerido", true);
    }
}
