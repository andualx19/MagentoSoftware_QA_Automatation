package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Sleeper;
import org.testng.Assert;
import utils.ErrorWarnings;

public class HomePage extends BasePage {
    @FindBy(css = "#ui-id-4")
    WebElement womenButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void confirmLogIn() {
        Sleeper.waitInSeconds(2);
        WebElement text = driver.findElement(By.cssSelector(".panel.header .greet.welcome"));
        Sleeper.waitUntilIsVisible(driver, text);
        String expectedResult = "Welcome, Crocodil Pisica!",
               actualResult = text.getText();
        Assert.assertEquals(actualResult, expectedResult, ErrorWarnings.WRONG_TEXT_DISPLAYED);
    }

    public void pressFirstCategoryButton() {
        Sleeper.waitUntilIsVisible(driver, womenButton);
        womenButton.click();
    }

    public void pressJacketButton() {
        WebElement jacketButton = driver.findElement(By.xpath("//a[contains(text(), 'Jackets')]"));
        Sleeper.waitUntilIsVisible(driver, jacketButton);
        jacketButton.click();
    }

    public void pressSecondCategoryButton() {
        WebElement menButton = driver.findElement(By.cssSelector("#ui-id-5"));
        Sleeper.waitUntilIsVisible(driver, menButton);
        menButton.click();
    }

    public void pressPantsButton() {
        WebElement pantsButton = driver.findElement(By.
                xpath("//a[contains(text(), 'Shorts')]"));
        Sleeper.waitUntilIsVisible(driver, pantsButton);
        pantsButton.click();
    }

    public void pressThirdCategoryButton() {
        WebElement gearButton = driver.findElement(By.cssSelector("#ui-id-6"));
        Sleeper.waitUntilIsVisible(driver, gearButton);
        gearButton.click();
    }

    public void pressFitnessButton() {
        WebElement fitnessButton = driver.findElement(By.
                cssSelector("#maincontent > div.columns > div.sidebar.sidebar-main > div.widget.block.block-static-block > div > ul > li:nth-child(2)"));
        Sleeper.waitUntilIsVisible(driver, fitnessButton);
        fitnessButton.click();
    }
}
