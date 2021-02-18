package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import es.uniovi.apuntesuniovi.util.RandomMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequiredInputs extends AbstractTest {

  @When("tries to add a user with required data")
  public void tries_to_add_a_user_with_required_data() {
    String uo = RandomMethods.randomUsername();
    values.put("uo", uo);
    testUtil.insertDataInput("username", uo);
    testUtil.insertDataInput("password", uo);
    testUtil.matSelectInput("role", "STUDENT");
  }

  @Then("the application will let him add it")
  public void the_application_will_let_him_add_it() {
    testUtil.waitChangeWeb();
    testUtil.textPresent(values.get("uo"), true);
  }

  @Then("apply username filter")
  public void apply_username_filter() {
    testUtil.waitChangeWeb();
    testUtil.click("userFilters");
    testUtil.insertDataInput("usernameFilter", values.get("uo"));
    testUtil.click("filterButton");
  }

}
