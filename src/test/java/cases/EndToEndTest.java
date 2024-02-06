package cases;

import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.HeaderPage;
import pages.HomePage;
import pages.productsPages.FitnessPage;
import pages.productsPages.JacketsWomenPage;
import pages.LogInPage;
import pages.productsPages.PantsMenPage;
import utils.Constants;

public class EndToEndTest extends BaseTest {
    @Test
    public void buyThreeItemsTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        LogInPage logInPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        JacketsWomenPage jacketsWomenPage = new JacketsWomenPage(driver);
        PantsMenPage pantsMenPage = new PantsMenPage(driver);
        FitnessPage fitnessPage = new FitnessPage(driver);
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        // Sign In into account
        headerPage.clickSignInButton();
        logInPage.completeWithEmailAndPassWord();
        logInPage.pressLogInButton();
        // Confirm Log In
        homePage.confirmLogIn();
        // Buy three products
        homePage.pressFirstCategoryButton();
        homePage.pressJacketButton();
        jacketsWomenPage.clickOnProduct();
        jacketsWomenPage.selectSizeAndColor();
        jacketsWomenPage.pressAddToCartButton();

        homePage.pressSecondCategoryButton();
        homePage.pressPantsButton();
        pantsMenPage.clickOnProduct();
        pantsMenPage.selectSizeAndColor();
        pantsMenPage.pressAddToCartButton();

        homePage.pressThirdCategoryButton();
        homePage.pressFitnessButton();
        fitnessPage.pressFitnessProduct();
        fitnessPage.pressAddToCartButton();

        headerPage.clickCartButton();
        headerPage.clickProceedCheckButton();

        checkOutPage.completeCompanyField();
        checkOutPage.completeFieldWithInformation(Constants.STREET_X, Constants.ADRESS);
        checkOutPage.completeFieldWithInformation(Constants.CITY_X, Constants.CITY);
        checkOutPage.completeFieldWithInformation(Constants.ZIP_X, Constants.ZIP);
        checkOutPage.completeFieldWithInformation(Constants.PHONE_X, Constants.PHONE);
        checkOutPage.clickAndSelectField(Constants.COUNTRY_I_X, Constants.COUNTRY_O_X);
        checkOutPage.clickAndSelectField(Constants.JUDET_I_X, Constants.JUDET_O_X);

        checkOutPage.pressNextButton();
        checkOutPage.pressOrderCheckout();
    }
}
