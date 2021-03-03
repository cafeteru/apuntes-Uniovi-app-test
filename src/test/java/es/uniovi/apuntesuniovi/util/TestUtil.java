package es.uniovi.apuntesuniovi.util;

import org.openqa.selenium.*;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Class to test webs
 */
public class TestUtil {
  private final WebDriver driver;
  private final JavascriptExecutor js;

  public TestUtil(WebDriver driver) {
    this.driver = driver;
    this.js = (JavascriptExecutor) this.driver;
  }

  /**
   * Click a element to change the url of the explorer
   *
   * @param id Element id
   */
  public void changeWebClick(String id) {
    try {
      driver.findElement(By.id(id)).click();
      waitChangeWeb();
    } catch (NoSuchElementException e) {
      System.err.println("Not found element with id \"" + id + "\"");
    }
  }

  /**
   * Change the url of the explorer
   *
   * @param url Url to open
   */
  public void changeWebUrl(String url) {
    driver.get(url);
    waitChangeWeb();
  }

  /**
   * Insert data into a input element
   *
   * @param id    Element id
   * @param value Value to insert
   */
  public void insertDataInput(String id, String value) {
    WebElement element = getElementById(id);
    element.click();
    element.clear();
    element.sendKeys(value);
  }

  /**
   * Select a element of mat-select
   *
   * @param id    Id of mat-select
   * @param value Selected value
   */
  public void matSelectInput(String id, String value) {
    WebElement element = getElementById(id);
    element.click();
    driver.findElement(By.id(value)).click();
  }

  /**
   * Send a file into input
   *
   * @param id  Id of input
   * @param url Url to file
   */
  public void selectFile(String id, String url) {
    WebElement elem = driver.findElement(By.id(id));
    elem.sendKeys(url);
  }

  /**
   * Click the element
   *
   * @param id Id of element
   */
  public void click(String id) {
    driver.findElement(By.id(id)).click();
  }

  /**
   * Get a WebElement by id
   *
   * @param id Element id
   * @return A Web element if exists
   */
  private WebElement getElementById(String id) {
    WebElement element = driver.findElement(By.id(id));
    js.executeScript("arguments[0].scrollIntoView();", element);
    return element;
  }

  /**
   * Check if a text is present in the web
   *
   * @param text    Text to search
   * @param present Indicates if it should b present
   */
  public void textPresent(String text, boolean present) {
    String xpath = "//*[contains(text(),'" + text + "')]";
    List<WebElement> list = driver.findElements(By.xpath(xpath));
    if (present) {
      assertFalse(list.isEmpty());
    } else {
      assertTrue(list.isEmpty());
    }
  }

  /**
   * Wait for the page to finish loading
   */
  public void waitChangeWeb() {
    waitSeconds(2);
  }

  /**
   * Wait a few seconds to load the changes
   *
   * @param seconds Seconds to wait
   */
  public void waitSeconds(int seconds) {
    synchronized (driver) {
      try {
        driver.wait(seconds * 1000L);
      } catch (InterruptedException e) {
        System.err.println("Error waitSeconds");
      }
    }
  }

}
