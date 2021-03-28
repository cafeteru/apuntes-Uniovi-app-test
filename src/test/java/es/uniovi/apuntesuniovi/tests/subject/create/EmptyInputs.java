package es.uniovi.apuntesuniovi.tests.subject.create;

import es.uniovi.apuntesuniovi.pageObjects.subjects.POOpenModalSubject;
import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmptyInputs extends AbstractTest {

  @When("open the subject modal")
  public void open_the_subject_modal() {
    new POOpenModalSubject(driver, testUtil).run();
  }

  @And("add a subject without data")
  public void add_a_subject_without_data() {
    testUtil.insertDataInput("name", "");
  }

  @Then("will show the errors of the required subject fields")
  public void will_show_the_errors_of_the_required_subject_fields() {
    testUtil.textPresent("El nombre de la asignatura es requerido", true);
  }
}
