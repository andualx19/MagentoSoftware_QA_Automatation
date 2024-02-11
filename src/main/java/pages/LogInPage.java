package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import data.Constants;

public class LogInPage extends BasePage {
    @FindBy(css = "#email")
    WebElement email;

    @FindBy(css = "#pass")
    WebElement password;

    @FindBy(css = ".action.login.primary")
    WebElement signInButton;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void completeWithEmailAndPassWord() {
        email.sendKeys(Constants.EMAIL);
        password.sendKeys(Constants.PASSWORD);
    }

    public void pressLogInButton() {
        signInButton.click();
    }
}
