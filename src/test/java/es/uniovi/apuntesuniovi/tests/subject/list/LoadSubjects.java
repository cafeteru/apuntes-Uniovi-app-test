package es.uniovi.apuntesuniovi.tests.subject.list;

import es.uniovi.apuntesuniovi.pageObjects.subjects.P0AdminMenuSubject;
import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.When;

/**
 * Check the user list with correct data
 */
public class LoadSubjects extends AbstractTest {

  @When("tries to see the list of subjects")
  public void tries_to_see_the_list_of_subjects() {
    P0AdminMenuSubject adminMenuSubject = new P0AdminMenuSubject(driver, testUtil);
    adminMenuSubject.run();
  }
}
