package test.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestLogic extends PageObject {

    public TestLogic(WebDriver driver) {
        super(driver);
    }

    public WebDriverWait webDriverWait;

    @FindBy(xpath = "//*[@id='ires' and contains(.,'Selenium - Web Browser Automation')]")
//    @FindBy(xpath = "//a[contains(@href,'www.seleniumhq.org')]")
    private WebElement seleniumName;

    @FindBy(xpath = "//a[contains(.,'www.seleniumhq.org')]/span[contains(.,'Selenium')]")
    //--- $$("div.irc_hd span:nth-child(1)") -- $$("span.oedJWe span:nth-child(1)") --$x("//ancestor::img[parent::id='search'][1]") --$$("div#search a.rg_l>img:nth-of-type(1)")
//    @FindBy(css = "div.rc a[href='https://www.seleniumhq.org/']")
//    @FindBy(xpath = "//a[contains(@href,'www.seleniumhq.org')]")
    private WebElement seleniumNameWhenImage;

    @FindBy(name = "q")
    private WebElement findByName;

    @FindBy(css = "#hdtb-msb-vis div:nth-child(1) a")
    private WebElement goToAll;

    public void doSearch() {
        //      driver.findElement(By.name("q")).sendKeys("selenium" + "\n"); // ToDo add annotations for byName and sendKeys
        webDriverWait = new WebDriverWait(driver,10); //ToDo Move to upper to be accessible from other methods.
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated((By) findByName));
        findByName.sendKeys("selenium" + "\n"); // ToDo add annotations for byName and sendKeys
    }

    public void assertSearch() { // this method doesn't work
        Assert.assertTrue(seleniumName.getText().contains("Selenium - Web Browser Automation")); //ToDo: There are double 'contains' in method && locator,

//    webDriverWait.until(ExpectedConditions.visibilityOf(findByName)).sendKeys("\n");
//      webDriverWait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf()));                      // ToDo: is it necessary?
    }

    public void doImage() {
        //driver.findElement(By.cssSelector("#hdtb-msb-vis a.q.qs[href*='/search?q=selenium']")).click(); // can't find uniq
        driver.findElement(By.cssSelector("#hdtb-msb-vis div:nth-child(3) a")).click();

        //driver.findElement(By.xpath("//a[contains(@class,'qs') and contains(text(), 'Images')]")).click();
        //                          ("//a[contains(@class,'qs') and contains(text()='Images')]")
        //                          ("//a[contains(@class,'qs') and [text()='Images']]")
        //                          ("#hdtb-msb-vis a.q.qs[href*='/search?q=selenium']")
    }

    public void assertSearchByImage() throws InterruptedException { // this method doesn't work
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[id='i48MSmX01sE18M:']"))); | java.lang.NullPointerException. Why?
//        webDriverWait.until(visibilityOfElementLocated(By.cssSelector("img[id='i48MSmX01sE18M:']"))); | java.lang.NullPointerException. Why?
//        driver.findElement(By.cssSelector("img[id='i48MSmX01sE18M:']")).click();
        //driver.findElement(By.id("i48MSmX01sE18M:")).click();
        driver.findElement(By.xpath("//img[@id='bi_EQbbxaRl0hM:']")).click();
        Assert.assertEquals(seleniumNameWhenImage.getText(),"Selenium");
        // "#rg_s a:nth-of-type(1) > img"
    }

    public void doReturnToAll() {
        goToAll.click();
    }

}
