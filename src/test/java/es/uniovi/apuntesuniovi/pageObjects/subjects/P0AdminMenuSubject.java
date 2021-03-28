package es.uniovi.apuntesuniovi.pageObjects.subjects;

import es.uniovi.apuntesuniovi.pageObjects.POAbstract;
import es.uniovi.apuntesuniovi.util.TestUtil;
import org.openqa.selenium.WebDriver;

public class P0AdminMenuSubject extends POAbstract {

  public P0AdminMenuSubject(WebDriver driver, TestUtil testUtil) {
    super(driver, testUtil);
  }

  @Override
  public void run() {
    testUtil.click("openSidenav");
    testUtil.click("subjectsNavList");
    testUtil.waitChangeWeb();
  }
}