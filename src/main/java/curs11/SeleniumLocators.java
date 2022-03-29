package curs11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class SeleniumLocators {


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
    public void linkTestLocator(){

       // <a href="https://keybooks.ro/shop/">Books</a>
        WebElement booksLink = driver.findElement(By.linkText("BOOKS"));
        booksLink.click();
        //No Such Element Exception: nu poate sa identifice elementul.
        assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");

        //<a href="https://keybooks.ro/shop/cooking-with-love/">Cooking with love</a>

    }

    @Test (priority = 1)
    public void partialLinkTextLocator(){
        WebElement cookingBookLink = driver.findElement(By.partialLinkText("Cooking"));
        cookingBookLink.click();

        String actualPageURL = driver.getCurrentUrl();
        assertEquals(actualPageURL,"https://keybooks.ro/shop/cooking-with-love/");
    }

    @Test (priority = 2)
    public void classNameLocator(){
        WebElement price = driver.findElement(By.className("price"));
        assertTrue(price.isDisplayed());
        String priceValue = price.getText();
        System.out.println(priceValue);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", price);

    }

    @Test(priority = 3)
    public void idLocator() throws InterruptedException {
        /*<li class="reviews_tab" id="tab-title-reviews" role="tab" aria-controls="tab-reviews">
					<a href="#tab-reviews">
                Reviews (1)					</a>
			</li>*/
        WebElement id = driver.findElement(By.id("tab-title-reviews"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", id);
        Thread.sleep(3000);
        id.click();
    }

    @Test(priority = 4)
    public void xPathLocator() throws InterruptedException {
       /* <textarea id="comment" name="comment" cols="45" rows="8" required=""></textarea> */
        WebElement commentBox = driver.findElement(By.xpath("//textarea[@id='comment']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", commentBox);
        Thread.sleep(3000);
        commentBox.sendKeys("My Comment");

    }

    @Test(priority = 5)
    public void nameLocator() throws InterruptedException {
        //<input id="author" name="author" type="text" value="" size="30" required="">
        WebElement nameBox = driver.findElement(By.name("author"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", nameBox);
        nameBox.sendKeys("Test Name");
        Thread.sleep(3000);
        nameBox.clear();
        Thread.sleep(3000);
        nameBox.sendKeys("Another Name");

    }

    @Test(priority = 6)
    public void cssLocator() throws InterruptedException {
        WebElement emailBox = driver.findElement(By.cssSelector("input[type='email']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", emailBox);
        emailBox.sendKeys("email@email.com");
        Thread.sleep(3000);

    }


}
