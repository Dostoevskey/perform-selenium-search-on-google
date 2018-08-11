package test.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriveMaster {

    public static WebDriver driver;

    DriveMaster() {
    }

    @BeforeTest(alwaysRun = true)
    public static WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Igor\\IdeaProject\\drivers\\chromedriver.exe");
        if (driver == null) {
            driver = new ChromeDriver();
        }
        //driver.get("https://google.com");
        return driver;
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



