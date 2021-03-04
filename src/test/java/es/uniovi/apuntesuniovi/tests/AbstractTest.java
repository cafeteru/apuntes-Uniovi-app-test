package es.uniovi.apuntesuniovi.tests;

import es.uniovi.apuntesuniovi.model.SweetAlert;
import es.uniovi.apuntesuniovi.util.TestDriver;
import es.uniovi.apuntesuniovi.util.TestUtil;
import org.openqa.selenium.WebDriver;

import java.util.Map;

/**
 * Abstract test where common aspects are defined
 */
public abstract class AbstractTest {
  protected WebDriver driver;
  protected TestUtil testUtil;
  protected Map<String, String> values;
  protected SweetAlert sweetAlert;

  public AbstractTest() {
    driver = TestDriver.getDriver();
    testUtil = TestDriver.getTestUtil();
    values = TestDriver.getValues();
    sweetAlert = TestDriver.getSweetAlert();
  }

  protected void closeAndGetSweetAlert() {
    TestDriver.closeAndGetSweetAlert();
  }
}
