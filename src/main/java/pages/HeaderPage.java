package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Sleeper;

public class HeaderPage extends BasePage {
    public HeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".panel.header .authorization-link")
    WebElement signInButton;

    public void clickSignInButton() {
        Sleeper.waitUntilIsVisible(driver, signInButton);
        signInButton.click();
    }

    public void clickCartButton() {
        WebElement element = driver.findElement(By.cssSelector(".action.showcart"));
        Sleeper.waitUntilIsVisible(driver, element);
        element.click();
    }

    public void clickProceedCheckButton() {
        WebElement element = driver.findElement(By.cssSelector("#top-cart-btn-checkout"));
        Sleeper.waitUntilIsVisible(driver, element);
        element.click();
    }
}
