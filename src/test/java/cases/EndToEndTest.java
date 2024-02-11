package cases;

import data.Constants;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.HeaderPage;
import pages.HomePage;
import pages.productsPages.FitnessPage;
import pages.productsPages.JacketsWomenPage;
import pages.LogInPage;
import pages.productsPages.PantsMenPage;

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
        checkOutPage.completeFieldWithInformation(String.valueOf(Constants.STREET_X), String.valueOf(Constants.ADRESS));
        checkOutPage.completeFieldWithInformation(String.valueOf(Constants.CITY_X), String.valueOf(Constants.CITY));
        checkOutPage.completeFieldWithInformation(String.valueOf(Constants.ZIP_X), String.valueOf(Constants.ZIP));
        checkOutPage.completeFieldWithInformation(String.valueOf(Constants.PHONE_X), String.valueOf(Constants.PHONE));
        checkOutPage.clickAndSelectField(String.valueOf(Constants.COUNTRY_I_X), String.valueOf(Constants.COUNTRY_O_X));
        checkOutPage.clickAndSelectField(String.valueOf(Constants.JUDET_I_X), String.valueOf(Constants.JUDET_O_X));

        checkOutPage.pressNextButton();
        checkOutPage.pressOrderCheckout();
    }
}
