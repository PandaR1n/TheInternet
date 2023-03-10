package CheckboxesTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class CheckboxPageTest {
        private WebDriver driver;
        private CheckboxPage checkboxPage;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "" + "F:\\Users\\Rinat\\IdeaProjects\\TheInternet\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://the-internet.herokuapp.com/checkboxes");
            checkboxPage = new CheckboxPage(driver);
        }

        @Test
        public void testCheckboxSelection() {

            checkboxPage.clickCheckbox();
            Assert.assertTrue(checkboxPage.isCheckboxSelected());

        }

        @After
        public void tearDown() {
            driver.quit();
        }
    }

