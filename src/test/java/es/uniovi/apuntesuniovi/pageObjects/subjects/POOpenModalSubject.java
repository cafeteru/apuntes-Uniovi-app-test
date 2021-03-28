package es.uniovi.apuntesuniovi.pageObjects.subjects;

import es.uniovi.apuntesuniovi.pageObjects.POAbstract;
import es.uniovi.apuntesuniovi.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POOpenModalSubject extends POAbstract {

  public POOpenModalSubject(WebDriver driver, TestUtil testUtil) {
    super(driver, testUtil);
  }

  @Override
  public void run() {
    driver.findElement(By.id("addSubject")).click();
    testUtil.waitChangeWeb();
  }
}
