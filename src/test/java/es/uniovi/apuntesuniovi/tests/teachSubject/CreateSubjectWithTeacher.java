package es.uniovi.apuntesuniovi.tests.teachSubject;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class CreateSubjectWithTeacher extends AbstractTest {

  @And("assign teacher role")
  public void assign_teacher_role() {
    testUtil.matSelectInput("role", "ROLE_TEACHER");
  }

  @And("add a teacher")
  public void add_a_teacher() {
    var name = values.get("name");
    driver.findElement(By.xpath("//input[@type='text']")).click();
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name);
    driver.findElements(By.className("p-checkbox-box")).get(1).click();
  }
}
