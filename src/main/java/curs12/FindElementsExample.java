package curs12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.List;

public class FindElementsExample extends BaseTest {

   // <figure class="sc_image  sc_image_shape_square"><img
    @Test
    public void testFindElements() throws InterruptedException {
        List<WebElement> webElementList = driver.findElements(By.cssSelector("figure[class*=\'sc_image']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;


        for(WebElement element : webElementList){
            jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:10px solid red')", element);

        }
    }

    @Test(priority = 1)
    public void testClickFindElements(){
        List<WebElement> books = driver.findElements(By.cssSelector("h3[class*=\'sc_title']"));
        books.get(2).click();

    }



}
