package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Sleeper;

public class WomenPage extends BasePage {
    @FindBy(css = "#narrow-by-list2 .items .item:nth-child(1)")
    WebElement topsButton;

    @FindBy(css = "#narrow-by-list .filter-options-item.allow .filter-options-title")
    WebElement categoryButton;

    @FindBy(css = "#narrow-by-list > div.filter-options-item.allow.active > div.filter-options-content > ol > li:nth-child(3)")
    WebElement teesButton;

    @FindBy(css = "#narrow-by-list .filter-options-item:nth-child(1)")
    WebElement styleButton;

    @FindBy(css = "div.filter-options-item.allow.active div.filter-options-content ol.items:nth-child(1) li.item:nth-child(1)")
    WebElement teeButtonFromStyle;

    @FindBy(css = "#narrow-by-list .filter-options-item:first-child .filter-options-title:nth-child(1)")
    WebElement sizeButton;

    @FindBy(css = "#narrow-by-list > div.filter-options-item.allow.active > div.filter-options-content > div > div > a:nth-child(1) > div")
    WebElement sizeMButton;

    public WomenPage(WebDriver driver) {
        super(driver);
    }

    public void clickTopButton() {
        Sleeper.waitUntilIsVisible(driver, topsButton);
        topsButton.click();
    }

    public void clickOnCategoryButton() {
        Sleeper.waitUntilIsVisible(driver, categoryButton);
        categoryButton.click();
    }

    public void clickTeesButton() {
        Sleeper.waitUntilIsVisible(driver, teesButton);
        teesButton.click();
    }

    public void clickStyleButton() {
        Sleeper.waitUntilIsVisible(driver, styleButton);
        styleButton.click();
    }

    public void clickTeeButtonFromStyle() {
        Sleeper.waitUntilIsVisible(driver, teeButtonFromStyle);
        teeButtonFromStyle.click();
    }

    public void clickSizeButton() {
        Sleeper.waitUntilIsVisible(driver, sizeButton);
        styleButton.click();
    }

    public void clickMSizeButton() {
        Sleeper.waitUntilIsVisible(driver, sizeMButton);
        sizeMButton.click();
    }
}
