package test.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriveMaster {

    protected WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/ncr");
    }

    @AfterTest(alwaysRun = true)
    public void stop() {
        if (driver != null) {
            driver.close();
//            driver.quit();
        }
        driver = null;
    }

}


//public class DriveMaster {
//
//    private final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<WebDriver>();
//    protected WebDriver driver;
//
//
//    @BeforeClass
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Igor\\IdeaProject\\drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//    }
//
//    @AfterClass
//    public void teardown() {
//        driver.close();
////    driver.quit();
//    }
//}



