package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethod {
    public WebDriver driver;

        @BeforeMethod
        public void BeforeMethodExample(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        @Test
        public void annotationMethod1() {
            driver.get("https://www.letskodeit.com/practice");
            driver.manage().window().maximize();
        }

        @Test
        public void annotationMethod2() {

            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();
    }

    @AfterMethod
    public void AfterMethodExample(){
        driver.close();

    }
}
