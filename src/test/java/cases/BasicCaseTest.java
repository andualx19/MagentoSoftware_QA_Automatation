package cases;

import org.testng.annotations.Test;
import pages.createPage.CreateAccountPage;

public class BasicCaseTest extends BaseTest {
    @Test
    public void leaveAllFieldsBlank() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.enterCreateAccountWindowTest();
        createAccountPage.clickOnCreateButton();
        createAccountPage.verifyErrorProperties();
    }

    @Test
    public void fillWithCorrectData() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.enterCreateAccountWindowTest();
        createAccountPage.fillWithCorrectData();
        createAccountPage.clickOnCreateButton();
        createAccountPage.verifyTitle();
    }
}
