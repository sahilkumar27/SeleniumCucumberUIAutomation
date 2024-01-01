package utility;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    public static BrowserDriver driver;

    public static ChromeOptions options;

    //    it will run before the test cases actually gets performed
    @Before
    public void setUp(){
        driver = new BrowserDriver();
    }

    //  After the test cases is completed there is a first script this tear down will be called which is driver will be closed
    @After
    public void tearDown(){
        driver.close();
    }
}
