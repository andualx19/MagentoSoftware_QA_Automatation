package pages.productsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Sleeper;

public class FitnessPage extends ProductBasePage{
    @FindBy(css = ".products.list.items.product-items .item.product.product-item:nth-child(10) .product-item-info")
    WebElement product;

    public FitnessPage(WebDriver driver) {
        super(driver);
        CART_BUTTON = "#product-addtocart-button";
    }

    public void pressFitnessProduct() {
        Sleeper.waitUntilIsVisible(driver, product);
        product.click();
    }

    @Override
    public void pressAddToCartButton() {
        super.pressAddToCartButton();
    }
}
