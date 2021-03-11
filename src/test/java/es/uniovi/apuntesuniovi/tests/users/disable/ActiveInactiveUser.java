package es.uniovi.apuntesuniovi.tests.users.disable;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.And;

public class ActiveInactiveUser extends AbstractTest {

  @And("click enable button")
  public void click_disable_button() {
    testUtil.waitChangeWeb();
    testUtil.click("enable1");
  }
}
