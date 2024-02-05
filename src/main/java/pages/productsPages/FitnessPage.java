package pages.productsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Sleeper;

public class FitnessPage extends ProductBasePage{
    public FitnessPage(WebDriver driver) {
        super(driver);
        CART_BUTTON = "#product-addtocart-button";
    }

    public void pressFitnessProduct() {
        WebElement product = driver.findElement(
                By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[4]/ol/li[2]/div/a/span/span"));
        Sleeper.waitUntilIsVisible(driver, product);
        product.click();
    }

    @Override
    public void pressAddToCartButton() {
        super.pressAddToCartButton();
    }
}
