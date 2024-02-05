package pages.productsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JacketsWomenPage extends ProductBasePage {
    public JacketsWomenPage(WebDriver driver) {
        super(driver);
        SIZE = "//div[@id='option-label-size-143-item-168']";
        COLOR = "//div[@id='option-label-color-93-item-57']";
        CART_BUTTON = "#product-addtocart-button";
    }

    public void clickOnProduct() {
        driver.findElement(By.
                cssSelector(".products.list.items.product-items .item.product.product-item:first-child")).click();
    }

    @Override
    public void selectSizeAndColor() {
        super.selectSizeAndColor();
    }

    @Override
    public void pressAddToCartButton() {
        super.pressAddToCartButton();
    }
}
