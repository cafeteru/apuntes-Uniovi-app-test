package es.uniovi.apuntesuniovi;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import es.uniovi.apuntesuniovi.model.SweetAlert;
import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractTest {
	protected static WebDriver driver;
	protected static TestUtil testUtil;
	protected static Map<String, String> variables;
	protected SweetAlert sweetAlert;

	@BeforeAll
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		testUtil = new TestUtil(driver);
		variables = new HashMap<>();
		driver.manage().window().maximize();
	}

	@BeforeEach
	public void initTest() {
		sweetAlert = new SweetAlert();
	}

	@AfterEach
	public void finishTest() {
		driver.manage().deleteAllCookies();
	}

	@AfterAll
	public static void finishAllTest() {
		if (driver != null) {
			driver.quit();
		}
	}

	protected void closeAndGetSweetAlert() {
		sweetAlert.setTitle(driver.findElement(By.id("swal2-title")).getText());
		sweetAlert.setContent(driver.findElement(By.id("swal2-content")).getText());
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	}
}
