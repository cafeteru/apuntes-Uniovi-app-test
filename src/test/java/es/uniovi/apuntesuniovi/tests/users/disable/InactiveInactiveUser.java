package es.uniovi.apuntesuniovi.tests.users.disable;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class InactiveInactiveUser extends AbstractTest {

  @And("insert active filter")
  public void insert_active_filter() {
    testUtil.matCheckBoxClick("activeFilter");
  }

  @Then("disable button doesn´t exists")
  public void disable_button_doesn_t_exists() {
    Assert.assertNull(testUtil.getElementById("disable1"));
  }

  @Then("the user appeared in the list of users")
  public void the_user_appeared_in_the_list_of_users() {
    testUtil.textPresent(values.get("uo"), true);
  }

}
