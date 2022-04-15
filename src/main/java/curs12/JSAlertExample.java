package curs12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JSAlertExample extends BaseTest {


    @Test
    public void testJSAlert() throws InterruptedException {
        driver.findElement(By.cssSelector("button[onclick*=\"Alert\"]")).click();
        Thread.sleep(3000);
        Alert alertJS = driver.switchTo().alert();
        alertJS.accept();
        String resultText = driver.findElement(By.cssSelector("p[id='result']")).getText();
        System.out.println(resultText);
        assertEquals(resultText,"You successfully clicked an alert");


        //driver.switchTo().alert().accept();

        }
    @Test(priority = 1)
    public void testJSCancelAlert() throws InterruptedException {
        driver.findElement(By.cssSelector("button[onclick*=\"Confirm\"]")).click();
        Thread.sleep(3000);

        driver.switchTo().alert().dismiss();
        String resultText = driver.findElement(By.cssSelector("p[id='result']")).getText();
        System.out.println(resultText);
        assertEquals(resultText,"You clicked: Cancel");

    }

    @Test(priority = 2)
    public void testPromptAlert() throws InterruptedException {
        driver.findElement(By.cssSelector("button[onclick*=\"Prompt\"]")).click();
        Thread.sleep(3000);

        Alert alertJS = driver.switchTo().alert();
        alertJS.sendKeys("Test");
        alertJS.accept();
        String resultText = driver.findElement(By.cssSelector("p[id='result']")).getText();
        System.out.println(resultText);
        assertEquals(resultText,"You entered: Test");

    }




}
