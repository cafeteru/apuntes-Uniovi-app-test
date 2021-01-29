package es.uniovi.apuntesuniovi.pageObjects.users;

import es.uniovi.apuntesuniovi.pageObjects.POAbstract;
import es.uniovi.apuntesuniovi.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POOpenModalUser extends POAbstract {

  public POOpenModalUser(WebDriver driver, TestUtil testUtil) {
    super(driver, testUtil);
  }

  @Override
  public void run() {
    driver.findElement(By.id("addUser")).click();
    testUtil.waitChangeWeb();
  }
}
