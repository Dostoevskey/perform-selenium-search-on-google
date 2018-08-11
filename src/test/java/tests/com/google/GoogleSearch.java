package tests.com.google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class GoogleSearch {

    WebDriver driver;

    @BeforeTest
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

//    public void
//


    @Test
    public void doFoundSelenium() {
        driver.get("https://www.google.com/ncr");
        driver.findElement(By.name("q")).sendKeys("selenium" + "\n");
        assertTrue((driver.findElement
                (By.xpath("//*[@class='rc' and contains(.,'https://www.seleniumhq.org/')]"))),"https://www.seleniumhq.org/");

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }


}
