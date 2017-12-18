package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage {
    private WebDriver driver;
    private String googleURL = "https://www.google.am";
    private By inputLocator = By.id("lst-ib");
    private By buttonLocator = By.cssSelector("input[name='btnK']");
    private By resultLocator = By.cssSelector(".r");

    public GooglePage(WebDriver webdriver) {
        super(webdriver);
        type(googleURL);
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public void click(String searchText){
        click(inputLocator).sendKeys(searchText);
        click(buttonLocator).click();
    }

    public boolean isDisplayed(){
        return isDisplayed(resultLocator).isDisplayed();
    }
}

