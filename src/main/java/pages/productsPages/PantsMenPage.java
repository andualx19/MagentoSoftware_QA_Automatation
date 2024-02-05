package pages.productsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PantsMenPage extends ProductBasePage {
    public PantsMenPage(WebDriver driver) {
        super(driver);
        SIZE = "//div[@id='option-label-size-143-item-177']";
        COLOR = "//div[@id='option-label-color-93-item-50']";
        CART_BUTTON = ".action.primary.tocart";
    }

    @Override
    public void selectSizeAndColor() {
        super.selectSizeAndColor();
    }

    @Override
    public void pressAddToCartButton() {
        super.pressAddToCartButton();
    }

    public void clickOnProduct() {
        driver.findElement(By.
                cssSelector(".products.list.items.product-items .item.product.product-item:nth-child(2)")).click();
    }
}
