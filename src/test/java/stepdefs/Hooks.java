package stepdefs;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;

import java.time.Duration;

public class Hooks
{
    public static WebDriver wDriver;

    @Before
    public void SetUp() {
        wDriver = new ChromeDriver();
    }

    @After
    public void TearDown() {
        wDriver.quit();
    }


}

