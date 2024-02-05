package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Sleeper;

public class CheckOutPage extends BasePage {
    public static final String COMPANY = "Company", ADRESS = "Sos. Crocodililor", CITY = "Bucuresti", ZIP = "123456", PHONE = "21323543";

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public void completeFieldWithInformation(String xpath, String info) {
        Sleeper.waitInSeconds(1);
        driver.findElement(By.xpath("//input[@name='" + xpath + "']")).sendKeys(info);
    }

    public void completeCompanyField() {
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys(COMPANY);
    }

    public void clickAndSelectField(String xpath, String selection) {
        driver.findElement(By.xpath("//input[@name='" + xpath + "']")).click();
        WebElement element = driver.findElement(By.xpath(selection));
        Sleeper.waitUntilIsVisible(driver, element);
        element.click();
    }

    public void pressNextButton() {
        driver.findElement(By.cssSelector(".button.action.continue.primary")).click();
    }

    public void pressOrderCheckout() {
        WebElement element = driver.findElement(By.cssSelector(".action.primary.checkout"));
        Sleeper.waitUntilIsVisible(driver, element);
        element.click();
    }
}
