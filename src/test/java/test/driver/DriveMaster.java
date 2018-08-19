package test.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriveMaster {

    public ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public WebDriver driver;

    public WebDriverWait webDriverWait;

    @BeforeTest(alwaysRun = true)
    public void start() {
        if (threadLocalDriver.get() != null) {
            driver = threadLocalDriver.get();
            webDriverWait = new WebDriverWait(driver, 10);
            return;
        }
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



