package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationMenu {

    WebDriver driver;

    public NavigationMenu(WebDriver driver){
        this.driver = driver;

    }

    public By shopLink = By.linkText("BOOKS");
    public By homeLink = By.linkText("HOME");
    public By contactLink = By.linkText("CONTACTS");
    public By loginLink = By.linkText("Login");

    public void navigateTo(By locator){
        driver.findElement(locator).click();

    }

}
