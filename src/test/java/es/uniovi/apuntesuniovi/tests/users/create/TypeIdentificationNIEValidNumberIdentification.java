package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.When;

public class TypeIdentificationNIEValidNumberIdentification extends AbstractTest {
    @When("add NIE within the type of identification")
    public void add_nie_within_the_type_of_identification() {
        testUtil.matSelectInput("identificationType", "NIE");
    }

    @When("add valid NIE number of identification")
    public void add_valid_NIE_number_of_identification() {
        testUtil.insertDataInput("numberIdentification", "X2891145E");
    }
}
