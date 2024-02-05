package cases;

import org.testng.annotations.Test;
import pages.BasePage;

public class BasicCaseTest extends BaseTest {
    BasePage basePage = new BasePage(driver);

    @Test
    public void leaveAllFieldsBlank() {
        basePage.enterCreateAccountWindowTest();
        basePage.clickOnCreateButton();
        basePage.verifyErrorProperties();
    }

    @Test
    public void fillWithCorrectData() {
        basePage.enterCreateAccountWindowTest();
        basePage.fillWithCorrectData();
        basePage.clickOnCreateButton();
        basePage.verifyTitle();
    }
}
