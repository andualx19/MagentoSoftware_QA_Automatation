package cases;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.WrongCreatePage;

public class WrongDataTest extends BaseTest {
    BasePage basePage = new BasePage(driver);
    WrongCreatePage createPage = new WrongCreatePage(driver);

    @Test
    public void correctNameFieldTest() {
        basePage.enterCreateAccountWindowTest();
        createPage.fillWithCase1();
        basePage.clickOnCreateButton();
        createPage.verifyCase1();
    }

    @Test
    public void fillWithWrongMailTest() {
        basePage.enterCreateAccountWindowTest();
        createPage.fillWithCase2();
        basePage.clickOnCreateButton();
        createPage.verifyCase2();
    }

    @Test
    public void fillWithCorrectMailTest() {
        basePage.enterCreateAccountWindowTest();
        createPage.fillWithCase3();
        basePage.clickOnCreateButton();
        createPage.verifyCase3();
    }

    @Test
    public void fillWithLowPowerPassword() {
        basePage.enterCreateAccountWindowTest();
        createPage.fillWithCase4();
        basePage.clickOnCreateButton();
        createPage.verifyCase4();
    }

    @Test
    public void fillWithCorectPassword() {
        basePage.enterCreateAccountWindowTest();
        createPage.fillWithCase5();
        basePage.clickOnCreateButton();
        createPage.verifyCase5();
    }

    @Test
    public void fillWithIncorrectConfPassword() {
        basePage.enterCreateAccountWindowTest();
        createPage.fillWithCase6();
        basePage.clickOnCreateButton();
        createPage.verifyCase6();
    }
}
