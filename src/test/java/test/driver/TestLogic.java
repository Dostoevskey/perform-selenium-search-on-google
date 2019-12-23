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

    @FindBy(css = "ul[role='listbox']")
    private WebElement seleniumName;

    @FindBy(xpath = "//a[contains(.,'www.seleniumhq.org')]/span[contains(.,'Selenium')]")
    private WebElement seleniumNameWhenImage;

    /*@FindBy(name = "q")
    private WebElement FIND_BY_NAME;
*/
    private static final By FIND_BY_NAME = By.name("q");

    @FindBy(css = "#hdtb-msb-vis div:nth-child(1) a")
    private WebElement goToAll;

    public void doSearch(String text) {
        webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated((By) FIND_BY_NAME)).sendKeys(text);
    }

    public void assertSearch() {
        Assert.assertTrue(seleniumName.getText().contains("Selenium"));

    }

    public void doImage() {
        driver.findElement(By.cssSelector("#hdtb-msb-vis div:nth-child(3) a")).click();

    }

    public void assertSearchByImage() {
        driver.findElement(By.xpath("//img[@id='bi_EQbbxaRl0hM:']")).click();
        Assert.assertEquals(seleniumNameWhenImage.getText(), "Selenium");
    }

    public void doReturnToAll() {
        goToAll.click();
    }

}
