package cases;

import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.HomePage;
import pages.LogInPage;
import pages.WomenPage;

public class FiltersTest extends BaseTest {
    @Test
    public void caseWomenFilters() {
        HeaderPage headerPage = new HeaderPage(driver);
        LogInPage logInPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        WomenPage womenPage = new WomenPage(driver);
        // log in
        headerPage.clickSignInButton();
        logInPage.completeWithEmailAndPassWord();
        logInPage.pressLogInButton();
        // to women section & tees
        homePage.pressFirstCategoryButton();
        womenPage.clickTopButton();
        womenPage.clickOnCategoryButton();
        womenPage.clickTeesButton();
        // to style
        womenPage.clickStyleButton();
        womenPage.clickTeeButtonFromStyle();
        // to size
        womenPage.clickSizeButton();
        womenPage.clickMSizeButton();
        
    }
}
