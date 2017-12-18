package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver webdriver){
        this.driver = webdriver;
    }

    public void type(String url){
        driver.get(url);
    }

    public WebElement click(By locator){
        return driver.findElement(locator);
    }

    public WebElement isDisplayed(By locator){
        return driver.findElement(locator).;
    }
}
