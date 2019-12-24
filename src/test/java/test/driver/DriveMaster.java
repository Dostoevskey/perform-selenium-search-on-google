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

    @BeforeTest(alwaysRun = true)
    public void start() {
        if (threadLocalDriver.get() != null) {
            driver = threadLocalDriver.get();
            return;
        }
        WebDriverManager.chromedriver().version("79.0").setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/ncr");
    }

    @AfterTest(alwaysRun = true)
    public void stop() {
        if (driver != null) {
            driver.close();
        }
        driver = null;
    }

}




