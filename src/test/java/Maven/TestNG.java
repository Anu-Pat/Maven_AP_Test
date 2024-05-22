package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {

    @Test
    public void basicofTestNG1() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();                     //upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.close();
    }

    @Test
    public void basicofTestNG2() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();                     //upcasting
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        driver.close();
    }
}

