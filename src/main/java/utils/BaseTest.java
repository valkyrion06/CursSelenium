package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver100.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://keybooks.ro/");
        //driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.close();
    }

}

