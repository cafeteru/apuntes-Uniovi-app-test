package es.uniovi.apuntesuniovi;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestUtil {
	private final WebDriver driver;
	private JavascriptExecutor js;
	private int waitSeconds = 1;

	public TestUtil(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) this.driver;
	}

	public void changeWebClick(String id) {
		driver.findElement(By.id(id)).click();
		waitChangeWeb();
	}

	public void changeWebUrl(String url) {
		driver.get(url);
		waitChangeWeb();
	}

	public void insertDataInput(String id, String value) {
		WebElement element = getElementById(id);
		element.click();
		element.clear();
		element.sendKeys(value);
	}

	private WebElement getElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		js.executeScript("arguments[0].scrollIntoView();", element);
		return element;
	}

	public void matDatepickerInput(String id, String value) {
		WebElement element = getElementById(id);
		element.click();
		element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		element.sendKeys(value);
	}

	public void matSelectInput(String id, String value) {
		WebElement element = getElementById(id);
		element.click();
		driver.findElement(By.id(value)).click();
	}

	public void selectFile(String url) {
		WebElement elem = driver.findElement(By.xpath("//input[@type='file']"));
		elem.sendKeys(url);
	}

	public void scrollToElement(String elementId) {
		WebElement element = getElementById(elementId);
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void textPresent(String text, boolean present) {
		List<WebElement> list = driver
				.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
		String message = String.format("Texto %s no localizado!", text);
		if (present) {
			assertTrue(message, list.size() > 0);
		} else {
			assertEquals(message, 0, list.size());
		}
	}

	public void waitChangeWeb() {
		waitSeconds(waitSeconds);
	}

	private void waitForPageLoadComplete(WebDriver driver,
										 String id) {
		Wait<WebDriver> wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}

	public void waitForPageLoadComplete(String id) {
		waitForPageLoadComplete(driver, id);
	}

	public void waitSeconds(int seconds) {
		synchronized (driver) {
			try {
				driver.wait(seconds * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
