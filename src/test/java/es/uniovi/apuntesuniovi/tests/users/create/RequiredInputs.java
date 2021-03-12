package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import es.uniovi.apuntesuniovi.util.RandomMethods;
import io.cucumber.java.en.And;
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
    testUtil.textPresent((String) values.get("uo"), true);
  }

  @And("open filter menu")
  public void open_filter_menu() {
    testUtil.waitChangeWeb();
    testUtil.click("userFilters");
  }

  @Then("insert username filter")
  public void insert_username_filter() {
    testUtil.waitChangeWeb();
    testUtil.insertDataInput("usernameFilter", values.get("uo"));
  }

  @And("apply filters")
  public void apply_filters() {
    testUtil.click("filterButton");
  }
}
