package es.uniovi.apuntesuniovi.pageObjects.users;

import es.uniovi.apuntesuniovi.pageObjects.POAbstract;
import es.uniovi.apuntesuniovi.util.TestUtil;
import org.openqa.selenium.WebDriver;

public class POAdminMenuUsers extends POAbstract {

  public POAdminMenuUsers(WebDriver driver, TestUtil testUtil) {
    super(driver, testUtil);
  }

  @Override
  public void run() {
    testUtil.click("openSidenav");
    testUtil.click("usersNavList");
    testUtil.waitChangeWeb();
  }
}
