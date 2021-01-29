package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.When;

public class TypeIdentificationDNIValidNumberIdentification extends AbstractTest {
    @When("add valid DNI number of identification")
    public void add_valid_dni_number_of_identification() {
        testUtil.insertDataInput("numberIdentification", "32778038W");
    }
}
