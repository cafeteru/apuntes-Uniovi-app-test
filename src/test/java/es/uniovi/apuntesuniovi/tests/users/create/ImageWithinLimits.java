package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.random.GetRandomPerson;
import es.uniovi.apuntesuniovi.random.model.Person;
import es.uniovi.apuntesuniovi.tests.AbstractTest;
import es.uniovi.apuntesuniovi.util.GetFilesInternet;
import io.cucumber.java.en.When;

public class ImageWithinLimits extends AbstractTest {
  @When("add a valid image")
  public void add_a_valid_image() {
    Person person = GetRandomPerson.getPerson();
    String fileName = person.getName().getLast() + person.getName().getFirst() + ".jpg";
    String url = person.getPicture().getLarge();
    GetFilesInternet.getFile(url, fileName);
    testUtil.selectFile("img", GetFilesInternet.getFolderFileUrl(fileName));
  }
}
