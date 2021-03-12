package es.uniovi.apuntesuniovi.tests.users.delete;


import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.And;

public class CancelDeleteUser extends AbstractTest {

  @And("cancel sweet alert")
  public void confirm_sweet_alert() {
    testUtil.waitChangeWeb();
    testUtil.getElementByClass("swal2-deny").click();
  }
}
