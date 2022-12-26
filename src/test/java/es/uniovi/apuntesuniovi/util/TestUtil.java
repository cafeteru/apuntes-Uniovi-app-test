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
      click(id);
      waitChangeWeb();
    } catch (NoSuchElementException | NullPointerException e) {
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
   * Select an element of mat-select
   *
   * @param id      Id of mat-select
   * @param valueId Selected value
   */
  public void matSelectInput(String id, String valueId) {
    click(id);
    getElementById(valueId).click();
  }

  /**
   * Change the value of a matSelect
   *
   * @param id Id of tag matSelect
   */
  public void matCheckBoxClick(String id) {
    driver.findElement(By.xpath("//*[@id='" + id + "']/label")).click();
  }

  /**
   * Send a file into input
   *
   * @param id  Id of input
   * @param url Url to file
   */
  public void selectFile(String id, String url) {
    getElementById(id).sendKeys(url);
  }

  /**
   * Click the element
   *
   * @param id Id of element
   */
  public void click(String id) {
    getElementById(id).click();
  }

  /**
   * Get a WebElement by id
   *
   * @param id Element id
   * @return A Web element if exists
   */
  public WebElement getElementById(String id) {
    try {
      WebElement element = driver.findElement(By.id(id));
      js.executeScript("arguments[0].scrollIntoView();", element);
      return element;
    } catch (NoSuchElementException e) {
      return null;
    }
  }

  /**
   * Get a WebElement by class
   *
   * @param className Element class
   * @return A Web element if exists
   */
  public WebElement getElementByClass(String className) {
    try {
      WebElement element = driver.findElement(By.className(className));
      js.executeScript("arguments[0].scrollIntoView();", element);
      return element;
    } catch (NoSuchElementException e) {
      return null;
    }
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
    waitSeconds(1);
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
