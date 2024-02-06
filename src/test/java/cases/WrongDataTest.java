package cases;

import org.testng.annotations.Test;
import pages.createPage.CreateAccountPage;
import pages.createPage.WrongCreatePage;

public class WrongDataTest extends BaseTest {
    @Test
    public void correctNameFieldTest() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        WrongCreatePage createPage = new WrongCreatePage(driver);
        createAccountPage.enterCreateAccountWindowTest();
        createPage.fillWithCase1();
        createAccountPage.clickOnCreateButton();
        createPage.verifyCase1();
    }

    @Test
    public void fillWithWrongMailTest() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        WrongCreatePage createPage = new WrongCreatePage(driver);
        createAccountPage.enterCreateAccountWindowTest();
        createPage.fillWithCase2();
        createAccountPage.clickOnCreateButton();
        createPage.verifyCase2();
    }

    @Test
    public void fillWithCorrectMailTest() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        WrongCreatePage createPage = new WrongCreatePage(driver);
        createAccountPage.enterCreateAccountWindowTest();
        createPage.fillWithCase3();
        createAccountPage.clickOnCreateButton();
        createPage.verifyCase3();
    }

    @Test
    public void fillWithLowPowerPassword() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        WrongCreatePage createPage = new WrongCreatePage(driver);
        createAccountPage.enterCreateAccountWindowTest();
        createPage.fillWithCase4();
        createAccountPage.clickOnCreateButton();
        createPage.verifyCase4();
    }

    @Test
    public void fillWithCorectPassword() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        WrongCreatePage createPage = new WrongCreatePage(driver);
        createAccountPage.enterCreateAccountWindowTest();
        createPage.fillWithCase5();
        createAccountPage.clickOnCreateButton();
        createPage.verifyCase5();
    }

    @Test
    public void fillWithIncorrectConfPassword() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        WrongCreatePage createPage = new WrongCreatePage(driver);
        createAccountPage.enterCreateAccountWindowTest();
        createPage.fillWithCase6();
        createAccountPage.clickOnCreateButton();
        createPage.verifyCase6();
    }
}
