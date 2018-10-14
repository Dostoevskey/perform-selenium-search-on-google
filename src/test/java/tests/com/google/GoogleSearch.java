package tests.com.google;

import org.testng.annotations.Test;
import test.driver.DriveMaster;
import test.driver.TestLogic;

public class GoogleSearch extends DriveMaster {

    @Test
    public void doFoundSelenium() throws InterruptedException {
        TestLogic testLogic = new TestLogic(driver);
        testLogic.doSearch();
        testLogic.assertSearch();
        testLogic.doImage();       //Todo Add method doImage.
        testLogic.assertSearchByImage(); //Todo update assertSearch to be able to work with two steps in TC.
        testLogic.doReturnToAll();
        testLogic.assertSearch();

        //ToDo Review one more time 'implicit' && 'explicit'

    }

}
