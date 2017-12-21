import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.GooglePage;

import static org.testng.AssertJUnit.assertTrue;

public class GoogleSearchTest {
        private ChromeDriver driver;
    private GooglePage googlePage;


        @BeforeMethod
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            googlePage = new GooglePage(driver);
        }

        @Test
        public void searchArmenia() {
           /* googlePage.search("sdfghjk");
            AssertJUnit.assertFalse("Wikipedia page should not be found!", googlePage.containsText("Armenia - Wikipedia"));

            googlePage.search("Armenia");
            AssertJUnit.assertTrue("Wikipedia page is not found!", googlePage.containsText("Armenia - Wikipedia"));
           */

            googlePage.search("Armenia");
            assertTrue(googlePage.getFirstResult().getText().contains("Wikipedia"));
        }



        @AfterMethod
        public void tearDown(){
            driver.close();
            driver.quit();
        }
}


