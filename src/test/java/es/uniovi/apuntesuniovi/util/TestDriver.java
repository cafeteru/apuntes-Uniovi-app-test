package es.uniovi.apuntesuniovi.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class to create a instance of Google Chrome
 */
public class TestDriver {
    public static WebDriver driver;
    public static TestUtil testUtil;

    /**
     * Get instance of Webdriver
     *
     * @return instance of Webdriver
     */
    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
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
}
