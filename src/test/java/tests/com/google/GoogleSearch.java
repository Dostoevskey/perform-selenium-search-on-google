package tests.com.google;

import org.testng.annotations.Test;
import test.driver.DriveMaster;
import test.driver.Logic;

public class GoogleSearch extends DriveMaster {

    @Test
    public void doFoundSelenium() {
        Logic logic = new Logic(driver);
        logic.doSearch();
        logic.assertSearch();
        logic.doImage();       //Todo Add method doImage.
        logic.assertSearch();  //Todo update assertSearch to be able to work with two steps in TC.
    }

//  seleniumhq.org
    //        assertTrue((driver.findElement
    //        (By.xpath("//*[@class='rc' and contains(.,'https://www.seleniumhq.org/')]"))),"https://www.seleniumhq.org/");


}
