package es.uniovi.apuntesuniovi.tests.subject.findById;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FindSubjectById extends AbstractTest {

  @And("open subject details")
  public void open_subject_details() {
    testUtil.waitChangeWeb();
    testUtil.click("details1");
  }

  @Then("the application show subject´s data")
  public void the_application_show_subject_s_data() {
    testUtil.waitChangeWeb();
    testUtil.textPresent(values.get("subjectName"), true);
  }
}
