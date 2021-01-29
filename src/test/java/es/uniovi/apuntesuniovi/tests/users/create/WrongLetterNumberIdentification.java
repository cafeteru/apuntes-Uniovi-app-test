package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WrongLetterNumberIdentification extends AbstractTest {
    @When("add number of identification with invalid letter")
    public void add_number_of_identification_with_invalid_letter() {
        testUtil.insertDataInput("numberIdentification", "32778038X");
    }

    @Then("the application will show the wrong letter of number of identification field")
    public void the_application_will_show_the_wrong_letter_of_number_of_identification_field() {
        testUtil.textPresent("La letra del número de identificación es incorrecto", true);
    }
}
