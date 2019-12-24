package test.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


/**
 * The class Test logic.
 */
public class TestLogic extends PageObject {

    /**
     * Instantiates a new Test logic.
     *
     * @param driver the driver.
     */
    public TestLogic(WebDriver driver) {
        super(driver);
    }

    /**
     * The FindBy searchResult.
     */
    @FindBy(css = "div[id='search']")
    private WebElement searchResult;

    /**
     * The FindBy imagesTab.
     */
    @FindBy(css = "div[id='hdtb-msb-vis'] div:nth-child(2) a")
    private WebElement imagesTab;

    /**
     * The FindBy searchField.
     */
    @FindBy(name = "q")
    private WebElement searchField;

    /**
     * The FindBy imageElement.
     */
    @FindBy(css = "div[class='irc_it'] a[dir='ltr']")
    private WebElement imageElement;

    /**
     * The FindBy listOfImages.
     */
    @FindBy(css = "#rg_s > div:nth-child(2)")
    private WebElement listOfImages;

    /**
     * The FindBy allTab.
     */
    @FindBy(css = "#hdtb-msb-vis div:nth-child(1) a")
    private WebElement allTab;

    /**
     * The constant TEXT.
     */
    private static final String TEXT = "Selenium";


    /**
     * The method doSearch.
     */
    public void doSearch() {
        searchField.sendKeys(TEXT + "\n");
        Assert.assertTrue(searchResult.getText().contains(TEXT));
    }

    /**
     * The method Do image.
     */
    public void doImage() {
        imagesTab.click();
    }

    /**
     * The method assertSearchByImage.
     */
    public void assertSearchByImage() {
        listOfImages.click();
        Assert.assertTrue(imageElement.getText().contains(TEXT));
    }

    /**
     * The method returnToAllTab.
     */
    public void returnToAllTab() {
        allTab.click();
    }

}
