package pages.createPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import data.Constants;
import data.ErrorWarnings;
import utils.Auxiliar;
import utils.Sleeper;

public class CreateAccountPage extends StructureCreatePage {
    @FindBy(css = ".base")
    WebElement actualText;

    @FindBy(xpath = "(//a[contains(text(), 'Create an Account')])[1]")
    WebElement createAccountButton;

    @FindBy(css = ".action.submit.primary")
    WebElement createButton;

    @FindBy(css = ".base")
    WebElement title;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
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

    public void fillWithCorrectData() {
        fields = new WebElement[] {firstname, lastname, email, password, passwordConf};

        for (int i = 0; i < fields.length; i++) {
            Sleeper.waitUntilIsVisible(driver, fields[i]);
            try {
                fields[i].sendKeys(Auxiliar.DATA[i]);
            } catch (IndexOutOfBoundsException e) {
                fields[i].sendKeys(Auxiliar.DATA[3]);
            }
        }
    }

    public void verifyTitle() {
        Sleeper.waitUntilIsVisible(driver, title);
        Assert.assertEquals(title.getText(), "My Account", ErrorWarnings.WRONG_TEXT_DISPLAYED);
    }
}
