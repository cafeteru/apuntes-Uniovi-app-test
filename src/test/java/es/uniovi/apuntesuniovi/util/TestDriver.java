package es.uniovi.apuntesuniovi.util;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import es.uniovi.apuntesuniovi.model.SweetAlert;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Class to create a instance of Google Chrome
 */
public class TestDriver {
  private static WebDriver driver;
  private static TestUtil testUtil;
  private static Map<String, String> values;
  private static SweetAlert sweetAlert;

  /**
   * Get instance of Webdriver
   *
   * @return instance of Webdriver
   */
  public static WebDriver getDriver() {
    if (driver == null) {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    }
    driver.manage().window().maximize();
    return driver;
  }

  /**
   * Get instance of TestUtil
   *
   * @return instance of TestUtil
   */
  public static TestUtil getTestUtil() {
    if (testUtil == null) {
      testUtil = new TestUtil(getDriver());
    }
    return testUtil;
  }

  /**
   * Get instance of values used in the tests
   *
   * @return instance of values
   */
  public static Map<String, String> getValues() {
    if (values == null) {
      values = new HashMap<>();
    }
    return values;
  }

  /**
   * Get a Singleton SweetAlert
   *
   * @return If SweetAlert doesn´t exist, it`ll return new one else return
   * existed
   */
  public static SweetAlert getSweetAlert() {
    if (sweetAlert == null) {
      sweetAlert = SweetAlert.builder().build();
    }
    return sweetAlert;
  }

  /**
   * Get content of SweetAlert into the object to check
   */
  public static void closeAndGetSweetAlert() {
    getSweetAlert().setTitle(
        getDriver().findElement(By.id("swal2-title")).getText());
    getSweetAlert().setContent(
        getDriver().findElement(By.id("swal2-content")).getText());
    getDriver().findElement(By.className("swal2-confirm")).click();
  }
}
