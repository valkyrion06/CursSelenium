package curs12.homeworkSelenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class JSAlertHomework extends BaseTest {

@Test
    public void homeworkOne() throws InterruptedException {
    WebElement theSon = driver.findElement(By.partialLinkText("The forest"));
    theSon.click();
    String link = driver.getCurrentUrl();
    assertEquals(link,"https://keybooks.ro/shop/the-forest/");


    Thread.sleep(3000);
    WebElement reviews = driver.findElement(By.partialLinkText("Reviews"));
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", reviews);
    Actions actions = new Actions(driver);
    //actions.moveToElement(reviews).click();


    reviews.click();

    /*
    Problema este cand vine vorba de reviews.click() imi spune ca elemnet not intractable.
     */

    WebElement submit = driver.findElement(By.id("submit"));

    submit.click();
    Alert alertJS = driver.switchTo().alert();
    alertJS.accept();
    WebElement addToCart = driver.findElement(By.name("add-to-cart"));
    //jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", alertJS);
    addToCart.click();
    WebElement message = driver.findElement(By.className("woocommerce-message"));
    jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", message);
    message.isDisplayed();
    System.out.println("Works");



}

}
