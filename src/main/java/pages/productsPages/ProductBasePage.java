package pages.productsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.Sleeper;

public abstract class ProductBasePage extends BasePage {
    protected String SIZE, COLOR, CART_BUTTON;

    public ProductBasePage(WebDriver driver) {
        super(driver);
    }

    public void selectSizeAndColor() {
        Sleeper.waitInSeconds(2);
        WebElement element = driver.findElement(By.xpath(SIZE)),
                   element1 = driver.findElement(By.xpath(COLOR));
        Sleeper.waitUntilIsVisible(driver, element);
        Sleeper.waitUntilIsVisible(driver, element1);
        element.click();
        element1.click();
    }

    public void pressAddToCartButton() {
        driver.findElement(By.cssSelector(CART_BUTTON)).click();
    }

    public void pressCartButton() {
        driver.findElement(By.cssSelector(".action.showcart")).click();
    }
}
