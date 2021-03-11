package es.uniovi.apuntesuniovi.tests.users.update;

import com.google.gson.Gson;
import es.uniovi.apuntesuniovi.random.GetRandomPerson;
import es.uniovi.apuntesuniovi.random.model.Person;
import es.uniovi.apuntesuniovi.tests.AbstractTest;
import es.uniovi.apuntesuniovi.util.GetFilesInternet;
import es.uniovi.apuntesuniovi.util.RandomMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.format.DateTimeFormatter;

public class UpdateDataWithoutRequired extends AbstractTest {
  @When("add a user with all data")
  public void add_a_user_with_all_data() {
    String uo = RandomMethods.randomUsername();
    values.put("uo", uo);
    testUtil.insertDataInput("username", uo);
    testUtil.insertDataInput("password", uo);
    testUtil.matSelectInput("role", "STUDENT");
    Person person = GetRandomPerson.getPerson();
    values.put("person", new Gson().toJson(person));
    testUtil.insertDataInput("birthDate", person.getDob().getDate().format(
        DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    testUtil.insertDataInput("surname", person.getName().getLast());
    testUtil.insertDataInput("name", person.getName().getFirst());
    testUtil.insertDataInput("email", person.getEmail());
    testUtil.insertDataInput("phone", "" + RandomMethods.randomInteger(600_000_000, 699_999_999));
    testUtil.insertDataInput("street", person.getLocation().getStreet().getName());
    testUtil.insertDataInput("city", person.getLocation().getCity());
    testUtil.insertDataInput("postalCode", "" + person.getLocation().getPostcode());
    String fileName = person.getName().getLast() + person.getName().getFirst() + ".jpg";
    String url = person.getPicture().getLarge();
    GetFilesInternet.getFile(url, fileName);
    testUtil.selectFile("img", GetFilesInternet.getFolderFileUrl(fileName));
  }

  @And("view her data")
  public void view_her_data() {
    testUtil.waitChangeWeb();
    testUtil.click("details1");
  }

  @And("open the user update modal")
  public void open_the_user_update_modal() {
    testUtil.waitChangeWeb();
    testUtil.click("updateUser");
  }

  @And("change user`s name")
  public void changeUserSName() {
    testUtil.waitChangeWeb();
    Person person = GetRandomPerson.getPerson();
    values.put("newPerson", new Gson().toJson(person));
    testUtil.insertDataInput("name", person.getName().getLast());
  }

  @And("change user`s surname")
  public void changeUserSSurname() {
    Person person = new Gson().fromJson(values.get("newPerson"), Person.class);
    testUtil.insertDataInput("surname", person.getName().getLast());
  }

  @Then("user´s data had changed")
  public void userSDataHadChanged() {
    Person person = new Gson().fromJson(values.get("person"), Person.class);
    Person newPerson = new Gson().fromJson(values.get("newPerson"), Person.class);
    testUtil.textPresent(person.getName().getLast(), false);
    testUtil.textPresent(person.getName().getLast(), false);
    testUtil.textPresent(newPerson.getName().getLast(), true);
    testUtil.textPresent(newPerson.getName().getLast(), true);
  }
}
