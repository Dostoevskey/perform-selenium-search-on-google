package test.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Logic extends PageObject {

    @FindBy(xpath = "//*[@id='ires' and contains(.,'Selenium - Web Browser Automation')]")
    private WebElement seleniumText;

    public Logic(WebDriver driver) {
        super(driver);
    }

    public void doSearch() {
        driver.findElement(By.name("q")).sendKeys("selenium" + "\n");
    }

    public void assertSearch() {
        Assert.assertTrue(seleniumText.getText().contains("Selenium - Web Browser Automation"));
    }


}
