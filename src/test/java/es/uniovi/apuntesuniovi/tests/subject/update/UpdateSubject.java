package es.uniovi.apuntesuniovi.tests.subject.update;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import es.uniovi.apuntesuniovi.util.RandomMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UpdateSubject extends AbstractTest {

  @And("open the subject update modal")
  public void open_the_subject_update_modal() {
    testUtil.waitChangeWeb();
    testUtil.click("updateSubject");
  }

  @And("change subject`s name")
  public void change_subject_s_name() {
    String subjectName = "subject" + RandomMethods.randomUsername();
    values.put("subjectNameNew", subjectName);
    testUtil.insertDataInput("name", subjectName);
  }

  @Then("subject´s data had changed")
  public void subject_s_data_had_changed() {
    testUtil.textPresent(values.get("subjectName"), false);
    testUtil.textPresent(values.get("subjectNameNew"), true);
  }
}
