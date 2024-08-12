package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.AfterClass;
import java.time.Duration;

public class Hooks
{
    public static WebDriver wDriver;
    //Every scenario before Hook and after Hook will execute
    //just like before method and after method
    @Before
    public void SetUp()
    {
        wDriver = new ChromeDriver();
    }

    @After
    public void TearDown()
    {
        wDriver.quit();
    }

}

