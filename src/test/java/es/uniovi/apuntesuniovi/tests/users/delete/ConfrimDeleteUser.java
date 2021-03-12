package es.uniovi.apuntesuniovi.tests.users.delete;


import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.And;

public class ConfrimDeleteUser extends AbstractTest {

  @And("click delete button")
  public void click_delete_button() {
    testUtil.waitChangeWeb();
    testUtil.click("delete1");
  }

  @And("confirm sweet alert")
  public void confirm_sweet_alert() {
    testUtil.waitChangeWeb();
    testUtil.getElementByClass("swal2-confirm").click();
  }
}
