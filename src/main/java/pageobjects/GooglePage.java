package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage {
    private String googleURL = "https://www.google.am";
    private By inputLocator = By.cssSelector("input#lst-ib");

    public GooglePage(WebDriver webdriver) {
        super(webdriver);
        visit(googleURL);
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public void search(String text) {
        WebElement webElement = find(inputLocator);
        webElement.clear();
        type(inputLocator, text);
        webElement.sendKeys(Keys.RETURN);
    }

    public boolean containsText(String text) {
        return driver.getPageSource().contains(text);
    }
}

