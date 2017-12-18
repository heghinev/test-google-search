import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.GooglePage;

public class GoogleSearch {
        private ChromeDriver driver;
        private GooglePage googleURL;


        @BeforeMethod
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
            driver = new ChromeDriver();
            googleURL = new GooglePage(driver);
        }

        @Test
        public void search(){
            //driver.get("https://www.google.am");
            //driver.findElement(By.id("lst-ib")).sendKeys("Armenia");
            //driver.findElement(By.cssSelector("input[name='btnK']")).click();
            googleURL.click("Armenia");


            assertTrue("Wikipedia page is not found!",
                        googleURL.isDisplayed());

        }

        private void assertTrue(String s, boolean displayed) {
            //To change body of created methods use File | Settings | File Templates.
        }



        @AfterMethod
        public void tearDown(){
            driver.close();
            driver.quit();
        }
}


