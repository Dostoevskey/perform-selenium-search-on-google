package tests.com.google;

import org.testng.annotations.Test;
import test.driver.DriveMaster;
import test.driver.Logic;

public class GoogleSearch extends DriveMaster {

    @Test
    public void doFoundSelenium() throws InterruptedException {
        Logic logic = new Logic(driver);
        logic.doSearch();
        logic.assertSearch();
        logic.doImage();       //Todo Add method doImage.
        logic.assertSearchByImage(); //Todo update assertSearch to be able to work with two steps in TC.
        logic.doReturnToAll();
        logic.assertSearch();

        //ToDo Review one more time 'implicit' && 'explicit'

    }

//  seleniumhq.org
    //        assertTrue((driver.findElement
    //        (By.xpath("//*[@class='rc' and contains(.,'https://www.seleniumhq.org/')]"))),"https://www.seleniumhq.org/");


}
