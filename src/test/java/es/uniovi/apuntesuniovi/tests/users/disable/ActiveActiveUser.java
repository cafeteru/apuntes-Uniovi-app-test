package es.uniovi.apuntesuniovi.tests.users.disable;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ActiveActiveUser extends AbstractTest {
  @Then("enable button does´nt exists")
  public void enable_button_does_nt_exists() {
    Assert.assertNull(testUtil.getElementById("enable1"));
  }
}
