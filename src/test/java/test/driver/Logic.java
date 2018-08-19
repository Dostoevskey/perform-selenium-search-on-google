package test.driver;

//import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Logic extends PageObject {

    public WebDriverWait webDriverWait;

    @FindBy(xpath = "//*[@id='ires' and contains(.,'Selenium - Web Browser Automation')]")
//    @FindBy(xpath = "//a[contains(@href,'www.seleniumhq.org')]")
    private WebElement seleniumName;

    @FindBy(xpath = "//*[@id='ires' and contains(.,'Selenium - Web Browser Automation')]")
//    @FindBy(xpath = "//a[contains(@href,'www.seleniumhq.org')]")
    private WebElement seleniumNameWhenImage;

    @FindBy(name = "q")
    private WebElement findByName;

    public Logic(WebDriver driver) {
        super(driver);
    }

    public void doSearch() {
  //      driver.findElement(By.name("q")).sendKeys("selenium" + "\n"); // ToDo add annotations for byName and sendKeys
//        webDriverWait = new WebDriverWait(driver,10); //ToDo Move to upper to be acceseble from other methods.
//        webDriverWait.until(ExpectedConditions.presenceOfElementLocated((By) findByName));
        findByName.sendKeys("selenium" + "\n"); // ToDo add annotations for byName and sendKeys
    }


    public void assertSearch() { // this method doesn't work
        Assert.assertTrue(seleniumName.getText().contains("Selenium - Web Browser Automation")); //ToDo: There are double 'contains' in method && locator,

//    webDriverWait.until(ExpectedConditions.visibilityOf(findByName)).sendKeys("\n");
//      webDriverWait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf()));                      // ToDo: is it necessary?
    }

    public void assertSearchByImage() { // this method doesn't work
        Assert.assertTrue(seleniumNameWhenImage.getText().contains("Selenium - Web Browser Automation"));
    }

    public void doImage() {
        //driver.findElement(By.cssSelector("#hdtb-msb-vis a.q.qs[href*='/search?q=selenium']")).click(); // can't find uniq
        driver.findElement(By.cssSelector("#hdtb-msb-vis div:nth-child(2) a")).click();

        //driver.findElement(By.xpath("//a[contains(@class,'qs') and contains(text(), 'Images')]")).click();
        //                          ("//a[contains(@class,'qs') and contains(text()='Images')]")
        //                          ("//a[contains(@class,'qs') and [text()='Images']]")
        //                          ("#hdtb-msb-vis a.q.qs[href*='/search?q=selenium']")

    }

}
