package es.uniovi.apuntesuniovi.tests;

import es.uniovi.apuntesuniovi.model.SweetAlert;
import es.uniovi.apuntesuniovi.util.TestDriver;
import es.uniovi.apuntesuniovi.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Abstract test where common aspects are defined
 */
public abstract class AbstractTest {
    protected static WebDriver driver;
    protected static TestUtil testUtil;
    protected SweetAlert sweetAlert;

    public AbstractTest() {
        driver = TestDriver.getDriver();
        testUtil = TestDriver.getTestUtil();
    }

    protected void closeAndGetSweetAlert() {
        sweetAlert = new SweetAlert();
        sweetAlert.setTitle(driver.findElement(By.id("swal2-title")).getText());
        sweetAlert.setContent(driver.findElement(By.id("swal2-content")).getText());
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    }
}
