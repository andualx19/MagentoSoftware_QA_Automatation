package cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import data.Constants;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    protected void setup() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(String.valueOf(Constants.URL));
    }

    @AfterTest
    protected void shutDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
