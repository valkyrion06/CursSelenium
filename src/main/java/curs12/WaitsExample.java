package curs12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.BaseTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WaitsExample extends BaseTest {


    @Test
    public void waitExample(){
        driver.findElement(By.tagName("button")).click();
        WebElement finish = driver.findElement(By.id("finish"));


        WebDriverWait waitDriver = new WebDriverWait(driver,10);
        waitDriver.until(ExpectedConditions.textToBePresentInElement( finish,"Hello World!"));

        String result = finish.getText();
        assertEquals(result,"Hello World!");


    }

}
