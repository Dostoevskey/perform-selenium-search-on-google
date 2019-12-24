package tests.com.google;

import org.testng.annotations.Test;
import test.driver.DriveMaster;
import test.driver.TestLogic;

public class GoogleSearch extends DriveMaster {

    @Test
    public void doFoundSelenium() {
        TestLogic testLogic = new TestLogic(driver);
        testLogic.doSearch();
        testLogic.doImage();
        testLogic.assertSearchByImage();
        testLogic.returnToAllTab();
    }

}
