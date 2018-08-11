package tests.com.google;

//public class SeleniumSearch {
//
////@Test
////    public void doSeleniumSearchInGoogleTest() {
////    DriveMaster driveMaster = new driveMaster();
////    driveMaster.get
//
//
//
//}
//
//
//
//
//}

//    public static void main(String[] args) throws Exception {
//
//    }
//
//    DriveMaster.get("https://www.google.com");


//
//public class DriverMaster {
//
//    private static WebDriver driver;
//
//    private DriverMaster() {
//    }
//
//    @BeforeTest(alwaysRun = true)
//    public static WebDriver getDriver() {
//        if (driver == null) {
//            driver = new ChromeDriver();
//        }
//        return driver;
//    }
//
//    @AfterTest(alwaysRun = true)
//    public void stop() {
//        if (driver != null) {
//            driver.close();
//        }
//        driver = null;
//    }
//}
//
//
//
////    @Test
////    public void doSearchTest() {
////        driver.get("http://www.google.com");
////        driver.findElement(By.name("q")).sendKeys("Webdriver" + "\n");
////        Assert.assertEquals(driver.getTitle(), "Webdriver - Поиск в Google");
////    }