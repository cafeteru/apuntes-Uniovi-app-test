package es.uniovi.apuntesuniovi.tests.subject.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import es.uniovi.apuntesuniovi.util.RandomMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequiredInputs extends AbstractTest {

  @When("tries to add a subject with required data")
  public void tries_to_add_a_subject_with_required_data() {
    String subjectName = "subject" + RandomMethods.randomUsername();
    values.put("subjectName", subjectName);
    testUtil.insertDataInput("name", subjectName);
  }

  @Then("open subject filter menu")
  public void open_subject_filter_menu() {
    testUtil.waitChangeWeb();
    testUtil.click("subjectFilters");
  }

  @And("insert name filter")
  public void insert_name_filter() {
    testUtil.waitChangeWeb();
    testUtil.insertDataInput("nameFilter", values.get("subjectName"));
  }


  @And("the subject will be in the list")
  public void the_subject_will_be_in_the_list() {
    testUtil.waitChangeWeb();
    testUtil.textPresent(values.get("subjectName"), true);
  }
}
