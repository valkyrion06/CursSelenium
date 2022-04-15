package curs13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.List;

public class CSSSelector extends BaseTest {

    @Test
    public void cssExamples1() {
        WebElement popup = driver.findElement(By.cssSelector("#menu_user")); // by id -> id= (#)
        System.out.println(popup.getText());

        WebElement logoslogan = driver.findElement(By.cssSelector(".logo_slogan")); // by class -> class= (.)
        System.out.println(logoslogan.getText());

        //contains
        WebElement title = driver.findElement(By.cssSelector("div[class*=\"sc_column_item_4\"]>h3>a[href=\"the-long-road-to-the-deep-silence\"]"));
        System.out.println(title.getText());

        //containsWord e chestia asta '~'
        //starts with "^"
        //ends with "$"
        //not
        List<WebElement> tabs = driver.findElements(By.cssSelector("li[class*=\"sc_tabs_title\"]:not([area-selected=true])"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", tabs);

        //nth-child li[class*=["sc_tabs_title"]:nth-child(4)

        WebElement child4th = driver.findElement(By.cssSelector("li[class*=[\"sc_tabs_title\"]:nth-child(4)"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", child4th);




    }

}
