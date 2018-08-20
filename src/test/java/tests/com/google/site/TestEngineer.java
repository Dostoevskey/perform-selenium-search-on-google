package tests.com.google.site;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestEngineer {

    protected WebDriver driver;

    public WebDriverWait driverWait;

    @BeforeTest
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void startTest() throws InterruptedException {
        //driver.get("http://www.test-engineer.site");
        driver.get("http://test-engineer.site/testroom/");
        //driver.findElement(By.xpath("//a[contains(.,'Test Room')]"));
        //driver.findElement(By.cssSelector("a[id='login_link']")).click();
        //sleep(3000);
        driver.findElement(By.cssSelector("#login_link")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("p[id='result']")).getText(),"This is LOGIN PAGE");
        driver.findElement(By.cssSelector("#login_click")).click();
//        driver.switchTo().alert()...
//        driver.switchTo().frame(WebElement)
        //driver.switchTo().defaultContent();

        driver.findElement(By.name("login_field")).sendKeys("Testr");


    }


    @AfterTest
    public void stop() {
        driver.quit();
    }


}
