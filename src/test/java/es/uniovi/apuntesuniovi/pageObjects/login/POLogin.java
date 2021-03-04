package es.uniovi.apuntesuniovi.pageObjects.login;

import es.uniovi.apuntesuniovi.model.Constants;
import es.uniovi.apuntesuniovi.pageObjects.POAbstract;
import es.uniovi.apuntesuniovi.util.TestUtil;
import org.openqa.selenium.WebDriver;

public class POLogin extends POAbstract {
  private final String username;
  private final String password;

  public POLogin(WebDriver driver, TestUtil testUtil, String username, String password) {
    super(driver, testUtil);
    this.username = username;
    this.password = password;
  }

  @Override
  public void run() {
    testUtil.changeWebUrl(Constants.URL_BASE);
    testUtil.insertDataInput("username", username);
    testUtil.insertDataInput("password", password);
    testUtil.changeWebClick("logIn");
    testUtil.waitChangeWeb();
  }
}
