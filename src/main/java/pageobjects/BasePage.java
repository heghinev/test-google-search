package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver webdriver){
        this.driver = webdriver;
    }

    public void visit(String url) {
        driver.get(url);
    }

    public WebElement click(By locator){
        return driver.findElement(locator);
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public void type(By locator, String searchText) {
        WebElement webElement = find(locator);
        webElement.sendKeys(searchText);
    }


    public boolean found(By locator) {
        return find(locator).isDisplayed();
    }
}
