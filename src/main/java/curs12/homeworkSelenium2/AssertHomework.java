package curs12.homeworkSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class AssertHomework extends BaseTest {

    @Test
    public void homeworkTwo(){
        WebElement authorLink = driver.findElement(By.partialLinkText("Jassica Mann"));
        authorLink.click();
        assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/team/jassica-mann/");
        WebElement drama = driver.findElement(By.tagName("Drama"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", drama);



    }
}
