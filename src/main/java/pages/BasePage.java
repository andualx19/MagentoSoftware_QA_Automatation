package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Constants;
import utils.ErrorWarnings;
import utils.Sleeper;

public class BasePage {
    public final WebDriver driver;
    public WebElement[] fields, errors;
    @FindBy(css = ".base")
    WebElement actualText;

    @FindBy(xpath = "(//a[contains(text(), 'Create an Account')])[1]")
    WebElement createAccountButton;

    @FindBy(css = ".action.submit.primary")
    WebElement createButton;

    // Correct
    @FindBy(css = "#firstname")
    WebElement firstname;

    @FindBy(css = "#lastname")
    WebElement lastname;

    @FindBy(css = "#email_address")
    WebElement email;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "#password-confirmation")
    WebElement passwordConf;

    // Errors
    @FindBy(css = "#firstname-error")
    WebElement firstnaemErr;

    @FindBy(css = "#lastname-error")
    WebElement lastnameErr;

    @FindBy(css = "#email_address-error")
    WebElement emailErr;

    @FindBy(css = "#password-error")
    WebElement passwordErr;

    @FindBy(css = "#password-confirmation-error")
    WebElement passwordConfErr;

    // Title
    @FindBy(css = ".base")
    WebElement title;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnCreateButton() {
        Sleeper.waitUntilIsVisible(driver, createButton);
        createButton.click();
    }

    public void enterCreateAccountWindowTest() {
        Sleeper.waitUntilIsVisible(driver, createAccountButton);
        createAccountButton.click();
        String expectedText = "Create New Customer Account";
        Sleeper.waitUntilIsVisible(driver, actualText);
        Assert.assertEquals(actualText.getText(), expectedText, ErrorWarnings.WRONG_TEXT_DISPLAYED);
    }

    public void verifyErrorProperties() {
        errors = new WebElement[] {firstnaemErr, lastnameErr, emailErr, passwordErr, passwordConfErr};
        for (WebElement element : errors) {
            Sleeper.waitUntilIsVisible(driver, element);
            Assert.assertEquals(element.getCssValue(Constants.PROPERTY_COLOR), Constants.RED_COLOR,
                    ErrorWarnings.WRONG_COLOR_DISPLAYED);
        }
    }

    public void fillWithCorrectData() {
        fields = new WebElement[] {firstname, lastname, email, password, passwordConf};

        for (int i = 0; i < fields.length; i++) {
            Sleeper.waitUntilIsVisible(driver, fields[i]);
            try {
                fields[i].sendKeys(Constants.DATA[i]);
            } catch (IndexOutOfBoundsException e) {
                fields[i].sendKeys(Constants.DATA[3]);
            }
        }
    }

    public void verifyTitle() {
        Sleeper.waitUntilIsVisible(driver, title);
        Assert.assertEquals(title.getText(), "My Account", ErrorWarnings.WRONG_TEXT_DISPLAYED);
    }
}
