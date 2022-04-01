package curs11.homeworkSelenium1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SiteLogin {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://keybooks.ro/");

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.close();
        //Thread.sleep(5000);
    }
    @Test
    public void logIn() throws InterruptedException {
        //<a href="#popup_login" class="popup_link popup_login_link icon-user inited" title="">Login</a>
        WebElement logInText = driver.findElement(By.className("menu_user_login"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", logInText);
        logInText.click();

        WebElement logInTextArea = driver.findElement(By.name("log"));
        WebElement passwordTextArea = driver.findElement(By.name("pwd"));
        WebElement logInButton = driver.findElement(By.className("submit_button"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", logInTextArea);
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", passwordTextArea);
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:2px solid red')", logInButton);
        //Thread.sleep(3000);
        logInTextArea.sendKeys("TestUser");
        //Thread.sleep(3000);
        passwordTextArea.sendKeys("12345@67890");
        //Thread.sleep(2000);
        logInButton.click();




    }

}
