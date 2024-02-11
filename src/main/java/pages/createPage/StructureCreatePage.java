package pages.createPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;
import data.Constants;
import data.ErrorWarnings;
import utils.Sleeper;

public abstract class StructureCreatePage extends BasePage {
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

    public StructureCreatePage(WebDriver driver) {
        super(driver);
    }

    public void verifyErrorProperties() {
        errors = new WebElement[] {firstnaemErr, lastnameErr, emailErr, passwordErr, passwordConfErr};
        for (WebElement element : errors) {
            Sleeper.waitUntilIsVisible(driver, element);
            Assert.assertEquals(element.getCssValue(String.valueOf(Constants.PROPERTY_COLOR)), Constants.RED_COLOR,
                    ErrorWarnings.WRONG_COLOR_DISPLAYED);
        }
    }
}
