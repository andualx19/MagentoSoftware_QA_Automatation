package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;
import utils.Sleeper;

public class CheckOutPage extends BasePage {
    @FindBy(xpath = "//input[@name='company']") WebElement company;

    @FindBy(css = ".button.action.continue.primary") WebElement nextButton;

    @FindBy(css = ".action.primary.checkout") WebElement checkoutButton;

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public void completeFieldWithInformation(String xpath, String info) {
        Sleeper.waitInSeconds(1);
        WebElement element = driver.findElement(By.xpath(STR."//input[@name='\{xpath}']"));
        Sleeper.waitUntilIsInteractable(driver, element);
        element.sendKeys(info);
    }

    public void completeCompanyField() {
        Sleeper.waitUntilIsInteractable(driver, company);
        company.sendKeys(Constants.COMPANY);
    }

    public void clickAndSelectField(String xpath, String selection) {
        driver.findElement(By.xpath(STR."//select[@name='\{xpath}']")).click();
        WebElement element = driver.findElement(By.xpath(selection));
        Sleeper.waitUntilIsVisible(driver, element);
        element.click();
    }

    public void pressNextButton() {
        Sleeper.waitUntilIsVisible(driver, nextButton);
        nextButton.click();
    }

    public void pressOrderCheckout() {
        Sleeper.waitUntilIsVisible(driver, checkoutButton);
        checkoutButton.click();
    }
}
