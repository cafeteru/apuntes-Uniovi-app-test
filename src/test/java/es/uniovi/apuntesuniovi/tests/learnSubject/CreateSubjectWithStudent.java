package es.uniovi.apuntesuniovi.tests.learnSubject;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class CreateSubjectWithStudent extends AbstractTest {

  @And("add a student")
  public void add_a_student() {
    var name = values.get("name");
    driver.findElement(By.xpath("//input[@type='text']")).click();
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name);
    driver.findElements(By.className("p-checkbox-box")).get(1).click();
  }

  @And("show students tab")
  public void show_students_tab() {
    testUtil.changeWebClick("mat-tab-label-0-1");
  }

  @And("open students subject modal")
  public void open_students_subject_modal() {
    testUtil.changeWebClick("addUser");
  }
}
