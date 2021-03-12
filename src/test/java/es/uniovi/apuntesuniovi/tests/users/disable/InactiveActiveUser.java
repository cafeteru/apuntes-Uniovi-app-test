package es.uniovi.apuntesuniovi.tests.users.disable;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InactiveActiveUser extends AbstractTest {

  @And("click disable button")
  public void click_disable_button() {
    testUtil.waitChangeWeb();
    testUtil.click("disable1");
  }

  @And("clean username filter")
  public void clean_username_filter() {
    testUtil.insertDataInput("usernameFilter", "");
  }

  @Then("the user disappeared in the list of users")
  public void the_user_disappeared_in_the_list_of_users() {
    testUtil.waitChangeWeb();
    testUtil.textPresent(values.get("uo"), false);
  }
}
