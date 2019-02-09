package config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


import static config.WebDriverSingleton.getInstance;
import static config.WebDriverSingleton.quit;
import static utility.Screenshot.captureScreenshot;


public class TestConfig {

    WebDriver driver;


    @Before
    public void setUp(){
        String baseUrl = "https://www.amazon.com/";

        driver = getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    public void tearDown(){
        captureScreenshot();
        quit();
    }

}
