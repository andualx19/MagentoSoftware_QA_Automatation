package pages.createPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import data.Constants;
import data.ErrorWarnings;
import utils.Sleeper;

public class WrongCreatePage extends StructureCreatePage {
    public WrongCreatePage(WebDriver driver) {
        super(driver);
    }

    public void fillWithCase1() {
        fields = new WebElement[] {firstname, lastname};

        for (int i = 0; i < fields.length; i++) {
            Sleeper.waitUntilIsVisible(driver, fields[i]);
            fields[i].sendKeys(Constants.DATA[i]);
        }
    }

    public void verifyCase1() {
        errors = new WebElement[] {emailErr, passwordErr, passwordConfErr};

        for (WebElement error : errors) {
            Sleeper.waitUntilIsVisible(driver, error);
            Assert.assertEquals(error.getCssValue("color"), Constants.RED_COLOR,
                    ErrorWarnings.WRONG_COLOR_DISPLAYED);
        }
    }

    public void fillWithCase2() {
        fields = new WebElement[] {firstname, lastname, email};

        for (int i = 0; i < fields.length; i++) {
            Sleeper.waitUntilIsVisible(driver, fields[i]);
            if (i == fields.length - 1) fields[i].sendKeys(Constants.WDATA[0]);
            else fields[i].sendKeys(Constants.DATA[i]);
        }
    }

    public void verifyCase2() {
        errors = new WebElement[] {emailErr, passwordErr, passwordConfErr};
        verifyErrorProperties();
        Assert.assertEquals(errors[0].getText(), "Please enter a valid email address (Ex: johndoe@domain.com).",
                ErrorWarnings.WRONG_TEXT_DISPLAYED);
    }

    public void fillWithCase3() {
        fields = new WebElement[] {firstname, lastname, email};

        for (int i = 0; i < fields.length; i++) {
            Sleeper.waitUntilIsVisible(driver, fields[i]);
            fields[i].sendKeys(Constants.DATA[i]);
        }
    }

    public void verifyCase3() {
        Sleeper.waitUntilIsVisible(driver, passwordErr);
        Assert.assertEquals(passwordErr.getCssValue("color"), Constants.RED_COLOR,
                ErrorWarnings.WRONG_COLOR_DISPLAYED);
    }

    public void fillWithCase4() {
        fields = new WebElement[] {firstname, lastname, email, password};

        for (int i = 0; i < fields.length; i++) {
            Sleeper.waitUntilIsVisible(driver, fields[i]);
            if (Constants.DATA[i].equals("passWORD!")) fields[i].sendKeys(Constants.WDATA[1]);
            else fields[i].sendKeys(Constants.DATA[i]);
        }
    }

    public void verifyCase4() {
        errors = new WebElement[] {passwordErr, passwordConfErr};
        verifyErrorProperties();
        String expectedTxt = "Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.";
        Assert.assertEquals(errors[0].getText(), expectedTxt, ErrorWarnings.WRONG_TEXT_DISPLAYED);
    }

    public void fillWithCase5() {
        fields = new WebElement[] {firstname, lastname, email, password};

        for (int i = 0; i < fields.length; i++) {
            Sleeper.waitUntilIsVisible(driver, fields[i]);
            fields[i].sendKeys(Constants.DATA[i]);
        }
    }

    public void verifyCase5() {
        Sleeper.waitUntilIsVisible(driver, passwordConfErr);
        Assert.assertEquals(passwordConfErr.getCssValue("color"), Constants.RED_COLOR, ErrorWarnings.WRONG_COLOR_DISPLAYED);
    }

    public void fillWithCase6() {
        fields = new WebElement[] {firstname, lastname, email, password, passwordConf};

        for (int i = 0; i < fields.length; i++) {
            Sleeper.waitUntilIsVisible(driver, fields[i]);
            try {
                fields[i].sendKeys(Constants.DATA[i]);
            } catch (IndexOutOfBoundsException e) {
                fields[i].sendKeys(Constants.WDATA[1]);
            }
        }
    }

    public void verifyCase6() {
        Sleeper.waitUntilIsVisible(driver, passwordConfErr);
        Assert.assertEquals(passwordConfErr.getCssValue("color"), Constants.RED_COLOR,
                ErrorWarnings.WRONG_COLOR_DISPLAYED);
        Assert.assertEquals(passwordConfErr.getText(), "Please enter the same value again.",
                ErrorWarnings.WRONG_TEXT_DISPLAYED);
    }
}
