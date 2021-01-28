package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.RandomMethods;
import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequiredInputs extends AbstractTest {
    private String uo;

    @When("tries to add a user with required data")
    public void tries_to_add_a_user_with_required_data() {
        uo = "uo" + RandomMethods.randomInteger(10_000, 99_999);
        testUtil.insertDataInput("username", uo);
        testUtil.insertDataInput("password", uo);
        testUtil.matSelectInput("role", "STUDENT");
    }

    @Then("the application will let him add it")
    public void the_application_will_let_him_add_it() {
        // TODO Review when add pagination
        testUtil.waitChangeWeb();
        testUtil.textPresent(uo, true);
    }

}
